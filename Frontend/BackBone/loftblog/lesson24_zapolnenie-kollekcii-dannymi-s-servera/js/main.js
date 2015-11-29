(function() {
    window.App = {
        Models: {},
        Views: {},
        Collections: {}
    };

    App.Models.Task = Backbone.Model.extend({
        defaults: {
            title: '',
            completed: 0,
            id: ''
        }
    });


    App.Collections.Tasks = Backbone.Collection.extend({
        model: App.Models.Task,

        url: '/tasks'
    });


    //создадим экземпляр коллекции в браузерной консоли и попробуем схватить данные с сервера.
    var tasksCollection = new App.Collections.Tasks();
    tasksCollection.fetch();

    //Давай отобразим эти данные на странице
    App.Views.Tasks = Backbone.View.extend({
        tagName: 'ul',

        initialize: function() {
            this.collection.on('add', this.addOne, this);
        },
        render: function() {
            this.$el.empty();
            this.collection.each(this.addOne, this);
            return this;
        },

        addOne: function(task) {
            var task = new App.Views.Task({ model: task });
            this.$el.append( task.render().el );
        }


    });

    App.Views.Task = Backbone.View.extend({
        tagName: 'li',

        initialize: function() {
            this.model.on('destroy', this.remove, this);
        },
        render: function() {
            this.$el.html( this.model.get('title') );
            return this;
        }
    });

    //Перейдем в консоль и повторим процесс создания и заполнения коллекции данными.
    // Затем создадим экземпляр вида списка задач и добавим в него нашу коллекцию.
    // После этого срендерим вид и вставим корневой элемент
    var tasksCollection = new App.Collections.Tasks();
    tasksCollection.fetch();

    var tasksView = new App.Views.Tasks({ collection: tasksCollection });
    tasksView.render();
    $(document.body).append(tasksView.el);


    //Напоследок повесим события прослушки изменения и удаления моделей.
    //...
    //Проверим это в консоли с помощью метода create,
    // который под своим капотом не только добавляет модель в коллекцию, но так же и вызывает метод save, отправляющий данные на сервер.
    var tasksCollection = new App.Collections.Tasks();
    tasksCollection.fetch();

    var tasksView = new App.Views.Tasks({ collection: tasksCollection });
    tasksView.render();

    $(document.body).append(tasksView.el);

    tasksCollection.create({title: "Задача новая" });



}());