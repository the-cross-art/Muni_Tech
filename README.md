# Muni_Tech


![ezgif com-optimize](https://user-images.githubusercontent.com/63959831/88054917-c41ef300-cb7b-11ea-80ae-f660e9b98347.gif)

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
The spirit of self reliance and self help would be imbibed by the people henceforth because they would be responsible for their welfare.

WebSite Link-https://munitechnova.herokuapp.com/

The app runs completely on Django surver hosted on herokuapp.To gain Admin Access
Enter the given Information.
Username : mangNOVA
Password : 1234

Steps requird to run the website in local machine-
step1-Create local Enviorment in Your Machine :
    python -m venv (env_name)
Step2-Start virtual Enviornment
    (env_name)\Scripts\activate
Step3-
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

