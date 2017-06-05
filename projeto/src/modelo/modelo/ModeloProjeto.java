package modelo;

public class ModeloProjeto {

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
     * @return the lider
     */
    public String getLider() {
        return lider;
    }

    /**
     * @param lider the lider to set
     */
    public void setLider(String lider) {
        this.lider = lider;
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
    private String projeto, descricao, lider, projetoNovo;
    private byte idProjeto;
}
