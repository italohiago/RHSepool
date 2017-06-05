package modelo;

public class ModeloProjeto {

    /**
     * @return the descricaoNova
     */
    public String getDescricaoNova() {
        return descricaoNova;
    }

    /**
     * @param descricaoNova the descricaoNova to set
     */
    public void setDescricaoNova(String descricaoNova) {
        this.descricaoNova = descricaoNova;
    }

    /**
     * @return the idProjeto
     */
    public byte getIdProjeto() {
        return idProjeto;
    }

    /**
     * @param idProjeto the idProjeto to set
     */
    public void setIdProjeto(byte idProjeto) {
        this.idProjeto = idProjeto;
    }

    /**
     * @return the projetoNovo
     */
    public String getProjetoNovo() {
        return projetoNovo;
    }

    /**
     * @param projetoNovo the projetoNovo to set
     */
    public void setProjetoNovo(String projetoNovo) {
        this.projetoNovo = projetoNovo;
    }

    /**
     * @return the projeto
     */
    public String getProjeto() {
        return projeto;
    }

    /**
     * @param projeto the projeto to set
     */
    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    private String projeto, descricao, projetoNovo, descricaoNova;
    private byte idProjeto;
}
