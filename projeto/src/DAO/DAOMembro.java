package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.ModeloMembro;
import modelo.ModeloUsuario;

public class DAOMembro {
    ConexaoBD conex = new ConexaoBD();
    //alterar aqui
    public byte registrarMembroDAO(ModeloMembro modelM, ModeloUsuario modelU){
        DAOUsuario dao = new DAOUsuario();
        byte idUsuario = dao.buscarIdUsuarioDAO(modelU);
        
        conex.conectar();
        
        if(idUsuario != 0){
            try {
                PreparedStatement pst = conex.con.prepareStatement("INSERT membros(id_usuario, nome, bairro, telefone, email, sexo, veiculo, curso, matricula,semestre,turno_not, turno_mat, turno_ves, observacoes, avaliado) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
                pst.setByte(1, idUsuario);
                pst.setString(2, modelM.getNome());
                pst.setString(3, modelM.getBairro());
                pst.setString(4, modelM.getTelefone());
                pst.setString(5, modelM.getEmail());
                pst.setString(6, modelM.getSexo());
                pst.setByte(7, modelM.getVeiculo());
                pst.setString(8, modelM.getCurso());
                pst.setInt(9, modelM.getMatricula());
                pst.setByte(10, modelM.getSemestre());
                pst.setByte(11, modelM.getTurnoNot());
                pst.setByte(12, modelM.getTurnoMat());
                pst.setByte(13, modelM.getTurnoVesp());
                pst.setString(14, modelM.getObservacoes());
                pst.setInt(15, 2);  //2 Significa "em avaliação"; 0 Significa "recusado"; 1 Significa "aceito";
                pst.execute();
            } catch (SQLException ex){
                conex.desconectar();
                return 2;       //Erro ao registrar no banco      
            }
        }else{
            conex.desconectar();
            return 0;           //Erro ao buscar usuario no banco
        }
        conex.desconectar();
        return 1;               //Salvo com sucesso
    }
    
    public byte removerMembroDAO(){
        return 0;
    }
    
    public byte alterarMembroDAO(){
        return 0;
    }
    
    public byte avaliarMembroDAO(){
        return 0;
    }
    
    public byte buscarIdMembroDAO(){
        return 0;
    }

    
}
