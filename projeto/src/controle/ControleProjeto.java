package controle;

import DAO.DAOEquipe;
import DAO.DAOProjeto;
import modelo.ModeloEquipe;
import modelo.ModeloProjeto;

public class ControleProjeto {
    DAOProjeto daoP = new DAOProjeto();
    DAOEquipe daoE = new DAOEquipe();
    
    ModeloEquipe modelE = new ModeloEquipe();
    
    public byte apagarProjetoControle(ModeloProjeto modelP){
      /*  byte idProjeto = daoP.buscarIdProjetoDAO(modelP);
        modelE.setProjeto(modelP.getProjeto());
        byte idEquipe = daoE.buscarIdEquipeDAO(modelE);

        if(idProjeto != 0){
            while(idEquipe != 0){
                modelE.setIdEquipe(""+idEquipe);
                if(!daoE.removerUsuarioEquipeDAO(modelE)) //Aqui precisa de um if
                    return 2;   //erro ao remover um usuario da equipe
                idEquipe = daoE.buscarIdEquipeDAO(modelE);
            }
            
            modelP.setIdProjeto(idProjeto);
            if(!daoE.removerEquipeDAO(modelP)) //Aqui precisa de um if
                return 3;   //Erro ao remover equipe
                            
            if(!daoP.removerProjetoDAO(modelP)) //Aqui precisa de um if
                return 4;   //Erro ao remover projeto
            
            return 1;   //Projeto apagado com sucesso!
        }
        */
        return 0; //Projeto não encontrado
    }
}
