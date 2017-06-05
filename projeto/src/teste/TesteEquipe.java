package teste;

import DAO.DAOEquipe;
import modelo.ModeloEquipe;
import modelo.ModeloUsuario;

public class TesteEquipe {
    public static void main(String[] args){
        if(registrarEquipe("Unica equipe"))
            System.out.println("Equipe registrada com sucesso!");
        else
            System.out.println("Erro ao registrar equipe!");
        
        if(registrarEquipeUsuario("Unica equipe"))
            System.out.println("Usuário registrado na equipe com sucesso!");
        else
            System.out.println("Erro ao registrar usuário na equipe!");
        
        if(removerEquipeUsuario("Unica equipe"))
            System.out.println("Usuário removido da equipe com sucesso!");
        else
            System.out.println("Erro ao remover usuário da equipe!");
        
        if(removerEquipe("Unica equipe"))
            System.out.println("Equipe removida com sucesso!");
        else
            System.out.println("Erro ao remover equipe!");
    }
    
    private static boolean removerEquipe(String equipe){
        ModeloEquipe modelE = new ModeloEquipe();
        DAOEquipe dao = new DAOEquipe();
        
        modelE.setEquipe(equipe);
        return dao.removerEquipeDAO(modelE) == 1;
    }
    private static boolean removerEquipeUsuario(String equipe){
        ModeloEquipe modelE = new ModeloEquipe();
        ModeloUsuario modelU = new ModeloUsuario();
        DAOEquipe dao = new DAOEquipe();
        
        modelE.setEquipe(equipe);
        modelU.setUsuario("hiago");
        
        return dao.removerUsuarioEquipeDAO(modelE, modelU) == 1;
    }
    
    private static boolean registrarEquipeUsuario(String equipe){
        ModeloEquipe modelE = new ModeloEquipe();
        ModeloUsuario modelU = new ModeloUsuario();
        DAOEquipe dao = new DAOEquipe();
        
        modelE.setEquipe(equipe);
        modelU.setUsuario("hiago");
        
        return dao.registrarUsuarioEquipeDAO(modelE, modelU) == 1;
    }
    private static boolean registrarEquipe(String equipe){
        ModeloEquipe model = new ModeloEquipe();
        DAOEquipe dao = new DAOEquipe();
        
        model.setEquipe(equipe);
        model.setProjeto("Projeto RH Sepool");
        
        return dao.registrarEquipeDAO(model) == 1;
    }
}
