
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    
    <jsp:include page="../Includes/head.jsp"></jsp:include>
    <body>
    <jsp:include page="../Includes/navbar.jsp">
        <jsp:param name="title" value="Login" />
    </jsp:include>
    
    
    <title> Cadastro do Usuário </title>
    
    <body>
        
        
        
        <div class="container"><br/>
            <h1> Cadastro do Usuário </h1>
            <form action="cadastroAction.jsp" method="POST"><br/>
                <div>
                    <label> Nome </label><br/>
                    <input type="text" name="nome" id="text" placeholder="Nome Completo" />
                </div><br/>
                <div>
                    <label> Email </label><br/>
                    <input type="email" name="email" placeholder="Digite seu Email" />
                </div><br/>
                <div>
                    <label> Confirme seu Email </label><br/>
                    <input type="email" name="email" placeholder="Confirme seu Email" />
                </div><br/>
               
                <div>
                    <label> Senha </label><br/>
                    <input type="password" name="senha" id="login" placeholder="Senha" />
                </div><br/>
                <div>
                    <label> Confirme sua Senha </label><br/>
                    <input type="password" name="senha" placeholder="Confirme sua Senha" />
                </div><br/>
                
                <button type="submit"> Cadastrar </button>
            </form>
        </div>
    </body>
</html>
