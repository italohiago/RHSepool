package teste;

import DAO.DAOMembro;
import modelo.ModeloMembro;
import modelo.ModeloUsuario;

public class TesteMembro {
    public static void main(String[] args){
        if(registrarMembro("Italo Hiago"))
            System.out.println("Membro registrado com sucesso!");
    }

    private static boolean registrarMembro(String membro){
        ModeloMembro modelM = new ModeloMembro();
        ModeloUsuario modelU = new ModeloUsuario();
        DAOMembro dao = new DAOMembro();
        
        byte veiculo = 0, semestre = 3, mat = 1, ves = 0, not = 1;
        
        modelU.setUsuario("hiago");
        modelM.setNome(membro);
        modelM.setBairro("Pituba");
        modelM.setTelefone("(75)9 8303-8260");
        modelM.setEmail("italohiagolopes@outlook.com");
        modelM.setSexo("M");
        modelM.setVeiculo(veiculo);
        modelM.setCurso("Engenharia Mecatrônica");
        modelM.setMatricula(149161032);
        modelM.setSemestre(semestre);
        modelM.setTurnoMat(mat);
        modelM.setTurnoNot(not);
        modelM.setTurnoVesp(ves);
        modelM.setObservacoes("Apenas uma aula pela manhã na quarta feira");
        
        return dao.registrarMembroDAO(modelM, modelU) == 1;
    }
}
