angular.module('app.services', []).factory('testService', function ($http) {

    var api = {};

    api.getBalance = function (login, account) {
        return $http({
            method: '',
            url: ''
        });
    }

    return api;
});