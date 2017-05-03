<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="myApp">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="http://cdn.static.runoob.com/libs/angular.js/1.4.6/angular.js"></script>
<script src="../js/app.js"></script>
<title>AngularJSTest</title>
</head>
<body ng-controller="MyController">
    <p>User</p>
    <p>ID : {{saverUser.id}}</p>
    <input id="id" name="id" ng-model="saveUser.id">
    <br>
    <p>Name : {{saverUser.name}}</p>
    <input id="id" name="name" ng-model="saveUser.name">
    <br>
    <p>age : {{saverUser.age}}</p>
    <input id="id" name="age" ng-model="saveUser.age">
    <br>
    <button ng-click="getUser()">Submit</button>
</body>
</html>