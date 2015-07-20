//Исходный файл main.js выглядит так:
//Модель человека
var Person = Backbone.Model.extend({
    defaults: {
        name: 'Иван Петров',
        age: 40,
        job: 'слесарь'
    }
});


//Вид представления одного человека
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


var person = new Person();
var personView = new PersonView({model: person});

var person2 = new Person({name: 'Петр', age:'Менеджер'});
var personView2 = new PersonView({model: person2});


//создания экземпляров множества моделей, по одной, очень быстро приводит к засорению вашего кода. Поэтому создадим, нашу первую коллекцию.
//    Как модель по умолчанию, добавим ей модель Person. Модель по умолчанию – эта там модель, с которой будут ассоциироваться остальные модели добавленные в коллекцию.
//    То есть, Person становится своего рода “шаблоном” всех остальных добавленных в коллекцию моделей. Если моделям не заданы отличные атрибуты, то они будут браться из модели Person.
//Список людей
var PeopleCollection = Backbone.Collection.extend({
    model: Person
});


//Теперь давайте создадим экземпляр коллекции и добавим в нее две, уже существующие, модели.
var person = new Person();
var personView = new PersonView({model: person});

var person2 = new Person({name: 'Петр', age:'Менеджер'});
var personView2 = new PersonView({model: person2});

var peopleCollection = new PeopleCollection();

peopleCollection.add(person);
peopleCollection.add(person2);


//обычно, в реальных проектах, модели не добавляются по одной. Скорее всего, в коллекцию будет сразу передан массив.
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
//каждый элемент массива – это и есть модель. То есть когда вы принимаете с сервера массив данных и вставляете его в коллекцию.
//То автоматически, каждый элемент массива становится моделью.

