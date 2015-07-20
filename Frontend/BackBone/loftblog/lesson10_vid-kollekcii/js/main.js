//как же рендерить всю эту коллекцию сразу, а не по одной модели ?
// Для этого и нужен вид коллекции. Не пугайтесь.
// Это тот же самый Backbone.View , только с чуть другой логикой внутри метода render

//Начальный код выглядит так
//Модель человека
var Person = Backbone.Model.extend({
    defaults: {
        name: 'Иван Петров',
        age: 40,
        job: 'слесарь'
    }
});

var person = new Person();

//Список людей
var PeopleCollection = Backbone.Collection.extend({
    model: Person
});


//Вид одного человека
var PersonView = Backbone.View.extend({
    tagName: 'li',

    template: _.template('<strong><%= name %></strong> ( <%= age %> ) - <%= job %>'),

    initialize: function() {
        this.render();
    },

    render: function() {
        //замечательный шаблон
        this.$el.html( this.template( this.model.toJSON() ) );

    }
});


var peopleCollection = new PeopleCollection([
    {
        name: 'Петр',
        age: 20,
        job: 'Таксист'
    },
    {
        name: 'Олег',
        age: 24,
        job: 'Менеджер'
    },
    {
        name: 'Анна',
        age: 18,
        job: 'Студентка'
    }
]);



//Создадим наш вид списка людей
//Вид списка людей
var PeopleView = Backbone.View.extend({
    tagName: 'ul',

    initialize: function() {
    }
});

//давайте инициализируем его экземпляр и передадим в него нашу коллекцию.
var peopleView = new PeopleView({collection: peopleCollection});


//Теперь самое интересное. Начнем рендер нашего вида коллекции.
// Для этого нам понадобится пройтись по коллекции и создать по виду, на каждую модель этой коллекции.
// После чего вставить каждый срендеренный вид, в элемент нашего списка ul.
//Вид списка людей
var PeopleView = Backbone.View.extend({
    tagName: 'ul',

    initialize: function() {
    },

    render: function() {
        this.collection.each(function(person) {
            var personView = new PersonView({model: person});
            this.$el.append(personView.render().el);
        }, this);

        return this;
    }

});
//Как вы заметили, я использую цепной вызов метода render() и свойства el, один за другим. personView.render().el
// Для того, чтобы это осуществить нужно в конце метода render , возвращать этот экземпляр вида return this

//давайте инициализируем его экземпляр и передадим в него нашу коллекцию.
var peopleView = new PeopleView({collection: peopleCollection});

//В PersonView, сделаем тоже самое, для удобства рендеринга и сразу же взятия каждого элемента вида.
//Вид одного человека
var PersonView = Backbone.View.extend({
    tagName: 'li',

    template: _.template('<strong><%= name %></strong> ( <%= age %> ) - <%= job %>'),

    initialize: function() {
        this.render();
    },

    render: function() {
        //замечательный шаблон
        this.$el.html( this.template( this.model.toJSON() ) );
        return this;
    }
});

//Теперь осталось только срендерить и вставить в документ, сам вид коллекции.
$(document.body).append(peopleView.render().el);