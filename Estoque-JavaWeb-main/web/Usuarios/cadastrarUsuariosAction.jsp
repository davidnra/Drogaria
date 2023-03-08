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
            try {
                Usuarios usuarios = new Usuarios();

                usuarios.setUsuariosNome(request.getParameter("nome"));
                usuarios.setUsuariosEmail(request.getParameter("email"));
                usuarios.setUsuariosSenha(request.getParameter("senha"));
                
                UsuariosDAO usuariosDAO = new UsuariosDAO();
                usuariosDAO.CadastrarUsuarios(usuarios);
                
                response.sendRedirect("listarUsuarios.jsp");
            } catch(Exception e){
                System.out.println("Não cadastrou o Usuários. Erro: " + e);
            }
            
        %>    
    </body>
</html>
