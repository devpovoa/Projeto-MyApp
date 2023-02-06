package Model;

import java.util.Date;

/**
 *
 * @author devpovoa
 */
public class Tarefa {

    private int id;
    private int idProject;
    private String nome;
    private String descricao;
    private boolean situacao;
    private String observacao;
    private Date prazo;
    private Date dataCriacao;
    private Date dataAtualizacao;

    public Tarefa(int id, int idProject, String nome, String descricao, boolean situacao, String observacao, Date prazo, Date dataCriacao, Date dataAtualizacao) {
        this.id = id;
        this.idProject = idProject;
        this.nome = nome;
        this.descricao = descricao;
        this.situacao = situacao;
        this.observacao = observacao;
        this.prazo = prazo;
        this.dataCriacao = dataCriacao;
        this.dataAtualizacao = dataAtualizacao;
    }

    public Tarefa() {
        this.dataCriacao = new Date();
        this.dataAtualizacao = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdProject() {
        return idProject;
    }

    public void setIdProject(int idProject) {
        this.idProject = idProject;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Date getPrazo() {
        return prazo;
    }

    public void setPrazo(Date prazo) {
        this.prazo = prazo;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Date getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(Date dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    @Override
    public String toString() {
        return "Tarefa{" + "id=" + id + ", idProject=" + idProject + ", nome=" + nome + ", descricao=" + descricao + ", situacao=" + situacao + ", observacao=" + observacao + ", prazo=" + prazo + ", dataCriacao=" + dataCriacao + ", dataAtualizacao=" + dataAtualizacao + '}';
    }

}
