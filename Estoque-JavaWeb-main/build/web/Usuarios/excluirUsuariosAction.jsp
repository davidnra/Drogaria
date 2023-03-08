<%@page import="br.com.estoque.DAO.UsuariosDAO"%>
<%@page import="br.com.estoque.DTO.Usuarios"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Usuarios usuario = new Usuarios();
                int id = Integer.parseInt(request.getParameter("id"));
                usuario.setUsuariosID(id);
                
                UsuariosDAO usuarioDAO = new UsuariosDAO();
                usuarioDAO.ExcluirUsuarios(usuario);

                response.sendRedirect("listarUsuarios.jsp");
        %>
    </body>
</html>
