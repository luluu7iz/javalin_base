package br.edu.ifpr.pgua.eic.tads.controllers;

import io.javalin.http.Context;
import io.javalin.http.Handler;
import java.util.Map;
import java.util.HashMap;

public class CadastroController {

    private Cadastro cadastro;

    public CadastroController(Cadastro cadastro){
        this.cadastro = cadastro;
    }
    
    public Handler get = (Context ctx)-> {
        ctx.render("cadastro.html");
    };

    public Handler post = (Context ctx)-> {
        String nome = ctx.formParam("nome");
        String cpf = ctx.formParam("cpf");
   
        cadastro.add(new Pessoa(nome, cpf));

        Map<String,Object> dados = new HashMap<>();

        dados.put("pessoas",cadastro.getPessoas());
        
        ctx.render("resposta.html",dados);

    };
}
