(function() {
  'use strict';

  angular
    .module('tst4')
    .config(routerConfig);

  /** @ngInject */
  function routerConfig($stateProvider, $urlRouterProvider) {
    $stateProvider
      .state(
      //'home', {
      //  url: '/',
      //  templateUrl: 'app/main/main.html',
      //  controller: 'MainController',
      //  controllerAs: 'main'
      //  //,resolve: {
      //  //  myResolve: function(){
      //  //    djdjkdkdkflflflflflflflf
      //  //  }
      //  //}
      //}
      //,
      'lesson2', {
          url: '/lesson2',
          templateUrl: 'app/main/lesson2.html',
          controller: 'Lesson2Controller',
          controllerAs: 'main'
        }
    );

    $urlRouterProvider.otherwise('/');
  }

})();
