//Давайте создадим наш первый роутер.
window.App = {
    Views: {},
    Models: {},
    Collections : {},
    Router: {}
};

// шаблон
window.template = function(id) {
    return _.template( $('#' + id).html() );
};

App.Router = Backbone.Router.extend({
});


//давайте попробуем написать наш первый “роут”.
// Маршруты описываются в объекте routes, где каждому “роуту” соответствует определенный метод,
// срабатывающий как только URL измениться.
App.Router = Backbone.Router.extend({
    routes: {
        ''     : 'index',
        'read' : 'read'
    },

    index: function() {
        console.log('Всем привет от индексного роута!');
    },
    read: function() {
        console.log('это роут Read');
    }
});

new App.Router();
//Для работы роутера, необходимо подключить History API.
Backbone.history.start();
