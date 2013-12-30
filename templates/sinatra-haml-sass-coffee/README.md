Sinatra Minimal Template with Haml, Sass and CoffeeScript support
-----------------------------------------------------------------

- Install required deps using `bundle install`
- To run the app `bundle exec shotgun app.rb`
- Edit `app.rb` to start developing

## What's included?

 - Shotgun for auto reload
 - Using haml for views, inline templates at the end of source file
 - Sass support
 - CoffeeScript support (requires nodejs)
 - Bootstrap theme applied using bootstrap CDN
 - Default layout, with sticky footer
 - Single file sinatra app, great for small apps
 - Gemfile included, use bundler right away
 - .gitignore include, just init and commit the project

## Deploying to heroku

 - Create a Heroku app `heroku apps:create app-name`
 - And deploy `git push heroku master` or `git push -f heroku local-branch:master` to force push a local branch
