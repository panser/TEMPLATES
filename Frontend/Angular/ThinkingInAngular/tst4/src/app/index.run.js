(function() {
  'use strict';

  angular
    .module('tst4')
    .run(runBlock);

  /** @ngInject */
  function runBlock($log, $rootScope) {
    $rootScope.$on('$stateChangeError', function(){
      throw arguments[5];
    });

    $log.debug('runBlock end');
  }

})();
