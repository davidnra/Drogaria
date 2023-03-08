
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>

<html>

 <jsp:include page="Includes/head.jsp"></jsp:include>
        
        
    <link rel="stylesheet" href="../CSS/login.css"/>
    <title> Login do Usuário </title>
    
    <body>
        
      
        
        <div class="container"><br/>
            <h1> Login do Usuário </h1>
            <form action="./Login/loginAction.jsp" method="POST"><br/>
                <div>
                    <label> Email </label><br/>
                    <input type="email" name="email" id="login" placeholder="Insira seu Email" />
                </div><br/>
                <div>
                    <label> Senha </label><br/>
                    <input type="password" name="senha" id="login" placeholder="Insira sua Senha" />
                </div><br/>
                
                <a href="cadastro.jsp"> Cadastre-se </a><br/>
                <button type="submit"> Login </button>
            </form>
        </div>
    </body>
</html>
