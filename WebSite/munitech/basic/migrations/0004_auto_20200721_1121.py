# Generated by Django 3.0.7 on 2020-07-21 05:51

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('basic', '0003_auto_20200719_2329'),
    ]

    operations = [
        migrations.AddField(
            model_name='all_info_form',
            name='address',
            field=models.TextField(default='Location not given'),
        ),
        migrations.AddField(
            model_name='all_info_form',
            name='name',
            field=models.CharField(default='Anonymous', max_length=40),
        ),
    ]