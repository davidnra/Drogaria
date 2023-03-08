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
            Usuarios usuarios = new Usuarios();
                int id = Integer.parseInt(request.getParameter("id"));
                usuarios.setUsuariosID(id);
                usuarios.setUsuariosNome(request.getParameter("nome"));
                usuarios.setUsuariosEmail(request.getParameter("email"));
                usuarios.setUsuariosSenha(request.getParameter("senha")); 

                UsuariosDAO usuariosDAO = new UsuariosDAO();
                usuariosDAO.EditarUsuarios(usuarios);

                response.sendRedirect("listarUsuarios.jsp");
        %>
    </body>
</html>
