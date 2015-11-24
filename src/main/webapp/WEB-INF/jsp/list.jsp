    <span style="font-size:18px;"><span style="font-size:18px;"><%@ page language="java" contentType="text/html; charset=UTF-8"  
        pageEncoding="UTF-8"%>  
     
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
    <html>  
    <head>  
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
    <title>列表</title>  
    </head>  
    <body>  
     列表显示
       <br/>  
       <table  border="1">
       <tr>
                    <td>id</td>
                    <td>name</td>
                    <td>mobile</td>
                  
                  </tr>
  <c:forEach var="user" items="${userlist}">
                 <%--用EL表达式调用list对象的属性循环输出对象的各个属性值--%>

                 <tr>
                    <td>${user.id}</td>
                    <td>${user.name}</td>
                    <td>${user.mobile}</td>
                  
                  </tr>

</c:forEach>
</table>
    </body>  
    </html></span></span>  