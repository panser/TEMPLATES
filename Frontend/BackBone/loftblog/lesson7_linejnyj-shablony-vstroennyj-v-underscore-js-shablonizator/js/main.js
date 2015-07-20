//Вспомним модель и вид, что мы уже имеем. А так же анти-шаблон, написанный на прошлом уроке.
var Person = Backbone.Model.extend({
    defaults: {
        name: 'Иван Петров',
        age: 40,
        job: 'слесарь'
    }
});


var PersonView = Backbone.View.extend({
    tagName: 'li',

    initialize: function() {
        this.render();
    },

    render: function() {
        //анти-шаблон
        this.$el.html( this.model.get('name') + ' (' + this.model.get('age') + ') - ' + this.model.get('job'));
    }
});

var person = new Person();
var personView = new PersonView({ model: person });


//Давайте заменим анти-шаблон, новым и правильным. Напишем свойство template и опишем в нем наш underscore шаблон.
var PersonView = Backbone.View.extend({
    tagName: 'li',

    template: _.template('<strong><%= name %></strong> ( <%= age %> ) - <%= job %>'),

    initialize: function() {
        this.render();
    },

    render: function() {
    }
});

//Далее вставим в наш li элемент, наш скомпилированный шаблон, с переданными в json формате атрибутами нашей модели.
var PersonView = Backbone.View.extend({
    tagName: 'li',

    template: _.template('<strong><%= name %></strong> ( <%= age %> ) - <%= job %>'),

    initialize: function() {
        this.render();
    },

    render: function() {
        this.$el.html( this.template( this.model.toJSON() ) );
    }
});