//сейчас я представляю вашему вниманию backbone.view.
//    По-русски его называют “вид” или “представление”, и нужен он главным образом для того,
//    чтобы отображать в браузере изменения change модели (с ними мы уже знакомы) и реагировать на известные всем события, вроде click, submit и пр.

var Person = Backbone.Model.extend({
    defaults: {
        name: 'Dima',
        age: 23,
        job: 'web developer'
    }
});

//Создадим конструктор вида, аналогично модели:
var PersonView = Backbone.View.extend({
});

//Создадим экземпляр вида:
var personView = new PersonView;

//Элемент вида this.el создается из свойств tagName, className и id если они указаны.
// Если нет — el по умолчанию будет просто div’ом.
var PersonView = Backbone.View.extend({
    tagName: 'li',
    className: 'person',
    id: 'some-person'
});
personView.el // &lt;li class=&quot;person&quot; id=&quot;some-person&quot;&gt;&lt;/li&gt;

//При создании экземпляра вида всегда срабатывает функция initialize:
var PersonView = Backbone.View.extend({
    initialize: function() {
        console.log('initialize!')
    }
});

//Создадим теперь новую модель класса Person и вид класса PersonView, причём укажем, что созданная модель привязана к этому виду.
var person = new Person;
var personView = new PersonView({ model: person });

//Функция render нужна нам для наполнения нашего элемента html кодом. “Забьём” данные в наш элемент.
var PersonView = Backbone.View.extend({
    render: function() {
        this.$el.html( this.model.get('name') + ' (' + this.model.get('age') + ') - ' + this.model.get('occupation') );
    }
});
var personView = new PersonView;
personView.el // &lt;li&gt;Dima (23) - web developer&lt;/li&gt;