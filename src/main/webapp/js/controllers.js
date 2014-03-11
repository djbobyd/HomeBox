'use strict';

/* Controllers */

angular.module('myApp.controllers', []).
  controller('MyCtrl1', [function() {

  }])
  .controller('MyCtrl2', ['$scope','myJersey',function($scope,myJersey) {
        $scope.jersey=myJersey.query();
  }]);