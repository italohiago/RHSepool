/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import DAO.DAOUsuario;
import modelo.ModeloUsuario;

/**
 *
 * @author italo
 */
public class TesteUsuario {
   
    public static void main(String[] args){
        if(registrarUsuario("italo"))
            System.out.println("Usuario Registrado");
        else
            System.out.println("Erro ao registrar usuario");
        
        if(registrarUsuario("hiago"))
            System.out.println("Usuario Registrado");
        else
            System.out.println("Erro ao registrar usuario");
        
        
        if(removerUsuario())
            System.out.println("Usuario Removido");
        else
            System.out.println("Erro ao remover usuario");
        
        if(buscarIdUsuario("hiago"))
            System.out.println("Usuario encontrado");
        else
            System.out.println("Erro ao encontrar usuario");
    
        if(alterarUsuario("italo", "hiago"))
            System.out.println("Usuario alterado");
        else
            System.out.println("Erro ao alterar usuario");
        
        if(alterarUsuario("hiago", "italo"))
            System.out.println("Usuario alterado");
        else
            System.out.println("Erro ao alterar usuario");
        
        
    }

    private static boolean registrarUsuario(String usuario) {
        ModeloUsuario model = new ModeloUsuario();
        DAOUsuario dao = new DAOUsuario();
        
        model.setUsuario(usuario);
        model.setSenha("123");
        model.setPermissao("Administrador Geral");
        if(dao.registrarUsuarioDAO(model) == 1){
            return true;
        }
        return false;
    }    
    
    private static boolean removerUsuario() {
        /*
            Para funcionar, o usuário deve ser removido de todas as tabelas antes
        */
        ModeloUsuario model = new ModeloUsuario();
        DAOUsuario dao = new DAOUsuario();
        
        model.setUsuario("italo");
        if(dao.removerUsuarioDAO(model) == 1){
            return true;
        }
        return false;
    }  
    
    private static boolean buscarIdUsuario(String usuario) {
        ModeloUsuario model = new ModeloUsuario();
        DAOUsuario dao = new DAOUsuario();
        
        model.setUsuario(usuario);
        if(dao.buscarIdUsuarioDAO(model) == 0){
            return false;
        }
        return true;
    } 
    
    private static boolean alterarUsuario(String usuarioNovo, String usuarioVelho) {
        ModeloUsuario model = new ModeloUsuario();
        DAOUsuario dao = new DAOUsuario();
        
        model.setUsuario(usuarioVelho);
        model.setUsuarioNovo(usuarioNovo);
        model.setPermissao("membro comum");
        model.setSenha("123");
        if(dao.alterarUsuarioDAO(model) == 1){
            return true;
        }
        return false;
    } 
}
