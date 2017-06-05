package teste;

import DAO.DAOReuniao;
import modelo.ModeloReuniao;
import modelo.ModeloUsuario;

public class TesteReuniao {
    public static void main(String[] args){
        if(registrarReuniao("Reunião lampada inside"))
            System.out.println("Reunião registrada com sucesso!");
        else
            System.out.println("Erro ao registrar reunião!");
        
        if(registrarUsuarioReuniao("Reunião lampada inside", "hiago"))
            System.out.println("Reunião_usuario registrada com sucesso!");
        else
            System.out.println("Erro ao registrar reunião_usuario!"); 
        
        if(excluirReuniaoUsuario("Reunião lampada inside", "hiago"))
            System.out.println("Usuário excluido da reunião com sucesso!");
        else
            System.out.println("Erro ao excluir usuário da reunião!");  

        if(alterarReuniao("Reunião lampada inside"))
            System.out.println("Reunião alterada com sucesso!");
        else
            System.out.println("Erro ao alterar reunião!");
        
        if(excluirReuniao("Reunião RH", "2017-03-14"))
            System.out.println("Reunião excluida com sucesso!");
        else
            System.out.println("Erro ao excluir reunião!");
    }
    
    private static boolean alterarReuniao(String reuniao){
        ModeloReuniao model = new ModeloReuniao();
        DAOReuniao dao = new DAOReuniao();
        
        model.setReuniao(reuniao);
        model.setDataReuniao("2017-03-14");
        model.setHorarioInicio("12:25:00");
        model.setHorarioFinal("14:00:00");
        model.setReuniaoNova("Reunião RH");
        model.setDataNova("2017-04-24");
        
        return dao.alterarReuniaoDAO(model) == 1;    
    }
    private static boolean excluirReuniaoUsuario(String reuniao, String usuario){
        ModeloReuniao modelR = new ModeloReuniao();
        ModeloUsuario modelU = new ModeloUsuario();
        DAOReuniao dao = new DAOReuniao();
        
        modelR.setReuniao(reuniao);
        modelR.setDataReuniao("2017-03-14");
        
        modelU.setUsuario(usuario);
        
        return (dao.removerUsuarioReuniaoDAO(modelR, modelU) == 1);
    }
    private static boolean excluirReuniao(String reuniao, String data){
        ModeloReuniao model = new ModeloReuniao();
        DAOReuniao dao = new DAOReuniao();
        
        model.setReuniao(reuniao);
        model.setDataReuniao(data);
        
        return (dao.removerReuniaoDAO(model) == 1);
    }
    
    private static boolean registrarReuniao(String reuniao) {
        ModeloReuniao model = new ModeloReuniao();
        DAOReuniao dao = new DAOReuniao();
        
        model.setReuniao(reuniao);
        model.setDataReuniao("2017-03-14");
        model.setHorarioInicio("12:25:00");
        model.setHorarioFinal("14:00:00");
        return dao.registrarReuniaoDAO(model) == 1;
    }
    
    private static boolean registrarUsuarioReuniao(String reuniao, String usuario) {
        ModeloReuniao modelR = new ModeloReuniao();
        ModeloUsuario modelU = new ModeloUsuario();
        DAOReuniao dao = new DAOReuniao();
        
        modelR.setReuniao(reuniao);
        modelR.setDataReuniao("2017-03-14");
        
        modelU.setUsuario(usuario);
        
        return dao.registrarUsuarioReuniaoDAO(modelR, modelU) == 1;
    }
}
