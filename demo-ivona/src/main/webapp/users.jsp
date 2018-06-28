<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<table>
	<tr>
		<th>Mail</th>
		<th>Admin</th>
		<th>Option</th>
	</tr>
	
	<c:forEach items="${listaUsera}" var="u">
		
	    <tr>      
	        <td>${u.mail}</td>
	        <td>${u.admin}</td>
	        <td>
	        	<input type="button" value="Edit" onClick="location.href='/users/edit?id='+${u.id}">
	        	
	            <input type="button" value="Delete" onClick="location.href='/users/delete?id='+${u.id}">

	        </td>
	    </tr>
	</c:forEach>

</table>

