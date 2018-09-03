<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
   <head>
      <title>Spring MVC Form Handling</title>
      <style type="text/css">
      
      .errors{
      color:red;
      }
      </style>
   </head>
   
   <body>
      <h2>Student Information</h2>
      <form:form method = "POST" action = "addStudent" commandName="student1">
         <table>
            <tr>
               <td><form:label path = "name">Name</form:label></td>
               <td><form:input path = "name" /></td>
               <td><form:errors path = "name" cssClass="errors"/></td>
            </tr>
           
            <tr>
               <td><form:label path = "age">Age</form:label></td>
               <td><form:input path = "age" /></td>
                <td><form:errors path = "age" cssClass="errors"/></td>
            </tr>
            <tr>
               <td><form:label path = "id">id</form:label></td>
               <td><form:input path = "id" /></td>
                <td><form:errors path = "id" cssClass="errors" /></td>
            </tr>
            <tr>
               <td><form:label path = "Email">Email</form:label></td>
               <td><form:input path = "Email" /></td>
               <td><form:errors path = "Email" cssClass="errors"/></td>
            </tr>
            <tr>
               <td colspan = "2">
                  <input type = "submit" value = "Submit"/>
               </td>
            </tr>
         </table>  
      </form:form>
   </body>
</html>