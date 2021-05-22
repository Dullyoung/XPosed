# xposed hook
## Quick Start
 - add xpose meta-data which is necessary
    - xposedmodule , value true
    - xposeddescription,  the desp about your module
    - xposedminversion the xposed version of your used
    ```xml
     <meta-data
                 android:name="xposedmodule"
                 android:value="true" />
             <meta-data
                 android:name="xposeddescription"
                 android:value="desp" />
             <meta-data
                 android:name="xposedminversion"
                 android:value="89" />
    ```

 - add dependencies in **build.gradle** in your **app**
   
    ```groovy
    compileOnly 'de.robv.android.xposed:api:82'
    ```

    higher gradle pulgin use **compileOnly**, lower user **prvided**
    
 - create xposed_init file in assets and input your file's **path from source root**  which implements IXposedHookLoadPackage like:

    my XpodeInit.java file is : 

    ```java
    package com.dullyoung.xposed;`
    public class XposedInit implements IXposedHookLoadPackage{`
    ...
    }
    ```

    then you can edit the  xposed_init file like this:

    ```java
    com.dullyoung.xposed.XposedInit
    ```

    then run your app ,and run the xposed installer,
    you can see your mudule in xposed installer app's mudules part
    Enable it and reboot your devices,then your xposed app is working.


