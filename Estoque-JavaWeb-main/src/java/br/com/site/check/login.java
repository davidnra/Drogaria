
package br.com.site.check;

import br.com.estoque.DAO.ConexaoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class login {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    
    public boolean checkLogin(String email, String senha) throws ClassNotFoundException {
        conn = new ConexaoDAO().conexaoDB();
        boolean check = false;
        
        if (!email.isEmpty() && !senha.isEmpty()) {
            try {
                pstm = conn.prepareStatement("SELECT * FROM usuario WHERE email = ? and senha = ?");
                pstm.setString(1, email);
                pstm.setString(2, senha);
                rs = pstm.executeQuery();
            
                if (rs.next()) {
                    check = true;
                }
            
            } catch(SQLException e) {
                System.out.println("Não foi possível logar");
            }
        }
        return check;
    }
}
