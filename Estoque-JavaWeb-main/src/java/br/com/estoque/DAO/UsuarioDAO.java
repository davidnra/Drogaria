package br.com.estoque.DAO;

import br.com.estoque.DTO.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {
    Connection conn;
    PreparedStatement pstm;
    
    public void CadastrarUsuario(Usuario usuario) throws ClassNotFoundException {
        String sql = "INSERT INTO usuario(nome, email, senha) VALUES (?, ?, ?)";
        conn = new ConexaoDAO().conexaoDB();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, usuario.getUsuarioNome());
            pstm.setString(2, usuario.getUsuarioEmail());
          
            pstm.setString(3, usuario.getUsuarioSenha());
            pstm.execute();
            pstm.close();
            
        } catch(SQLException e) {
            System.out.println("Não foi possível cadastrar");
        }
    }
}
