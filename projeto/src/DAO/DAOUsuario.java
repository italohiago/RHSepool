package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.ModeloUsuario;

public class DAOUsuario {
    ConexaoBD conex = new ConexaoBD();
    
    public byte registrarUsuarioDAO(ModeloUsuario model){
        conex.conectar();
        
        byte idPermissao = buscarIdPermissaoDAO(model);
        
        if(idPermissao != 0){
            try {
                PreparedStatement pst = conex.con.prepareStatement("INSERT usuarios(id_permissao, usuario, senha) VALUES (?, ?, md5(?));");
                pst.setByte(1, idPermissao);
                pst.setString(2, model.getUsuario());
                pst.setString(3, model.getSenha());
                pst.execute();
            } catch (SQLException ex){
                conex.desconectar();
                return 2;       //Erro ao registrar no banco      
            }
        }else{
            conex.desconectar();
            return 0;           //Erro ao buscar permissão no banco
        }
        conex.desconectar();
        return 1;               //Salvo com sucesso
    }
    
    public byte removerUsuarioDAO(ModeloUsuario model){
        conex.conectar();
        try {
                PreparedStatement pst = conex.con.prepareStatement("DELETE FROM usuarios where usuario = ?;");
                pst.setString(1, model.getUsuario());
                pst.execute();
            } catch (SQLException ex){
                System.out.println(ex);
                conex.desconectar();
                return 0;       //Erro ao remover no banco      
            }
        conex.desconectar();
        return 1;               //Removido com sucesso
    }
    
    public byte alterarUsuarioDAO(ModeloUsuario model){
        conex.conectar();
        
        byte idPermissao = buscarIdPermissaoDAO(model);
        
        if(idPermissao != 0){
            try {
                    PreparedStatement pst = conex.con.prepareStatement("UPDATE usuarios SET id_permissao = ?, usuario = ?, senha = md5(?) WHERE usuario = ?;");
                    pst.setByte(1, idPermissao);
                    pst.setString(2, model.getUsuarioNovo());
                    pst.setString(3, model.getSenha());
                    pst.setString(4, model.getUsuario());
                    pst.execute();
                } catch (SQLException ex){
                    conex.desconectar();
                    System.out.println(ex);
                    return 2;       //Erro ao alterar no banco      
                }
        }else{
            conex.desconectar();
            return 0;           //Erro ao buscar permissão no banco
        }
        
        conex.desconectar();
        return 1;               //Salvo com sucesso
    }
    
    public byte buscarIdUsuarioDAO(ModeloUsuario model){
        conex.conectar();
        conex.consultaSql("SELECT id_usuario FROM usuarios WHERE usuario like '"+model.getUsuario()+"';");
        try {
            if(conex.rs.first()){
                byte id = (byte)conex.rs.getInt("id_usuario");
                conex.desconectar();
                return id;
            }
        } catch (SQLException ex) {}
        conex.desconectar();
        return 0;           //Usuário não encontrado
    }
    
    public byte buscarIdPermissaoDAO(ModeloUsuario model){
        conex.consultaSql("SELECT id_permissao FROM permissoes WHERE permissao like '"+model.getPermissao()+"';");
        try {
            if(conex.rs.first())
                return (byte)conex.rs.getInt("id_permissao");
        } catch (SQLException ex) {}
        return 0;   //Permissao não encontrada
    }
  
}