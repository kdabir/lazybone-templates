My Lazybones Templates
----------------------

This repository hosts some project Templates (boilerplate setup) that can be used using [Lazybones].

#### Currently available project template(s)

* [Gaelyk Template](#creating-a-gaelyk-project-using-the-template)
* [Groovy Lib Template](#creating-a-groovy-library-using-the-template)
* [Java Lib Template](https://github.com/kdabir/lazybone-templates/blob/master/templates/java-lib)
* [Java App Template](https://github.com/kdabir/lazybone-templates/blob/master/templates/java-app)
* [Sinatra Haml Sass & Coffee Template](https://github.com/kdabir/lazybone-templates/blob/master/templates/sinatra-haml-sass-coffee)

## Usage

1. Add following snippet to `~/.lazybones/config.groovy` (If this dir/file doesn't exist, create it)

      ```groovy
      bintrayRepositories = [
            "pledbrook/lazybones-templates",
            "kdabir/templates"
      ]
      ```

2. Do a `lazybones list` to see available templates

3. Create an app from template (use `--with-git`)
    `lazybones create <template-name> <version> <dir-name> --with-git`

> Note: If you don't have [lazybones] installed, install that first :
>
> 1. Install gvm `curl -s get.gvmtool.net | bash`
>
> 2. Install lazybones via gvm `gvm install lazybones`


### Creating a Gaelyk Project using the template

* Enter the following command:

        $ lazybones create gaelyk 2.0.1 my-gaelyk-project --with-git

* You will be asked few questions, answering those is optional. If you don't provide any input, the default value in the square brackets `[ ]` will be used.

        Creating project from template gaelyk 2.0.1 in 'my-gaelyk-project'
        Define value for'app_id' [gaelyk-app]: my-awesome-app
        Define value for 'app_version' [1]:
        Define value for 'gae_version' [1.8.8]:

* That's it. From the newly created directory:

        $ cd my-gaelyk-projet

* You can now run your [gaelyk] app locally:

        $ ./gradlew gaeRun

* and test it at `http://localhost:8080`

[More Details](https://github.com/kdabir/lazybone-templates/blob/master/templates/gaelyk)

### Creating a Groovy Library using the template

* Enter the following command

        $ lazybones create groovy-lib 0.2 my-lib-project --with-git                                                                                                                          10:31PM

* You have option to provide `group` and `version`. If you don't provide any input, the default value in the square brackets `[ ]` will be used.

        Creating project from template groovy-lib 0.2 in 'my-lib-project'
        Define value for 'group' [org.example]: com.mycompany
        Define value for 'version' [0.1]:

* Your project is ready in the `my-lib-project` with gradle wrapper in it.

[More details](https://github.com/kdabir/lazybone-templates/blob/master/templates/groovy-lib)


## Installing Templates via source

Clone this Github repo and execute the following Gradle tasks based on what you want to do :

* Package and install individual template

        ./gradlew installTemplateGroovyLib
        ./gradlew installTemplateSinatraHamlSassCoffee

* Package and install all the templates locally with the command:

        ./gradlew installAllTemplates

* Test the locally installed template using

        lazybones create groovy-lib 0.1 sample-app
        lazybones create sinatra-haml-sass-coffee 0.1 sample-app

* To publish individual template

        ./gradlew publishTemplateGroovyLib
        ./gradlew publishTemplateSinatraHamlSassCoffee

* To publish all templates

        ./gradlew publishAllTemplates


### To Create a New Template

* execute `TERM=dumb ./gradlew createTemplate`, OR execute `TERM=dumb ./gradlew createGradleProjectTemplate`,
    which will ask you to enter the directory/project name (give a hyphenated-one and not TitleCase)
    * It creates a new dir in `templates` dir
    * adds `README.md` with header
    * adds `VERSION file` with 0.1 version
    * and adds `lazybones.groovy` Post processor
    * if creating Gradle project, creates a `build.gradle`

* Populate it (the generate dir) with template content,
* Install locally using `installTemplate<TemplateName>`
* Test locally using `lazybones create template-name <version> sample-app`
* Publish using `publishTemplate<TemplateName>`


You can find out more about creating templates on [Lazybones' GitHub wiki][template-dev-guide].


[template-dev-guide]: https://github.com/pledbrook/lazybones/wiki/Template-developers-guide           "Template Developer Guide"
[lazybones]: https://github.com/pledbrook/lazybones                                                   "Lazybones Home"
[gaelyk]: http://gaelyk.appspot.com                                                                   "Gaelyk"
