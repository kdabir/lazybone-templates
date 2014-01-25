Java Application Project Template
---------------------------------

You have just created a Java Application project. This project can be built and run using Gradle.

What all has been already taken care for you:

* A boilerplate `build.gradle`
* Application plugin applied to run and generate distributable zip of your application
* Generates a main class for you, just do a `gradle run`
* Simpler directory structure
* Easily generate IntelliJ Idea project files with `gradle idea`
* Travis CI integration ready (a smart `.travis.yml` included)
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

* A simpler directory structure is suitable for a app where you don't have webapp/resources etc.
* Generate wrapper using `gradle wrapper`