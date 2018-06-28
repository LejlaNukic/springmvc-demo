
	
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<h1>Edit user form</h1>

<form:form method="POST" action="/users/update" modelAttribute="user">
             <table>
             
             	<tr>
                    <td><form:label path="id">Id</form:label></td>
                    <td><form:input type="text" path="id"  readonly="true" /></td>
                   
       
                </tr>
                
                <tr>
                    <td><form:label path="mail">Mail</form:label></td>
                    <td><form:input type="text" path="mail" /></td>
                </tr>
                <tr>
                    <td><form:label path="admin">Administrator</form:label></td>
                    <td><form:input type="text" path="admin" /></td>
                </tr>
                
         
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
</form:form>