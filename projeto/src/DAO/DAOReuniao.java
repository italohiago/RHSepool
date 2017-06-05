package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.ModeloReuniao;
import modelo.ModeloUsuario;

public class DAOReuniao {
    ConexaoBD conex = new ConexaoBD();
    DAOUsuario usuarioDAO = new DAOUsuario();
    
    public byte registrarReuniaoDAO(ModeloReuniao model){
        conex.conectar();
        try {
            PreparedStatement pst = conex.con.prepareStatement("INSERT reunioes (reuniao, data_reuniao, horario_inicio, horario_final) VALUES (?,?,?,?)");
            pst.setString(1, model.getReuniao());
            pst.setString(2, model.getDataReuniao());
            pst.setString(3, model.getHorarioInicio());
            pst.setString(4, model.getHorarioFinal());
            pst.execute();
        } catch (SQLException ex) {
            System.out.println(ex);
            conex.desconectar();
            return 0;       //Erro ao registrar no banco
        }
        
        conex.desconectar();
        return 1;       //Salvo com sucesso
    }
    
    public byte registrarUsuarioReuniaoDAO(ModeloReuniao modelR, ModeloUsuario modelU){
        DAOUsuario dao = new DAOUsuario();
        
        byte idUsuario = dao.buscarIdUsuarioDAO(modelU);
        int idReuniao = buscarIdReuniaoDAO(modelR);
        
        conex.conectar();
        try {
            PreparedStatement pst = conex.con.prepareStatement("INSERT reuniao_usuario (id_usuario, id_reuniao) VALUES (?,?);");
            pst.setByte(1, idUsuario);
            pst.setInt(2, idReuniao);
            pst.execute();
        } catch (SQLException ex) {
            System.out.println(ex);
            conex.desconectar();
            return 0; //Erro ao registrar no banco
        }
        
        conex.desconectar();
        return 1;   //Salvo com sucesso
    }
    
    public byte removerReuniaoDAO(ModeloReuniao model){
        /*
            Antes de remover uma reunião, primeiro, deve-se excluir todas as associações entre reunião e usuário, ou seja
            excluir os elementos da tabela "reuniao_usuario".
        */
        conex.conectar();
        try {
                PreparedStatement pst = conex.con.prepareStatement("DELETE FROM reunioes WHERE reuniao = ? AND data_reuniao = ?;");
                pst.setString(1, model.getReuniao());
                pst.setString(2, model.getDataReuniao());
                pst.execute();
            } catch (SQLException ex){
                System.out.println(ex);
                conex.desconectar();
                return 0;       //Erro ao remover no banco      
            }
        conex.desconectar();
        return 1;               //Removido com sucesso
    }
    
    public byte removerUsuarioReuniaoDAO(ModeloReuniao modelR, ModeloUsuario modelU){
        DAOUsuario dao = new DAOUsuario();
        
        byte idUsuario = dao.buscarIdUsuarioDAO(modelU);
        int idReuniao = buscarIdReuniaoDAO(modelR);
        conex.conectar();
        if(idUsuario != 0 && idReuniao !=0){
            try {
                    PreparedStatement pst = conex.con.prepareStatement("DELETE FROM reuniao_usuario WHERE id_reuniao = ? AND id_usuario = ?");
                    pst.setInt(1, idReuniao);
                    pst.setByte(2, idUsuario);
                    pst.execute();
                } catch (SQLException ex){
                    System.out.println(ex);
                    conex.desconectar();
                    return 2;       //Erro ao remover no banco      
                }
        }else{
            conex.desconectar();
            return 0;               //Erro ao buscar usuário ou reunião no banco
        }
        
        conex.desconectar();
        return 1;               //Removido com sucesso
    }
    
    public byte alterarReuniaoDAO(ModeloReuniao model){
        conex.conectar();
        
        try {
            PreparedStatement pst = conex.con.prepareStatement("UPDATE reunioes SET reuniao = ?, data_reuniao = ?, horario_inicio = ?, horario_final = ? WHERE reuniao = ? AND data_reuniao = ?;");
            pst.setString(1, model.getReuniaoNova());
            pst.setString(2, model.getDataNova());
            pst.setString(3, model.getHorarioInicio());
            pst.setString(4, model.getHorarioFinal());
            pst.setString(5, model.getReuniao());
            pst.setString(6, model.getDataReuniao());
            pst.execute();
        } catch (SQLException ex) {
            System.out.println(ex);
            conex.desconectar();
            return 0;       //Erro ao alterar no banco
        }
        
        conex.desconectar();
        return 1;       //Salvo com sucesso
    }
    
    public int buscarIdReuniaoDAO(ModeloReuniao model){
        conex.conectar();
        conex.consultaSql("SELECT id_reuniao FROM reunioes WHERE reuniao like '"+model.getReuniao()+"' AND data_reuniao = '"+model.getDataReuniao()+"';");
        try {
            if(conex.rs.first()){
                int id = conex.rs.getInt("id_reuniao");
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

