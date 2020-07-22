from django.db import models


# Create your models here.

class all_info_form(models.Model):
    name = models.CharField(max_length=40,default='Anonymous')
    address = models.TextField(default="Location not given")
    complain = models.TextField(default="")
    pic = models.ImageField(upload_to="media/",default="")
    backpic = models.ImageField(upload_to="media/",default='')

    def __str__(self):
        return self.name