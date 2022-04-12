### SpatiuToaster
 
 #### Description

       Alerts Library for android developer ( Java | Kotlin )
       ![Spatuo Toaster](https://user-images.githubusercontent.com/53666445/162853794-f23cf120-cd33-44c3-8504-5d9b289781db.png)

       
  
  [![](https://jitpack.io/v/MusabEltijani/SpatiuToaster.svg)](https://jitpack.io/#MusabEltijani/SpatiuToaster)
  
#### Implementation
     
     Step 1. Add the JitPack repository to your build file
     
      Add it in your root build.gradle at the end of repositories:
     
          allprojects {
              repositories {
              ...
              maven { url 'https://jitpack.io' }
              }
          }
    
     Step 2. Add the dependency
    
      dependencies {
            implementation 'com.github.MusabEltijani:SpatiuToaster:0.0.1'
      }
    
    
     Step 3. Add Spatiu Meassge Class in your code use 
       
       SpatiuMeassge.toaster(context, message, status);
       
       Context context = android context or getApplicationContext 
       String message = your alert meassge 
       int status = alert status 
       
              - alert status 
              
                 SUCCESS = 1
                 ERROR = 2
                 WAITING = 3
                 WARNING = 4
