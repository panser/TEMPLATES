(function() {
  'use strict';

  angular
    .module('tst4')
    .run(runBlock);

  /** @ngInject */
  function runBlock($log) {

    $log.debug('runBlock end');
  }

})();
