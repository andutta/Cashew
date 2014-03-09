<html>
<title></title>

<body>

<table border="1">
<thead><td>Story Title</td><td> Developer Assigned To</td></thead>
	<g:each in="${allStories}" status="i" var="story">
		<tr><td>${story.storyTitle}</td><td>${story.assignedTo}</td> </tr>
	</g:each>
</table>
</body>
</html>