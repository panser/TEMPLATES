(function() {
  'use strict';

  angular
    .module('tst4')
    .controller('MainController', MainController)
    .controller('Lesson2Controller', Lesson2Controller)
  ;

  /** @ngInject */
  function MainController($timeout, webDevTec, toastr) {
    var vm = this;

    vm.awesomeThings = [];
    vm.classAnimation = '';
    vm.creationDate = 1449335223343;
    vm.showToastr = showToastr;

    activate();

    function activate() {
      getWebDevTec();
      $timeout(function() {
        vm.classAnimation = 'rubberBand';
      }, 4000);
    }

    function showToastr() {
      toastr.info('Fork <a href="https://github.com/Swiip/generator-gulp-angular" target="_blank"><b>generator-gulp-angular</b></a>');
      vm.classAnimation = '';
    }

    function getWebDevTec() {
      vm.awesomeThings = webDevTec.getTec();

      angular.forEach(vm.awesomeThings, function(awesomeThing) {
        awesomeThing.rank = Math.random();
      });
    }
  }

  /** @ngInject */
  function Lesson2Controller(myPopup) {
    var vm = this;

    vm.showPopup = function(){
      myPopup.open({
        template: '<div>HELLO WORLD <button ng-click="close(1)">1</button> <button ng-click="close(2)">2</button></div>',
        controller: function(){},
        resolve: {
          testResolve: function($q){
            return $q.when(true);
          }
        }
      }).then(function(data){
        alert(data);
      });
    }



  }

})();
