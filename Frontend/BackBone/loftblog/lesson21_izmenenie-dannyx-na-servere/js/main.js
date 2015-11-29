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
        },

        //В модели помимо свойств по умолчанию, надо указать URL, по которому она будет дергать данные.
        //urlRoot: 'tasks'
        urlRoot: 'json/tasks'
    });


    //Попробуем в консоли создать новый экземпляр модели и схватить данные.
    var task = new App.Models.Task({id:1});
    task.fetch();

    //чтобы сохранить измененные данные на сервер в Backbone
    task.set({title: 'Другая задача'});
    task.save();
}());