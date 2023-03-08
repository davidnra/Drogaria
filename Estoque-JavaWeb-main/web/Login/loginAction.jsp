
<%@page import="java.util.ArrayList"%>
<%@page import="br.com.site.check.login"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            try {
                String nome = request.getParameter("email");
                String email = request.getParameter("senha");
                
                login check = new login();
                if (check.checkLogin(nome, email)) {
                    response.sendRedirect("../home.jsp");
                }
                
            } catch(Exception e) {
                out.println("Não cadastrado. Erro: " + e);
            }
        %>
    </body>
</html>
