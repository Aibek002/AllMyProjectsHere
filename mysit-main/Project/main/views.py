
from django.core.mail import send_mail, BadHeaderError
from django.http import HttpResponse
from django.shortcuts import redirect

from django.shortcuts import render

from .forms import *

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
                          [f'{from_email}'], fail_silently=False)
            except BadHeaderError:
                return HttpResponse('Ошибка в теме письма.')
            return redirect('success')
    else:
        return HttpResponse('Неверный запрос.')
    return render(request, "main/sendMessage.html", {'form': form})
def success_view(request):
    return HttpResponse('Приняли! Спасибо за вашу заявку.')

def insert(request):
    error = ''
    if request.method == 'POST':
        form = NewsForm(request.POST)
        if form.is_valid():
            form.save()
            return redirect('/news')
        else:
            error = 'Форма была неверной'

    form = NewsForm()
    data = {
        'form': form,
        'error': error
    }
    return render(request, 'main/insert.html', data)


def news(request):
    new = News.objects.order_by('-id')
    return render(request, 'main/viewsNews.html', {'news': new})
