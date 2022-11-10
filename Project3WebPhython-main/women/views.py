
from django.shortcuts import  get_object_or_404


from django.core.mail import send_mail, BadHeaderError
from django.http import HttpResponse
from django.shortcuts import  redirect

from rest_framework import generics

from django.http import HttpResponseRedirect
from django.shortcuts import render

from .permissions import IsAdminOrReadOnly, IsOwnerOrReadOnly
from .serializers import WomenSerializer
from .forms import *


class WomenAPIList(generics.ListCreateAPIView):
    queryset = Women.objects.all()
    serializer_class = WomenSerializer



class WomenAPIUpdate(generics.RetrieveUpdateAPIView):
    queryset = Women.objects.all()
    serializer_class = WomenSerializer
    permission_classes = (IsOwnerOrReadOnly, )


class WomenAPIDestroy(generics.RetrieveDestroyAPIView):
    queryset = Women.objects.all()
    serializer_class = WomenSerializer
    permission_classes = (IsAdminOrReadOnly, )










def entry(request):
    if request.method == 'POST':
        form = BeastForm(request.POST, request.FILES)

        if form.is_valid():
            form.save()
            return HttpResponseRedirect("/")
    else:
        form = BeastForm()

    return render(request, "BonusTask_app/entry.html", {
        "form": form
    })


def show_post(request, post_slug):
    post = get_object_or_404(Women, slug=post_slug)

    context = {
        'post': post,
        'title': post.title,

    }

    return render(request, 'BonusTask_app/post.html', context=context)


def home(request):
    posts = Women.objects.all()

    context = {
        'posts': posts,
        'title': 'Главная страница',

    }

    return render(request, "BonusTask_app/home.html", context=context)


def contact_view(request):
    if request.method == 'GET':
        form = ContactForm()
    elif request.method == 'POST':
        # если метод POST, проверим форму и отправим письмо
        form = ContactForm(request.POST)
        if form.is_valid():
            subject = form.cleaned_data['subject']
            from_email = form.cleaned_data['from_email']
            message = form.cleaned_data['message']
            try:
                send_mail(f'{subject} от {from_email}', message,
                          '200103346@stu.sdu.edu.kz',
              ['aibekseitzhan002@gmail.com'],   fail_silently=False)
            except BadHeaderError:
                return HttpResponse('Ошибка в теме письма.')
            return redirect('success')
    else:
        return HttpResponse('Неверный запрос.')
    return render(request, "BonusTask_app/sendMessage.html", {'form': form})


def success_view(request):
    return HttpResponse('Приняли! Спасибо за вашу заявку.')




def addpage(request):
    if request.method == 'POST':
        form = AddPostForm(request.POST, request.FILES)
        if form.is_valid():
            # print(form.cleaned_data)
            try:
                Women.objects.create(**form.cleaned_data)
                return redirect('home')
            except:
                form.add_error(None, 'Ошибка добавления поста')

    else:
        form = AddPostForm()
        return render(request, 'BonusTask_app/addpage.html', {'form': form, 'title': 'Добавление статьи'})

