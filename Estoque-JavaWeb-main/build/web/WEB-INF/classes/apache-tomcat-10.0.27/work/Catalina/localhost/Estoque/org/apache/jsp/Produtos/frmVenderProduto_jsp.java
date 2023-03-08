/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.27
 * Generated at: 2023-03-07 23:58:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Produtos;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import br.com.estoque.DAO.VendedorDAO;
import br.com.estoque.DTO.Vendedor;
import br.com.estoque.DAO.ClienteDAO;
import br.com.estoque.DTO.Cliente;
import java.util.ArrayList;
import br.com.estoque.DTO.Produto;
import br.com.estoque.DAO.ProdutoDAO;

public final class frmVenderProduto_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("br.com.estoque.DAO.VendedorDAO");
    _jspx_imports_classes.add("br.com.estoque.DTO.Produto");
    _jspx_imports_classes.add("br.com.estoque.DTO.Cliente");
    _jspx_imports_classes.add("br.com.estoque.DTO.Vendedor");
    _jspx_imports_classes.add("br.com.estoque.DAO.ClienteDAO");
    _jspx_imports_classes.add("br.com.estoque.DAO.ProdutoDAO");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Includes/head.jsp", out, false);
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Includes/navbar.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("title", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("Detalhes do Produto", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1 class=\"mt-3\">Detalhes do Produto:</h1>\n");
      out.write("            <div class=\"col-md-8\">\n");
      out.write("            <form action=\"venderProdutoAction.jsp\" method=\"POST\">\n");
      out.write("                    \n");
      out.write("                    <input type=\"hidden\" name=\"id\" value=\"");
      out.print(request.getParameter("id"));
      out.write("\" />\n");
      out.write("                    <input type=\"hidden\" name=\"valor\" value=\"");
      out.print(request.getParameter("valor"));
      out.write("\" />\n");
      out.write("                    <input type=\"hidden\" name=\"quantidade\" value=\"");
      out.print(request.getParameter("quantidade"));
      out.write("\" />\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-3\">Código do Produto: </div>\n");
      out.write("                            <div class=\"col-md-4\">");
      out.print(request.getParameter("id"));
      out.write("</div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-3\">Produto: </div>\n");
      out.write("                            <div class=\"col-md-4\">");
      out.print(request.getParameter("nome"));
      out.write("</div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-3\">Valor: </div>\n");
      out.write("                            <div class=\"col-md-4\">R$ ");
      out.print(request.getParameter("valor"));
      out.write("</div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-3\">Quantidade: </div>\n");
      out.write("                            <div class=\"col-md-4\">");
      out.print(request.getParameter("quantidade"));
      out.write("</div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-3\">Quantidade Mínima: </div>\n");
      out.write("                            <div class=\"col-md-4\">");
      out.print(request.getParameter("min_quantidade"));
      out.write("</div>\n");
      out.write("                        </div>     \n");
      out.write("                         \n");
      out.write("                    \n");
      out.write("                        <div class=\"mt-3 col-md-5\">\n");
      out.write("                            <label class=\"form-label\">Cliente</label>\n");
      out.write("                            <select name=\"cliente\" class=\"form-select\">\n");
      out.write("                                ");

                                    ClienteDAO clienteDAO = new ClienteDAO();
                                    ArrayList<Cliente> lista = clienteDAO.PesquisarClientes();
                                    for (int i = 0; i < lista.size(); i++) {
                                       
      out.write("\n");
      out.write("                                       <option  value=\"");
      out.print(lista.get(i).getId());
      out.write('"');
      out.write('>');
      out.print(lista.get(i).getId());
      out.write(' ');
      out.write('-');
      out.write(' ');
      out.print(lista.get(i).getNome());
      out.write("</option>\n");
      out.write("                                        ");

                                    }
                                
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"mt-3 col-md-5\">\n");
      out.write("                            <label class=\"form-label\">Vendedor</label>\n");
      out.write("                            <select name=\"vendedor\" class=\"form-select\">\n");
      out.write("                                ");

                                    VendedorDAO vendedorDAO = new VendedorDAO();
                                    ArrayList<Vendedor> vendedor = vendedorDAO.PesquisarVendedors();
                                    for (int i = 0; i < vendedor.size(); i++) {
                                       
      out.write("\n");
      out.write("                                       <option  value=\"");
      out.print(vendedor.get(i).getId());
      out.write('"');
      out.write('>');
      out.print(vendedor.get(i).getId());
      out.write(' ');
      out.write('-');
      out.write(' ');
      out.print(vendedor.get(i).getNome());
      out.write("</option>\n");
      out.write("                                        ");

                                    }
                                
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                        </div>    \n");
      out.write("                                \n");
      out.write("                        <button type=\"submit\" class=\"btn btn-success mt-3\">Vender</button>\n");
      out.write("                    </div>     \n");
      out.write("                </form>\n");
      out.write("                \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
