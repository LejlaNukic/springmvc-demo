<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<h1>Create user form</h1>

<form:form method="POST" action="/users/signin" modelAttribute="user">
             <table>
             
             
                
                <tr>
                    <td><form:label path="mail">Mail</form:label></td>
                    <td><form:input type="text" path="mail" /></td>
                </tr>
                 <tr>
                    <td><form:label path="password">Password</form:label></td>
                    <td><form:input type="password" path="password" /></td>
                </tr>
         
         
                <tr>
                    <td><input type="submit" value="Login"/></td>
                </tr>
               
            </table>
</form:form>