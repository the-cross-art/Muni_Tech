# Muni_Tech


![ezgif com-optimize](https://user-images.githubusercontent.com/63959831/88054917-c41ef300-cb7b-11ea-80ae-f660e9b98347.gif)
<br /><br />
See Our Explanatory Video-https://drive.google.com/file/d/1Qyrb-48Z66u1RqV85uib4WqcHATaAYPi/view
<br />
WebSite Link-https://munitechnova.herokuapp.com/

Work Status-<br />
          Website Progress-75%<br />
          Android App Progree-25%<br />

The whole procedure of complaining about a particular issue and then resolution of the same by the Municipality is quite hectic and complex. 
In order to speed up this process and make things transparent we have developed our Web Application Muni-Tech.
Through this platform any individual can just upload the picture of a place which is poorly maintained and not been taken care of, leading to it's detrimental condition.
The platform would simultaneously record the location from where the picture has been uploaded and would notify the municipality.
The municipality after completing it's required task would upload the picture of the same place as to how it looks after they have done their work.
In this way the whole procedure of municipality works would get easier and less time consuming. Moreover the work of the municipality would become very much transparent.
The spirit of self reliance and self help would be imbibed by the people henceforth because they would be responsible for their welfare. <br />
Further Devlopment Include <br />
Any individual can start a campaign regarding cleaning local places. Local Volunteers along with municipality can decide a fixed date with the help of the app and help cleaning the places which not only led to the cleaning of the environment but in a people unified Atamnirbhar.

WebSite Link-https://munitechnova.herokuapp.com/

The app runs completely on Django server hosted on herokuapp.<br />To gain Admin Access<br />
Enter the given Information.<br />
Username : mangNOVA<br />
Password : 1234<br />

Read Instructions for opening the link:<br />
1. Go to 'UPLOAD IMAGE' for registering your complain.<br />
2. Enter your name,location,complain & upload the image.<br />
3. To get the exact location you can click on the 'Enter Location' hyperlink and get your geo-coordinates.<br />
4. The app would send the complain filed through an email notification.<br />
5. You can get the status to your complain in 'CONTENT BOX' page. <br />
6. Moreover the admin section(municipal coorporation in this case) will have all the access.<br /><br />

Steps requird to run the website in local machine-<br /><br />
step1-Create local Enviorment in Your Machine :<br />
    python -m venv (env_name)<br /><br />
Step2-Start virtual Enviornment<br />
    (env_name)\Scripts\activate<br /><br />
Step3-<br />
    1. Install stable version
    Install:

    pip install python

    pip install django

    pip install requests

    pip install Pillow



    2. Using the admin
    The admin theme requires Django >= 3.0.7...

    Add basic to INSTALLED_APPS in settings.py:

    INSTALLED_APPS = [
        'django.contrib.admin',
        'django.contrib.auth',
        'django.contrib.contenttypes',
        'django.contrib.sessions',
        'django.contrib.messages',
        'django.contrib.staticfiles',
        'basic',
    ]


    3. Model utilities
    Model class inheriting fields:
    name
    address
    pic
    backpic

    Which use respectively models.Charfield,models.Textfield and models.Imagefield from models


    5. Settings

    MEDIA_ROOT =  os.path.join(BASE_DIR, 'media')

    You also need to add the following url to your project urls.py:

    if settings.DEBUG:
        urlpatterns += static(settings.MEDIA_URL,
                              document_root=settings.MEDIA_ROOT)


    6. Installing for development
    Install sqlite:

    sudo apt-get install sqlite3 libsqlite3-dev
    Install your forked repo:

    git clone git:https://github.com/the-cross-art/Muni_Tech.git
    python setup.py develop
Install test requirements:

pip install 
Create database:

cd tests/
./python manage.py migrate
./python manage.py createsuperuser
Run development server:

cd tests/
./python manage.py runserver
You can access the admin interface of the test project at http://127.0.0.1:8000/admin/.

