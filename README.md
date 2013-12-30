My Lazybones templates
----------------------

This repository hosts some project Templates (boilerplate setup) that can be used using Lazybones.

If you don't have lazybones installed, install that first :

1. Install gvm

    `curl -s get.gvmtool.net | bash`

2. Install lazybones via gvm

    `gvm install lazybones`


## Usage

1. Add following snippet to `~/.lazybones/config.groovy`

        bintrayRepositories = [
              "pledbrook/lazybones-templates",
              "kdabir/templates"
        ]

2. Do a `lazybones list` to see available templates


#### Currently available template(s)

* [Groovy Lib Template](https://github.com/kdabir/lazybone-templates/blob/master/templates/groovy-lib/README.md)


## Installing via source

Clone this Github repo and execute the following Gradle tasks based on what you want to do :


* Package and install groovy lib template

        ./gradlew installTemplateGroovyLib

* To publish groovy lib template

        ./gradlew publishTemplateGroovyLib

* Package and install all the templates locally with the command:

        ./gradlew installAllTemplates

* To Publish all templates

        ./gradlew publishAllTemplates


### To Create a New Template

Create a new dir in `templates` dir. Populate it with template content and install it locally.

You can find out more about creating templates on lazybones [GitHub wiki][1].

[1]: https://github.com/pledbrook/lazybones/wiki/Template-developers-guide
