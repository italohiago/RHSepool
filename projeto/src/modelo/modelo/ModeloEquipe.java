package modelo;

public class ModeloEquipe {

    /**
     * @return the idEquipe
     */
    public String getIdEquipe() {
        return idEquipe;
    }

    /**
     * @param idEquipe the idEquipe to set
     */
    public void setIdEquipe(String idEquipe) {
        this.idEquipe = idEquipe;
    }

    /**
     * @return the idMembro
     */
    public String getIdMembro() {
        return idMembro;
    }

    /**
     * @param idMembro the idMembro to set
     */
    public void setIdMembro(String idMembro) {
        this.idMembro = idMembro;
    }

    /**
     * @return the equipeNova
     */
    public String getEquipeNova() {
        return equipeNova;
    }

    /**
     * @param equipeNova the equipeNova to set
     */
    public void setEquipeNova(String equipeNova) {
        this.equipeNova = equipeNova;
    }

    /**
     * @return the Projeto
     */
    public String getProjeto() {
        return Projeto;
    }

    /**
     * @param Projeto the Projeto to set
     */
    public void setProjeto(String Projeto) {
        this.Projeto = Projeto;
    }

    /**
     * @return the equipe
     */
    public String getEquipe() {
        return equipe;
    }

    /**
     * @param equipe the equipe to set
     */
    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }
    
    private String idEquipe;
    private String equipe;
    private String Projeto;
    private String equipeNova;
    private String idMembro;
}
