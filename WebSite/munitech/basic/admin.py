from django.contrib import admin
from .models import all_info_form


# Register your models here.
class Formadmin(admin.ModelAdmin):
    list_display = ('name','address','complain')

admin.site.register(all_info_form,Formadmin)