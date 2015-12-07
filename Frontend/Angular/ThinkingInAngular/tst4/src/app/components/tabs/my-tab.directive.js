angular.module('tst4')
  .directive('myTab', function(){
    return{
      restrict: 'E',
      //require: 'a' - найти директиву по-имени и вернуть
      //require: '^a' - найти директиву по-имени на текущем елементи или на одном из родитлей и вернуть
      //require: '^^a' - найти директиву по-имени на родитльском елементе и вернуть
      //require: '?^^a' - как и '^^a', но указывает на 'не обязательно'
      require: '^^myTabs',
      link: function(scope, el, attrs, myTabsCtrl){
        myTabsCtrl.addTab(attrs.name, el);
      }
    }
  })
;
