
<html>
    <jsp:include page="Includes/head.jsp"></jsp:include>
    <body>
    <jsp:include page="Includes/navbar.jsp">
        <jsp:param name="title" value="Home" />
    </jsp:include>
        
         <div class="container">
            <div>
                <h1>Gerenciamento de Sede</h1>
                <h2>Niterói</h2>
<!--                 <td><a type="button" class="btn btn-primary"  href="./Login/login.jsp"> Login </a></td>-->
<!--                 <td><a type="button" class="btn btn-primary"  href="./Login/cadastro.jsp"> Cadastro </a></td>-->
            </div>             
            
            <a type="button" class="btn btn-primary" href="/Estoque/Produtos/listarProdutos.jsp">Produtos</a>
            <a type="button" class="btn btn-success" href="/Estoque/Clientes/listarClientes.jsp">Clientes</a>
            <a type="button" class="btn btn-danger" href="/Estoque/Vendedores/listarVendedores.jsp">Vendedores</a>
            <a type="button" class="btn btn-danger" href="/Estoque/Usuarios/listarUsuarios.jsp">Usuários</a>
        </div>
    </body>
</html>
