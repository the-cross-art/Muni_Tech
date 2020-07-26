# Muni_Tech


![ezgif com-optimize](https://user-images.githubusercontent.com/63959831/88054917-c41ef300-cb7b-11ea-80ae-f660e9b98347.gif)
<br /><br />
See Our Explanatory Video-https://drive.google.com/file/d/1Qyrb-48Z66u1RqV85uib4WqcHATaAYPi/view
<br />
See our Website Explanatory Video-https://drive.google.com/file/d/1SYnOW0OcR2NYtsOtdAogrACbv1mmjLnh/view<br />
Application Apk bundle Link-https://docs.google.com/uc?export=download&id=1G71ETONKxaxQoCJoykRUK6kXDg4BfV37 <br />
WebSite Link-https://munitechnova.herokuapp.com/

Work Status-<br />
          Website Progress-100%<br />
          Android App Progree-100%<br />

The whole procedure of complaining about a particular issue and then resolution of the same by the Municipality is quite hectic and complex. 
In order to speed up this process and make things transparent we have developed our Web Application Muni-Tech.
Through this platform any individual can just upload the picture of a place which is poorly maintained and not been taken care of, leading to it's detrimental condition.
The platform would simultaneously record the location from where the picture has been uploaded and would notify the municipality.
The municipality after completing it's required task would upload the picture of the same place as to how it looks after they have done their work.
In this way the whole procedure of municipality works would get easier and less time consuming. Moreover the work of the municipality would become very much transparent.
The spirit of self reliance and self help would be imbibed by the people henceforth because they would be responsible for their welfare. <br />
Further Devlopment Include <br />
Any individual can start a campaign regarding cleaning local places. Local Volunteers along with municipality can decide a fixed date with the help of the app and help cleaning the places which not only led to the cleaning of the environment but in a people unified Atamnirbhar.<br />

WebSite Link-https://munitechnova.herokuapp.com/<br />
Application Apk bundle Link-https://docs.google.com/uc?export=download&id=1G71ETONKxaxQoCJoykRUK6kXDg4BfV37 <br />

Instruction and configuration to use App-<br />
Munitech app<br />

Package Name - com.munitech<br />
Version-2.0<br />
Min api level- 21<br />
Min sdk- 17<br />
Permissions- internet,gps,microphone,speaker,vibration,local storage,camera.<br /><br />



Sideload apk files<br />

Before you actually sideload a file, you’ll need to enable the feature. For security, Android prevents you from installing apps that come from outside Google Play. This prevents you from inadvertently installing a malicious file, but you can override it.<br />
The process for doing so depends slightly on your version of Android. If you don’t plan to sideload often, for safety we recommend turning this setting off after installing your app.<br />

On Android 7.x  Naugat and older<br /><br />

In older versions of Android, sideloading is an all-or-nothing toggle. You simply need to flip a switch to enable installing apps from anywhere.
To do so, head to Settings > Security. You’ll see an entry on this page labeled Unknown sources. Toggle this on, and your phone will display a warning that your device is more vulnerable to attack with this setting on. We’ll discuss this shortly; tap OK to accept it for now.<br />

On Android 8.x and newer<br /><br />

On newer versions of Android, Google made a change to sideloading to increase security. Now, you must toggle the Unknown sources option per-app instead of globally. This allows you to install from certain apps you often use while keeping others blocked.<br />
To toggle this, open Settings > Apps & notifications. Expand the Advanced section at the bottom and tap Special app access. On the resulting menu, scroll down and choose Install unknown apps.
You’ll see a list of apps on your device that have the capability to install other apps. Select the one you want to install apps through, such as your browser, cloud storage, or file explorer. Then enable the Allow from this source slider.<br />
<br />
Methods of Installing anonymous apk<br />
<br />
Method 1: Install APKs Directly on Android<br />
<br />
You can sideload apps directly from your browser on Android. Simply open a page that offers APKs and download it. You’ll see a warning that the APK can harm your device; tap OK to proceed.
Once it downloads, you’ll see a little banner with a shortcut to open it. Tap Open and you can install the app. If you miss it, you can tap the Download notification or open your Downloads app to reach it.
Once installed, just open it like any other app and you’re good to go.<br />
<br />
Method 2: Install APKs on Android via USB Transfer.<br />
<br />
This is the least convenient method, but it still works if you don’t want to use the above for whatever reason.<br />
Download the APKs you want to install onto your computer. Then plug your phone into your computer with a USB cable. You may need to tap the notification on your device and change the connection type to Transfer files if your computer doesn’t detect it.<br />
Open This PC and transfer the APK files onto your device. It’s a good idea to create a new folder to keep them all in one place. Transfer them, then you can disconnect the cable. (If you prefer, you can also connect your phone to your PC through Bluetooth and transfer the files that way.)
To install your apps, open your Android file explorer and browse to the folder with the APKs. Tap on each to install them, which results in a screen just like installing from a browser.<br />


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

