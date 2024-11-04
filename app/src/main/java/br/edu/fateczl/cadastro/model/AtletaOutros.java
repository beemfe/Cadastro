/*
 * @author: Felipe Bernardes Cisilo
 * */
package br.edu.fateczl.cadastro.model;

import androidx.annotation.NonNull;

public class AtletaOutros extends Atleta {
    private String academia;
    private float recorde;

    public AtletaOutros() {
        super();
    }

    public String getAcademia() {
        return academia;
    }

    public void setAcademia(String academia) {
        this.academia = academia;
    }

    public float getRecorde() {
        return recorde;
    }

    public void setRecorde(float recorde) {
        this.recorde = recorde;
    }

    @NonNull
    @Override
    public String toString() {
        return "AtletaOutros{" +
                "academia='" + academia + '\'' +
                ", recorde=" + recorde +
                '}';
    }
}
