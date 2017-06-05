    
package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.ModeloEquipe;
import modelo.ModeloProjeto;
import modelo.ModeloUsuario;

public class DAOEquipe {
    ConexaoBD conex = new ConexaoBD();
    
    public byte registrarEquipeDAO(ModeloEquipe modelE){
        DAOProjeto dao = new DAOProjeto();
        ModeloProjeto modelP = new ModeloProjeto();
        modelP.setProjeto(modelE.getProjeto());
        
        conex.conectar();
        
        int idProjeto = dao.buscarIdProjetoDAO(modelP);
        
        if(idProjeto != 0){
            try {
                PreparedStatement pst = conex.con.prepareStatement("INSERT equipes(equipe, id_projeto) VALUES (?, ?);");
                pst.setString(1, modelE.getEquipe());
                pst.setInt(2, idProjeto);
                pst.execute();
            } catch (SQLException ex){
                conex.desconectar();
                return 2;       //Erro ao registrar no banco      
            }
        }else{
            conex.desconectar();
            return 0;           //Erro ao buscar projeto no banco
        }
        conex.desconectar();
    
        return 1;               //Salvo com sucesso
    }
    
    public byte registrarUsuarioEquipeDAO(ModeloEquipe modelE, ModeloUsuario modelU){
        DAOUsuario dao = new DAOUsuario();
        
        byte idUsuario = dao.buscarIdUsuarioDAO(modelU);
        int idEquipe = buscarIdEquipeDAO(modelE);
        
        conex.conectar();
        try {
            PreparedStatement pst = conex.con.prepareStatement("INSERT equipe_usuario (id_usuario, id_equipe) VALUES (?,?);");
            pst.setByte(1, idUsuario);
            pst.setInt(2, idEquipe);
            pst.execute();
        } catch (SQLException ex) {
            System.out.println(ex);
            conex.desconectar();
            return 0; //Erro ao registrar no banco
        }
        
        conex.desconectar();
        return 1;   //Salvo com sucesso
    }
    
    public byte removerEquipeDAO(ModeloEquipe model){
        /*
            Antes de remover uma equipe, primeiro, deve-se excluir todas as associações entre equipe e usuário, ou seja
            excluir os elementos da tabela "equipe_usuario".
        */
        conex.conectar();
        try {
                PreparedStatement pst = conex.con.prepareStatement("DELETE FROM equipes WHERE equipe = ?;");
                pst.setString(1, model.getEquipe());
                pst.execute();
            } catch (SQLException ex){
                System.out.println(ex);
                conex.desconectar();
                return 0;       //Erro ao remover no banco      
            }
        conex.desconectar();
        return 1;               //Removido com sucesso
    }
    
    public byte removerUsuarioEquipeDAO(ModeloEquipe modelE, ModeloUsuario modelU){
        DAOUsuario dao = new DAOUsuario();
        
        byte idUsuario = dao.buscarIdUsuarioDAO(modelU);
        int idEquipe = buscarIdEquipeDAO(modelE);
        
        conex.conectar();
        if(idUsuario != 0 && idEquipe !=0){
            try {
                    PreparedStatement pst = conex.con.prepareStatement("DELETE FROM equipe_usuario WHERE id_equipe = ? AND id_usuario = ?");
                    pst.setInt(1, idEquipe);
                    pst.setByte(2, idUsuario);
                    pst.execute();
                } catch (SQLException ex){
                    System.out.println(ex);
                    conex.desconectar();
                    return 2;       //Erro ao remover no banco      
                }
        }else{
            conex.desconectar();
            return 0;               //Erro ao buscar usuário ou equipe no banco
        }
        
        conex.desconectar();
        return 1;                   //Removido com sucesso
    }
    
    public byte alterarEquipeDAO(){
        return 0;
    }
    
    public int buscarIdEquipeDAO(ModeloEquipe model){
        conex.conectar();
        conex.consultaSql("SELECT id_equipe FROM equipes WHERE equipe like '"+model.getEquipe()+"';");
        try {
            if(conex.rs.first()){
                int id = conex.rs.getInt("id_equipe");
                conex.desconectar();
                return id;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        conex.desconectar();
        return 0;           //Equipe não encontrada
    }
    
}
