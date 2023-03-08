package br.com.estoque.DAO;

import br.com.estoque.DTO.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsuariosDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<Usuarios> lista = new ArrayList<>();
    
    public void CadastrarUsuarios(Usuarios usuarios) throws ClassNotFoundException {
        String sql = "INSERT INTO usuarios(nome, email, senha) VALUES (?, ?, ?)";
        conn = new ConexaoDAO().conexaoDB();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, usuarios.getUsuariosNome());
            pstm.setString(2, usuarios.getUsuariosEmail());
            pstm.setString(3, usuarios.getUsuariosSenha());
            pstm.execute();
            pstm.close();
            
        } catch(SQLException e) {
            System.out.println("Não foi possível cadastrar");
        }
     }   
        
       public ArrayList<Usuarios> PesquisarUsuarios(){
        String sql = "Select * from usuarios";
        conn = new ConexaoDAO().conexaoDB();
        
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                Usuarios usuarios = new Usuarios();
                usuarios.setUsuariosID(rs.getInt("id"));
                usuarios.setUsuariosNome(rs.getString("nome"));
                usuarios.setUsuariosEmail(rs.getString("email"));
                usuarios.setUsuariosSenha(rs.getString("senha"));
                lista.add(usuarios);
            }
            pstm.close();
        }catch(SQLException e){
        
        }
        return lista;
    }
    
    public ArrayList<Usuarios> PesquisarUsuariosPorID(int id){
        String sql = "Select * from usuario WHERE id="+id;
        conn = new ConexaoDAO().conexaoDB();
        
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                Usuarios usuarios = new Usuarios();
                usuarios.setUsuariosID(rs.getInt("id"));
                usuarios.setUsuariosNome(rs.getString("nome"));
                usuarios.setUsuariosEmail(rs.getString("email"));
                 usuarios.setUsuariosSenha(rs.getString("senha"));
                lista.add(usuarios);
            }
            pstm.close();
        }catch(SQLException e){
        
        }
        return lista;
    }
    
    public void EditarUsuarios(Usuarios usuarios){
        String sql = "UPDATE usuarios SET nome=?, email=?, senha=? WHERE id=?";
        conn = new ConexaoDAO().conexaoDB();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, usuarios.getUsuariosNome());
            pstm.setString(2, usuarios.getUsuariosEmail());
            pstm.setString(3, usuarios.getUsuariosSenha());
            pstm.setInt(4, usuarios.getUsuariosID());
            pstm.execute();
            pstm.close();
        }catch(SQLException e){ 
            System.out.println("Não foi possível alterar. Erro: " + e);
        }
    }
    
    public void ExcluirUsuarios(Usuarios usuarios){
        
        String sql = "DELETE FROM usuarios WHERE id=?";
        conn = new ConexaoDAO().conexaoDB();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1,usuarios.getUsuariosID());
            pstm.execute();
            pstm.close();
            
        }catch(SQLException e){
        }
        
        
    }
}
