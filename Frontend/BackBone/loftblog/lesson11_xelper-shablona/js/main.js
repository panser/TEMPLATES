//Обычно хэлпер пишется в отдельном файле, но в нашем микропроекте, можно написать и в main.js
//хэлпер шаблона
var template = function(id) {
    return _.template( $('#' + id).html() );
};

//Теперь в нашем виде PersonView, мы сможем легко вызывать этот хэлпер и просто передавать в него строку нужного айдишника
//Вид одного человека
var PersonView = Backbone.View.extend({
    template:  template('personTemplate')
    //...
});