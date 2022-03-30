package org.acme.startup.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Startup extends PanacheEntity {
    @Column
    private String nome;
    @Column
    private int qtdFuncionarios;
    @Column
    private String industria;
    @Column
    private String localizacao;
    @Column
    private String descricao;
    @Column
    private int rank;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdFuncionarios() {
        return qtdFuncionarios;
    }

    public void setQtdFuncionarios(int qtdFuncionarios) {
        this.qtdFuncionarios = qtdFuncionarios;
    }

    public String getindustria() {
        return industria;
    }

    public void setindustria(String industria) {
        this.industria = industria;
    }

    public String getlocalizacao() {
        return localizacao;
    }

    public void setlocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setdescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getrank() {
        return rank;
    }

    public void setrank(int rank) {
        this.rank = rank;
    }
    
}
