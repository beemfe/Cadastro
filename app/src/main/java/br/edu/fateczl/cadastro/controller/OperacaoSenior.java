/*
 * @author: Felipe Bernardes Cisilo
 * */
package br.edu.fateczl.cadastro.controller;

import java.util.ArrayList;
import java.util.List;

import br.edu.fateczl.cadastro.model.AtletaSenior;

public class OperacaoSenior implements IOperacao<AtletaSenior>{
    List<AtletaSenior> lista;

    public OperacaoSenior() {
        this.lista = new ArrayList<>();
    }

    @Override
    public void cadastrar(AtletaSenior atletaSenior) {
        lista.add(atletaSenior);

    }

    @Override
    public List<AtletaSenior> listar() {
        return this.lista;
    }
}
