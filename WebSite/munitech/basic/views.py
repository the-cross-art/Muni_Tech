from django.shortcuts import render,redirect
from .models import all_info_form
from datetime import datetime
from django.contrib import messages
from django.http import HttpResponse
import smtplib


# Create your views here.
def aboutus(request):
    return render(request,'Modified_files/aboutus.html')
def index(request):
    return render(request,'Modified_files/index.html')

def contentbox(request):
    writer = all_info_form.objects.all()
    #p = writer[0].pic
    #print(p.url)
    return render(request, 'Modified_files/contentbox.html',{'writer': writer})

def upload(request):
    if request.method == 'POST':
        name = request.POST.get('name')
        #print(name)
        address = request.POST.get('address')
        complain = request.POST.get('complain')
        #print("Files uploaded")
        photo = request.FILES['image']
        form = all_info_form(pic = photo,name=name,address=address,complain=complain)
        form.save()
        messages.success(request, 'Your Complaint has been sent.')
        #x = smtplib.SMTP('smtp.gmail.com', 587)
        #x.starttls()
        #x.login('your mail id', 'password')
        #message = "A complain is being registered"
        #x.sendmail('shrutik0219@gmail.com', 'shrutik1720@gmail.com', message)
        #print("Message sent")
    return render(request,'Modified_files/upload.html')

def success(request):
    return render(request,'Modified_files/contentbox.html')

def location(request):
    return render(request,'Modified_files/location.html')