/**
 * 
 */

var app = angular.module('myApp', []);
app.controller('MyController', function($scope, $http) {
    $scope.count = 0;

    $scope.saveUser = {
        id: 1,
        name: "John",
        age: "16"
    };
    
    $scope.getUser = function() {

        $http({
            method: "POST",
            url: "http://localhost:8080/angularjs-springmvc/AngularJS/getUser.do",
            data: $scope.saveUser
        }).success(function(data, status) {
            console.log(data.id);
//            $scope.id = data.id;
            $scope.saverUser = data;
//            $scope.saverUser.id = data.id;
//            $scope.saverUser.name = data.name;
//            $scope.saverUser.age = data.age;
            
        }).error(function(data, status) {
            console.log("fail");
        })
    }
    ;
});
