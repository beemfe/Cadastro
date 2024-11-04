/*
 * @author: Felipe Bernardes Cisilo
 * */
package br.edu.fateczl.cadastro.controller;

import java.util.ArrayList;
import java.util.List;

import br.edu.fateczl.cadastro.model.AtletaOutros;

public class OperacaoOutros implements IOperacao<AtletaOutros> {
    private List<AtletaOutros> lista;

    public OperacaoOutros() {
        this.lista = new ArrayList<>();
    }

    @Override
    public void cadastrar(AtletaOutros atletaOutros) {
        lista.add(atletaOutros);
    }

    @Override
    public List<AtletaOutros> listar() {
        return this.lista;
    }
}
