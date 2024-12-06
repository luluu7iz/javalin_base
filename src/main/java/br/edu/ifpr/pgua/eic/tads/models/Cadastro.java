package br.edu.ifpr.pgua.eic.tads.models;
import java.util.List;
import java.util.ArrayList;

public class Cadastro {

    private List<Pessoa> pessoas;

    public Cadastro() {
        pessoas = new ArrayList<>();
    }

    public void add(Pessoa p) {
        this.pessoas.add(p);
    }

    public List<Pessoa> getPessoa() {
        return this.pessoas;
    }    
}
