//Итак начнем с того, что мы имеем.
var Person = Backbone.Model.extend({
    defaults: {
        name: 'Иван Петров',
        age: 40,
        job: 'слесарь'
    },

    work: function() {
        return this.get('name') + ' is working.';
    }
});

//Начнем с того, что будем проверять модель, на возможность задавать отрицательный возраст для нашей персоны.
var person = new Person({name: 'Николай', job: 'Веб-разработчик'});

//Далее, вернемся к модели и напишем встроенный в Backbone.Model метод validate – отвечающий за валидацию атрибутов модели.
var Person = Backbone.Model.extend({
    defaults: {
        name: 'Иван Петров',
        age: 40,
        job: 'слесарь'
    },


    validate: function( attrs ) {
        console.log(attrs);

        if ( attrs.age <= 0 ) {
            return 'Возраст должен быть положительным!';
        }

    },

    work: function() {
        return this.get('name') + ' is working.';
    }
});

//Чтобы вывести сообщение, необходимо поставить прослушку на ошибки. То есть повесить обработчик, на событие ‘error’.
person.on('error', function(model, error){
    console.log(error);
});

//Напишем ещё одну проверку, теперь уже на имя.
var Person = Backbone.Model.extend({
    defaults: {
        name: 'Иван Петров',
        age: 40,
        job: 'слесарь'
    },


    validate: function( attrs ) {
        console.log(attrs);

        if ( attrs.age <= 0 ) {
            return 'Возраст должен быть положительным!';
        }

        if ( ! attrs.name ) {
            return 'Чувак, ты же не думаешь, что у персоны не может быть имени?';
        }

    },

    work: function() {
        return this.get('name') + ' is working.';
    }
});