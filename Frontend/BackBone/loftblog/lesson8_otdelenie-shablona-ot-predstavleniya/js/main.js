//Мы вынесли наш шаблон из вьюхи и теперь мы можем больше не бояться, что последняя рано или поздно лопнет от всё нарастающего html кода :).
var Person = Backbone.Model.extend({
    defaults: {
        name: 'Dima',
        age: 23,
        occupation: 'web developer'
    }
});

var PersonView = Backbone.View.extend({
    tagName: 'li',

    //template: _.template("<strong><%= name %></strong> (<%= age %>) - <%= occupation %>"),
    template: _.template( $('#person-id').html() ),

    initialize: function() {
        this.render();
    },

    render: function() {
        this.$el.html( this.template(this.model.toJSON()) );
    }
});

var person = new Person;
var personView = new PersonView({ model: person });


//Есть и другой путь проделать то же самое.
var Person = Backbone.Model.extend({
    defaults: {
        name: 'Dima',
        age: 23,
        occupation: 'web developer'
    }
});

var PersonView = Backbone.View.extend({
    tagName: 'li',

    //template: _.template("<strong><%= name %></strong> (<%= age %>) - <%= occupation %>"),
    //template: _.template( $('#person-id').html() ),
    template: '#personTemplate',

    initialize: function() {
        this.render();
    },

    render: function() {
        //this.$el.html( this.template(this.model.toJSON()) );
        var template = _.template( $(this.template).html() );
        this.$el.html(template( this.model.toJSON() ));
    }
});

var person = new Person;
var personView = new PersonView({ model: person });