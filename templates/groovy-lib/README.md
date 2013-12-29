Groovy Library Project Template
-------------------------------

You have just created a Groovy library project. This project can be built using Gradle.

What all has been already taken care for you:

* A boilerplate `build.gradle`
* Simpler directory structure
* Gradle wrapper included - No gradle installation required and great for CI servers too
* Travis CI integration ready (a smart `.travis.yml` included)
* Bintray maven publish integration for your library (.jar)
* Comprehensive `.gitignore` - so that unnecessary files don't get checked in
* Uses jcenter (faster) maven repo

You project looks like :

```
  project/
    |--+ src/            (put your groovy source files here)
    |--+ test/           (groovy test files go here)
    |--+ build.gradle    (build script)
    |--+ .gitignore      (common patterns already included)
    |--+ .travis.yml     (travis configuration for continuous integration of your library)
    |--+ gradle/         (don't worry about it)
    |--+ gradlew         (on *nix run commands using ./gradlew <command>)
    |--+ gradlew.bat     (on win run commands using gradlew.bat <command>)
```


Notes:

* A simpler directory structure is suitable for a library where you don't have webapp/resources etc.
* When you need to publish your library to Bintray, set bintrayUser & bintrayKey in gradle.properties