//Давайте создадим наш первый роутер.
window.App = {
    Views: {},
    Models: {},
    Collections : {},
    Router: {}
};

//Динамичная маршрутизация в Backbone представлена двумя типами переменных. Первый называется
// :wild-card, который соответствует любой части URL между косыми чертами (/). И второй
// *splat, который соответствуют любому количеству частей и символов URL.
// Обратите внимание, что *splats всегда должен быть последней переменной в URL, так как будет соответствовать любым символам URL.
    App.Router = Backbone.Router.extend({
    routes: {
        ''     : 'index',
        'page/:id'        : 'page',
        'page/:id/*sdfsdfs'       : 'page2',
        '*other'                 : 'default'
    },

    index: function() {
        console.log('Всем привет от индексного роута!');
    },
    page: function(id) {
        console.log('это роут page' + id + '!!!');
    },
    page2: function(id, simbo) {
        console.log(simbo);
    },
    default: function(other) {
        alert('Хммм...вы уверены, что вы попали туда куда хотели? Вы находитесь на роуте ' + other);
    }
});

new App.Router();
//Для работы роутера, необходимо подключить History API.
Backbone.history.start();
