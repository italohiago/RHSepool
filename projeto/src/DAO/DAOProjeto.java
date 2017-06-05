package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.ModeloProjeto;
import modelo.ModeloUsuario;

public class DAOProjeto {
    ConexaoBD conex = new ConexaoBD();
    
    public byte registrarProjetoDAO(ModeloProjeto modelP, ModeloUsuario modelU){
        DAOUsuario dao = new DAOUsuario();
        
        byte idUsuario = dao.buscarIdUsuarioDAO(modelU);
 
        conex.conectar();
        if(idUsuario != 0){
            try {
                    PreparedStatement pst = conex.con.prepareStatement("INSERT projetos(id_lider, projeto, descricao) VALUES (?, ?, ?);");
                    pst.setByte(1, idUsuario);
                    pst.setString(2, modelP.getProjeto());
                    pst.setString(3, modelP.getDescricao());
                    pst.execute();
                } catch (SQLException ex){
                    System.out.println(ex);
                    conex.desconectar();
                    return 2;       //Erro ao registrar no banco      
                }
        }else{
            conex.desconectar();
            return 0;               //Erro ao buscar usuário no banco
        }
        
        conex.desconectar();
        return 1;               //Salvo com sucesso
    }
    
    public byte removerProjetoDAO(ModeloProjeto model){
        //remove o projeto baseado no id do projeto
        
        int idProjeto = buscarIdProjetoDAO(model);
        conex.conectar();
        
        if(idProjeto !=0){
            try {
                    PreparedStatement pst = conex.con.prepareStatement("DELETE FROM projetos WHERE id_projeto = ?");
                    pst.setInt(1, idProjeto);
                    pst.execute();
                } catch (SQLException ex){
                    System.out.println(ex);
                    conex.desconectar();
                    return 2;       //Erro ao remover no banco      
                }
        }else{
            conex.desconectar();
            return 0;               //Erro ao buscar projeto no banco
        }
        
        conex.desconectar();
        return 1;               //Removido com sucesso        
    }
   
    
    public byte alterarProjetoDAO(ModeloProjeto model){
        conex.conectar();
        
        try {
            PreparedStatement pst = conex.con.prepareStatement("UPDATE projetos SET projeto = ?, descricao = ? WHERE projeto = ?;");
            pst.setString(1, model.getProjetoNovo());
            pst.setString(2, model.getDescricaoNova());
            pst.setString(3, model.getProjeto());
            pst.execute();
        } catch (SQLException ex) {
            System.out.println(ex);
            conex.desconectar();
            return 0;       //Erro ao alterar no banco
        }
        
        conex.desconectar();
        return 1;       //Salvo com sucesso
    }
    
    public int buscarIdProjetoDAO(ModeloProjeto model){
        conex.conectar();
        conex.consultaSql("SELECT id_projeto FROM projetos WHERE projeto like '"+model.getProjeto()+"';");
        try {
            if(conex.rs.first()){
                int id = conex.rs.getInt("id_projeto");
                conex.desconectar();
                return id;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        conex.desconectar();
        return 0;           //Reunião não encontrada
    }
    
}
