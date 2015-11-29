class Person extends Backbone.Model
  defaults:
    name: 'Nick'
    job: 'web developer'

class PersonView extends Backbone.View
  initialize: ->
  @model.on 'someEvent', @doThis

  doThis: ->
  console.log this

person = new Person
personView = new PersonView model: person

person.trigger 'someEvent'