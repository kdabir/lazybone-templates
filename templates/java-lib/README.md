Java Library Project Template
-----------------------------

You have just created a Java library project. This project can be built using Gradle.

What all has been already taken care for you:

* A boilerplate `build.gradle`
* Simpler directory structure
* Easily generate IntelliJ Idea project files with `gradle idea`
* Travis CI integration ready (a smart `.travis.yml` included)
* Bintray maven publish integration for your library (.jar)
* Comprehensive `.gitignore` - so that unnecessary files don't get checked in. (generated if --with-git is used)
* Uses jcenter (faster) maven repo

You project looks like :

```
  project/
    |--+ src/            (put your Java source files here)
    |--+ test/           (Java test files go here)
    |--+ build.gradle    (build script)
    |--+ .gitignore      (common ignore patterns already included)
    |--+ .travis.yml     (travis configuration for continuous integration of your library)
```


Notes:

* A simpler directory structure is suitable for a library where you don't have webapp/resources etc.
* When you need to publish your library to Bintray, set bintrayUser & bintrayKey in gradle.properties
* Generate wrapper using `gradle wrapper`