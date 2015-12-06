/**
 * Created by Sergey on 12/5/2015.
 */

  //что бы узнать выполнилась ли директива:
  //var inj = angular.element($0).injector()
  //inj.get('actionOnClickOutsideDirective')

angular.module('actionOnClickOutside', [])
  .directive('actionOnClickOutside', function($document){
    return{
      //E - для компонента
      //A - добавление поведения
      //C - для визуальной "рюшечки"
      restrict: 'A',
      link: function(scope, el, attrs){

        function listener(e){
          var curElement = e.target;
          while(curElement){
            if(curElement === el[0]){
              return;
            }
            curElement = curElement.parentNode;
          }

           scope.$eval(attrs.actionOnClickOutside);
          scope.$applyAsync();
        }

        $document[0].addEventListener('click', listener, true);
        el.on('$destroy', function(){
          console.log('Element destroyed');
          $document[0].removeEventListener('click', listener, true);
        });

        scope.$on('$destroy', function(){
          console.log('Scope destroyed');
        });


      }
    }
  });
