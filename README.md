Introducing Kotlin For Android Development
==========================================

## Demo app for AnDevCon Boston 2016 class
#### Search iTunes for albums (to display, not download)

The app demonstrates Kotlin code working with the popular Java libraries Dagger 2, Retrofit 2 and
RxJava/RxAndroid.

<img src="DemoAppSreenshot.png" width="240" height="420" />

The no-frills but functional app allows the user to search for albums with the Search icon in the
action bar, enter a search term such as name of an artist or band, then search with the soft
keyboard's search icon. The found albums' text descriptions and thumbnail images are displayed in
a scrollable list.

Fetched entries are cached, so orientation changes do not necessitate making the api call to the
iTunes REST service again.

We converted the *AlbumSearchActivity* class to Kotlin from Java. For simplicity, the rest of the
demo app is left in Java.

We wrote a small Android instrumented unit test in Java, which tests the *AlbumSearchActivity* class
written in Kotlin.

Acknowledgement -- We used as starting point Mike Gouline's "Dagger 2 Demo" app that can be found at
[Android Samples repo](https://github.com/mgouline/android-samples), and then built it out.
Refer to the comments in the main AlbumSearchActivity.kt class for some background and other
acknowledgements.
