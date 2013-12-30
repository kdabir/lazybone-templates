My Lazybones templates
----------------------

This repository hosts some project Templates (boilerplate setup) that can be used using Lazybones.

#### Currently available template(s)

* [Groovy Lib Template](https://github.com/kdabir/lazybone-templates/blob/master/templates/groovy-lib/README.md)
* [Sinatra Haml Sass & Coffee Template](https://github.com/kdabir/lazybone-templates/blob/master/templates/sinatra-haml-sass-coffee/README.md)

## Usage

1. Add following snippet to `~/.lazybones/config.groovy`

        bintrayRepositories = [
              "pledbrook/lazybones-templates",
              "kdabir/templates"
        ]

2. Do a `lazybones list` to see available templates


If you don't have lazybones installed, install that first :

1. Install gvm

    `curl -s get.gvmtool.net | bash`

2. Install lazybones via gvm

    `gvm install lazybones`


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

* To Publish all templates

        ./gradlew publishAllTemplates


### To Create a New Template

* Create a new dir in `templates` dir
* Populate it with template content
* Add `README.md`
* Add `VERSION file`
* Install locally using `installTemplate<TemplateName>`
* Test locally using `lazybones create template-name <version> sample-app`
* Publish using `publishTemplate<TemplateName>`


You can find out more about creating templates on [Lazybones' GitHub wiki][1].

[1]: https://github.com/pledbrook/lazybones/wiki/Template-developers-guide
