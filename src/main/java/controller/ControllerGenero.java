package main.java.controller;

import main.java.entity.Genero;
import main.java.model.ModelGenero;

public class ControllerGenero {


    public void preSalvar(Genero genero) {

        //validações

        //chamar o salvar
        ModelGenero modelGenero = new ModelGenero();
        modelGenero.salvar(genero);


    }
}
