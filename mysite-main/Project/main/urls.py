from django.urls import path
from . import views

urlpatterns = [


    path('contact/', views.contact_view, name='contact'),
    path('insert', views.insert, name='insert'),
    path('success', views.success_view, name='success'),
    path('', views.news, name='news'),
]
