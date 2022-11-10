from .models import *
from django.forms import ModelForm
from django import forms


class NewsForm(ModelForm):
    class Meta:
        model = News
        fields = "__all__"
class ContactForm(forms.Form):
    from_email = forms.EmailField(label='Email', required=True)
    subject = forms.CharField(label='About', required=True)
    message = forms.CharField(label='Message', widget=forms.Textarea, required=True)
