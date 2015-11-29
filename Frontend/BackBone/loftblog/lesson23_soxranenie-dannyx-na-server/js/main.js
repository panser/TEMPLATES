(function() {
    window.App = {
        Models: {},
        Views: {},
        Collections: {}
    };

    App.Models.Task = Backbone.Model.extend({
        defaults: {
            title: '',
            completed: 0
            //Теперь не забудем удалить из нашей модели айдишник, заданный в атрибутах по умолчанию.
            //    Так как backbone, видя айдишник автоматически добавляет его в урл и меняет запрос на put,
            //    при вызове метода save. Нам же нужен обычный post, без указания айдишника.
            //id: ''
        },

        //В модели помимо свойств по умолчанию, надо указать URL, по которому она будет дергать данные.
        //urlRoot: 'tasks'
        urlRoot: 'json/tasks'
    });


    //Начнем с того, что создадим пустую модель и добавим в нее title.
    var task = new App.Models.Task();
    task.set({title: "Новая задача"});

    task.save();
}());