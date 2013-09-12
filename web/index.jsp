<%-- 
    Document   : index
    Created on : 09/09/2013, 2:56:16 PM
    Author     : Ross
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Ajax Test</title>
	</head>
	<body>
		<h1>Ajax Example 1</h1>
		<div id="personOutput"></div>
		<button id="personSubmit">Load People</button>

		<div id="animalOutput"></div>
		<button id="animalSubmit">Load Animals</button>

		<div id="houseOutput"></div>
		<button id="houseSubmit">Load House</button>

	</body>
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
	<script type="text/javascript">
		$("#animalSubmit").click(function() {
			$.ajax({
				url: "/AjaxExample/Animals",
				content: "text/json"
			}).done(function(data) {
				$('#animalOutput').html("");//clear div
				$.each(data, function(index, element) {
					printAnimal(element, $('#animalOutput'));
				});
			});
			$(this).toggle();
		});

		$("#personSubmit").click(function() {
			$.ajax({
				url: "/AjaxExample/People",
				content: "text/json"
			}).done(function(data) {
				$('#personOutput').html("");//clear div
				$.each(data, function(index, element) {
					printPerson(element, $('#personOutput'));
				});
			});
			$(this).toggle();
		});

		$("#houseSubmit").click(function() {
			$.ajax({
				url: "/AjaxExample/House",
				content: "text/json"
			}).done(function(data) {
				console.log(data);
				$('#houseOutput').html("");//clear div
				$('#houseOutput').append('<span>Walls: ' + data.walls + '</span><br />');
				$('#houseOutput').append('People:<br />');
				for (var i = 0; i < data.people.length; i++)
				{
					printPerson(data.people[i], $('#houseOutput'));
				}
				$('#houseOutput').append('Animals:<br />');
				for (var i = 0; i < data.animals.length; i++)
				{
					printAnimal(data.animals[i], $('#houseOutput'));
				}
			});
			$(this).toggle();
		});
		var printPerson = function(person, div)
		{
			div.append('<span>First Name: ' + person.firstName + '</span><br />');
			div.append('<span>Last Name: ' + person.lastName + '</span><br />');
			div.append('<span>Height: ' + person.height + '</span><br />');
		}
		var printAnimal = function(animal, div)
		{
			div.append('<span>Name: ' + animal.name + '</span><br />');
			div.append('<span>Type: ' + animal.type + '</span><br />');
			div.append('<span>Legs: ' + animal.legs + '</span><br />');
		}
	</script>
</html>
