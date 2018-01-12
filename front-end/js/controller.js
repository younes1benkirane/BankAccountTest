angular.module('app.controllers', [])
    .controller('testController', function ($scope, testService) {

        $scope.title = 'Bank Account';
		$scope.balance = '0';
		
    });