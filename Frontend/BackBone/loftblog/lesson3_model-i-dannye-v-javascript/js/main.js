
//напишем свою первую модель
var Person = function(config) {
    this.name = config.name;
    this.age = config.age;
    this.job = config.job;
};

//создадим экземпляр модели – nick и передадим ей в качестве аргумента объект (он же config) , в котором укажем все необходимые данные.
var nick = new Person({ name: 'Nick', age: 24, job: 'Front-end developer' });

//А как же с функциями? И к тому же функциями, которые необходимы в каждом новом объекте ?
//Чтобы создать такую функцию, необходимо добавить ее в прототип модели. Таким образом, она будет доступна для любого созданного объекта.
Person.prototype.walk = function() {
    return this.name + 'is walking';
};