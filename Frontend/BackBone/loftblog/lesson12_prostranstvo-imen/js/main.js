//Начнем с анонимной функции.
(function() {

}());

//создадим глобальный объект App, который и будет являться нашим пространством имен.
(function() {
    window.App = {};
}());

//Хорошей практикой является одна, глобальная функция.
// Но так как у нас проект маленький и всего один хэлпер,
// предлагаю во избежание большой вложенности и для простоты его использования, забить его во вторую глобальную переменную.
(function() {
    window.App = {};

    //хэлпер шаблона
    window.template = function(id) {
        return _.template( $('#' + id).html() );
    };
}());

//Для наших моделей, видов и коллекций, создадим подпространства, для того чтобы было удобно управлять этими сущностями.
(function() {
    window.App = {
        Models: {},
        Views: {},
        Collections: {}
    };

    //хэлпер шаблона
    window.template = function(id) {
        return _.template( $('#' + id).html() );
    };
}());



//Теперь перепишем весь наш проект, с учетом пространства имен.
(function() {
    window.App = {
        Models: {},
        Views: {},
        Collections: {}
    };

    //хэлпер шаблона
    window.template = function(id) {
        return _.template( $('#' + id).html() );
    };



    //Модель человека
    App.Models.Person = Backbone.Model.extend({
        defaults: {
            name: 'Иван Петров',
            age: 40,
            job: 'слесарь'
        }
    });

    //Вид одного человека
    App.Views.Person = Backbone.View.extend({
        tagName: 'li',

        template:  template('personTemplate'),


        initialize: function() {
            this.render();
        },

        render: function() {
            //замечательный шаблон
            this.$el.html( this.template( this.model.toJSON() ) );

            return this;
        }
    });

    //Список людей
    App.Collections.People = Backbone.Collection.extend({
        model: App.Models.Person
    });


    //Вид списка людей
    App.Views.People = Backbone.View.extend({
        tagName: 'ul',

        initialize: function() {
        },

        render: function() {
            this.collection.each(function(person) {
                var personView = new App.Views.Person({model: person});

                this.$el.append(personView.render().el);
            }, this);

            return this;
        }

    });


   var peopleCollection = new App.Collections.People([
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


    var peopleView = new App.Views.People({collection: peopleCollection});

    $(document.body).append(peopleView.render().el);

    console.log(App.Models);

}());