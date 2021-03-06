$(function() {
    // пространство имён
    window.App = {
        Models: {},
        Collections: {},
        Views:{}
    };

    // шаблон
    window.template = function(id) {
        return _.template( $('#' + id).html() );
    };

    App.Models.Task = Backbone.Model.extend({});

    App.Views.Task = Backbone.View.extend({
        tagName: 'li',
        template: template('taskTemplate'),
        render: function () {
            var template = this.template(this.model.toJSON());
            this.$el.html( template );
            return this;
        },
        initialize: function () {
            this.model.on('change', this.render, this);
            this.model.on('destroy', this.remove, this);
        },
        validate: function (attrs) {
            if ( ! $.trim(attrs.title) ) {
                return 'Имя задачи должно быть валидным!';
            }
        },
        events:{
            'click .edit': 'editTask',
            'click .delete': 'destroy'
        },
        editTask: function  () {
            var newTaskTitle = prompt('Как переименуем задачу?', this.model.get('title'));
            this.model.set({'title': newTaskTitle},{validate: true});
            console.log(newTaskTitle);
        },
        destroy: function  () {
            this.model.destroy();
        },
        remove: function  () {
            this.$el.remove();
        }
    });

    App.Collections.Task = Backbone.Collection.extend({
        model: App.Models.Task
    });

    App.Views.Tasks = Backbone.View.extend({
        tagName: 'ul',
        initialize: function() {
            this.collection.on('add', this.addOne, this );
        },
        render: function() {
            this.collection.each(this.addOne, this);
            return this;
        },
        addOne: function(task) {
            // создавать новый дочерний вид
            var taskView = new App.Views.Task({ model: task });
            // добавлять его в корневой элемент
            this.$el.append(taskView.render().el);
        }
    });

    App.Views.AddTask = Backbone.View.extend({
        el: '#addTask',

        initialize: function() {
        },

        events: {
            'submit' : 'submit'
        },

        submit: function(e) {
            e.preventDefault();

            var newTaskTitle =  $(e.currentTarget).find('input[type=text]').val();
            console.log(newTaskTitle);

            var newTask = new App.Models.Task({ title: newTaskTitle });
            this.collection.add(newTask);
        }
    });

    window.tasksCollection = new App.Collections.Task([
        {
            title: 'Сходить в магазин',
            priority: 4
        },
        {
            title: 'Получить почту',
            priority: 3
        },
        {
            title: 'Сходить на работу',
            priority: 5
        },
    ]);

    var tasksView = new App.Views.Tasks({ collection: tasksCollection});
    var addTaskView = new App.Views.AddTask({ collection: tasksCollection });

    $('.tasks').html(tasksView.render().el);


});