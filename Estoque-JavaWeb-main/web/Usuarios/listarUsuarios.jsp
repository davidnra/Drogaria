<%@page import="java.util.ArrayList"%>
<%@page import="br.com.estoque.DTO.Usuarios"%>
<%@page import="br.com.estoque.DAO.UsuariosDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="../Includes/head.jsp"></jsp:include>
    <body>
        <jsp:include page="../Includes/navbar.jsp">
            <jsp:param name="title" value="Lista de Clientes" />
        </jsp:include>
        
        <div class="container">
            <h1 class="mt-3">Lista de Usuarios</h1>
            <div class="mt-1 mb-3">
                <a type="button" class="btn btn-primary" href="/Estoque/Usuarios/frmCadastrarUsuarios.jsp" >Cadastrar Usuario</a>
            </div>
            <table class="table">
                <thead>
                  <tr>    
                    <th scope="col">Código</th>
                    <th scope="col">Nome</th>                    
                    <th scope="col">Email</th>
                   
                                      
                    <th scope="col" colspan="3">Ação</th>
                  </tr>
                </thead>
                <tbody>                    
                        <%                                                    
                            try {
                                UsuariosDAO usuariosDAO = new UsuariosDAO();
                                ArrayList<Usuarios> lista = usuariosDAO.PesquisarUsuarios();
                                
                                for(int i = 0; i < lista.size(); i++){
                                
                                %>
                                <tr>                                    
                                <%
                                    out.print("<td>"+ lista.get(i).getUsuariosID()+"</td>");
                                    out.print("<td>"+ lista.get(i).getUsuariosNome() +"</td>");
                                    out.print("<td>"+lista.get(i).getUsuariosEmail() +"</td>");
                              
                                    
                                    out.print("<td><a type='button' class='btn btn-success me-2' href='frmEditarUsuarios.jsp?id=" 
                                                + lista.get(i).getUsuariosID() +
                                                "&nome="+ lista.get(i).getUsuariosNome() + 
                                                "&email="+ lista.get(i).getUsuariosEmail()+
                                                "&senha="+ lista.get(i).getUsuariosSenha()+
                                                                                              
                                                "'>Editar</a>");
                                    out.print("<a type='button' class='btn btn-danger me-2' href='frmExcluirUsuarios.jsp?id=" 
                                                + lista.get(i).getUsuariosID() +
                                                "&nome="+ lista.get(i).getUsuariosNome() + 
                                                "&email="+ lista.get(i).getUsuariosEmail()+
                                                "&senha="+ lista.get(i).getUsuariosSenha()+
                                                "'>Excluir</a>");
                                     
                                %>    
                                </tr>
                                <%
                                }     
                            }catch(Exception e){
                            }

                       %>  
                             
                </tbody>
            </table>    
            
        </div>
    </body>
</html>
