from django.contrib import admin
from django.urls import path,include
from . import views
urlpatterns = [
    path('',views.index,name='index'),
    path('index/',views.index,name='index'),
    path('about/',views.aboutus,name='about'),
    path('upload/',views.upload,name='upload'),
    path('location/',views.location,name='location'),
    path('contentbox/',views.contentbox,name='contentbox'),
]