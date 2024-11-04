/*
 * @author: Felipe Bernardes Cisilo
 * */
package br.edu.fateczl.cadastro.model;
import androidx.annotation.NonNull;

import java.util.Date;

public abstract class Atleta {
    private String nome;
    private Date dataNascimento;
    private String bairro;

    public Atleta() {
        super();
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @NonNull
    @Override
    public String toString() {
        return "Atleta{" +
                "nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", bairro='" + bairro + '\'' +
                '}';
    }
}
