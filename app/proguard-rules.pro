# Add project specific ProGuard rules here.
# By default, the flags in this file are appended to flags specified
# in /usr/local/android-sdk-macosx/tools/proguard/proguard-android.txt
# You can edit the include path and order by changing the proguardFiles
# directive in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# Add any project specific keep options here:

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Retrofit
-dontwarn retrofit2.**
-keep class retrofit2.** { *; }
-keepattributes Signature
-keepattributes Exceptions

# Picasso
-dontwarn com.squareup.okhttp.**

# for: debug minifyEnabled true
#  seems needed for running instrumentated unit test; prevents lots of warnings, test-build failure: Execution failed for task ':app:transformClassesAndResourcesWithProguardForDebug'
-dontwarn rx.**
-dontwarn okio.**
#  these don't seem able to prevent more warnings, test-build failure: Execution failed for task ':app:transformClassesAndResourcesWithProguardForDebugAndroidTest'
#-dontwarn android.support.**
#-dontwarn android.support.test.runner.**
#-dontwarn org.junit.**
