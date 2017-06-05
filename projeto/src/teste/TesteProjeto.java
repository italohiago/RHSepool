package teste;


import DAO.DAOProjeto;
import modelo.ModeloProjeto;
import modelo.ModeloUsuario;

public class TesteProjeto {
    
    public static void main(String[] args){
        if(registrarProjeto("Projeto RH","hiago"))
            System.out.println("Projeto registrado com sucesso!");
        else
            System.out.println("Erro ao registrar projeto!");
        
        if(alterarProjeto("Projeto RH"))
            System.out.println("Projeto alterado com sucesso!");
        else
            System.out.println("Erro ao alterar projeto!");
        
        if(removerProjeto("Projeto RH Sepool"))
            System.out.println("Projeto removido com sucesso!");
        else
            System.out.println("Erro ao remover projeto!");
    }
    
    private static boolean alterarProjeto(String projeto){
        ModeloProjeto model = new ModeloProjeto();
        DAOProjeto dao = new DAOProjeto();
        
        model.setProjeto(projeto);
        model.setProjetoNovo("Projeto RH Sepool");
        model.setDescricaoNova("Projeto para organizar a Sepool");
        
        
        return dao.alterarProjetoDAO(model) == 1;
    }
    
    private static boolean removerProjeto(String projeto){
        
        ModeloProjeto model = new ModeloProjeto();
        DAOProjeto dao = new DAOProjeto();
        
        model.setProjeto(projeto);
        
        return dao.removerProjetoDAO(model) == 1;
    }
    private static boolean registrarProjeto(String projeto, String lider){
        ModeloProjeto modelP = new ModeloProjeto();
        ModeloUsuario modelU = new ModeloUsuario();
        DAOProjeto dao = new DAOProjeto();
        
        modelP.setDescricao("Projeto para organizar a Sepool");
        modelP.setProjeto(projeto);
        modelU.setUsuario(lider);
        
        return dao.registrarProjetoDAO(modelP, modelU) == 1;
    }
}
