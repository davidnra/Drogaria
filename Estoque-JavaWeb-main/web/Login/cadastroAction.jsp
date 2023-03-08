<%@page import="java.util.ArrayList"%>
<%@page import="br.com.estoque.DAO.UsuarioDAO"%>
<%@page import="br.com.estoque.DTO.Usuario"%>

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
                Usuario usuario = new Usuario();
                
                usuario.setUsuarioNome(request.getParameter("nome"));
                usuario.setUsuarioEmail(request.getParameter("email"));
                usuario.setUsuarioSenha(request.getParameter("senha"));
                
                UsuarioDAO usuarioDAO = new UsuarioDAO();
                usuarioDAO.CadastrarUsuario(usuario);
                
                response.sendRedirect("login.jsp");
            } catch(Exception e) {
                out.println("Não cadastrado. Erro: " + e);
            }
        %>
    </body>
</html>
