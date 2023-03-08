
package br.com.estoque.DTO;


public class Usuario {
    private int usuarioID;
    private String usuarioNome;
    private String usuarioEmail;
    private String usuarioSenha;
   
    
    public int getUsuarioID() {
        return usuarioID;
    }
    
    public void setUsuarioID(int usuarioID) {
        this.usuarioID = usuarioID;
    }
    
    public String getUsuarioNome() {
        return usuarioNome;
    }
    
    public void setUsuarioNome(String usuarioNome) {
        this.usuarioNome = usuarioNome;
    }
    
    public String getUsuarioEmail() {
        return usuarioEmail;
    }
    
    public void setUsuarioEmail(String usuarioEmail) {
        this.usuarioEmail = usuarioEmail;
    }
    
    public String getUsuarioSenha() {
        return usuarioSenha;
    }
    
    public void setUsuarioSenha(String usuarioSenha) {
        this.usuarioSenha = usuarioSenha;
    }
    

}
