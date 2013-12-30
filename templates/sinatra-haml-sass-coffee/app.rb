require 'sinatra'

get '/' do
  haml :index
end

get '/styles.css' do
  sass :styles
end

get '/application.js' do
  coffee :application
end

__END__
@@styles
html,body
  height: 100%

.centered-text
  text-align: center

.desc
  margin-top: 80px

#wrap
  min-height: 100%
  height: auto
  margin: 0 auto -60px
  padding: 0 0 60px

#footer
  height: 60px


@@application
console.log "hello coffee"


@@layout
!!! 5
%html
  %head
    %title Sinatra Template
    %link(rel='stylesheet' href="/styles.css")
    %link(rel='stylesheet' href="//netdna.bootstrapcdn.com/bootswatch/3.0.3/cosmo/bootstrap.min.css")

  %body.centered-text
    #wrap
      .container
        %h1 Sinatra Template Project

        %section
          = yield

    #footer
      %footer
        %a{href:"https://github.com/kdabir/lazybone-templates/tree/master/templates/sinatra-haml-sass-coffee"} Sinatra Template

@@index
%p.desc
  With Haml, Sass & CoffeeScript support
  %br
  And a Twitter Bootstrap enabled Layout template

  %br
  .desc
    %img(src='http://i.imgur.com/ft6Tkdil.png')
