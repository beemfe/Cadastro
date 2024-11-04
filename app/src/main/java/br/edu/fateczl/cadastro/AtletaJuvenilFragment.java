/*
 * @author: Felipe Bernardes Cisilo
 * */
package br.edu.fateczl.cadastro;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

import br.edu.fateczl.cadastro.controller.IOperacao;
import br.edu.fateczl.cadastro.model.AtletaJuvenil;

public class AtletaJuvenilFragment extends Fragment {
    private View view;
    private EditText etNomeJ;
    private EditText etDataNascJ;
    private Button btnCadastrar;
    private EditText etAnosEsporte;
    private EditText etBairroJ;
    private TextView tvListaJ;

    public AtletaJuvenilFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_atleta_juvenil, container, false);
        etNomeJ = view.findViewById(R.id.etNomeJ);
        etDataNascJ = view.findViewById(R.id.etDataNascJ);
        btnCadastrar = view.findViewById(R.id.btnCadastrar);
        etAnosEsporte = view.findViewById(R.id.etAnosEsporte);
        etBairroJ = view.findViewById(R.id.etBairroJ);
        tvListaJ = view.findViewById(R.id.tvListaJ);
        tvListaJ.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        btnCadastrar.setOnClickListener(op -> cadastro());
    }
    private void cadastro() {
        AtletaJuvenil j = new AtletaJuvenil();
        j.setNome(etNomeJ.getText().toString());
        j.setDataNasc(etDataNascJ.getText().toString());
        j.setAnosEsporte(etAnosEsporte.getText().toString());
        j.setBairro(etBairroJ.getText().toString());
        tvListaJ.setText(j.toString());
        IOperacao op = new IOperacao();
        op.cadastrar(j);
        List<AtletaJuvenil> lista = op.listar();

    }
}