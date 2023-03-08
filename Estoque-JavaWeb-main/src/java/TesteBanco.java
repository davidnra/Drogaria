
import br.com.estoque.DAO.ConexaoDAO;
import java.sql.Connection;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 51127512021.2
 */
public class TesteBanco {
    public static void main(String[] args){
        Connection cnx = null;
        
        ConexaoDAO dao = new ConexaoDAO();
        
        cnx = dao.conexaoDB();
        
        if(cnx == null){
            System.out.println("Erro");
        } else {
            System.out.println("Sucesso");
        }
    }
}
