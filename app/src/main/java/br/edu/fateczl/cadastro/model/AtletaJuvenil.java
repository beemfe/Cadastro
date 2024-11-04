/*
 * @author: Felipe Bernardes Cisilo
 * */
package br.edu.fateczl.cadastro.model;

import androidx.annotation.NonNull;

public class AtletaJuvenil extends Atleta {
    private int tempoEsporte;

    public AtletaJuvenil() {
        super();
    }

    public int getTempoEsporte() {
        return tempoEsporte;
    }

    public void setTempoEsporte(int tempoEsporte) {
        this.tempoEsporte = tempoEsporte;
    }

    @NonNull
    @Override
    public String toString() {
        return "AtletaJuvenil{" +
                "tempoEsporte=" + tempoEsporte +
                '}';
    }
}
