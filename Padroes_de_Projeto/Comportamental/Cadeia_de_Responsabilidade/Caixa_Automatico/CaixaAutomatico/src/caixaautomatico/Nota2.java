package caixaautomatico;


import caixaautomatico.AbstractSaqueHandler;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ewerson
 */
public class Nota2 extends AbstractSaqueHandler {
    public static final int NOTA2 = 5;

    @Override
    protected int handleSaque(int valor) {
        int valorRestante = valor - 2;
        return valorRestante;
    }

    @Override
    protected int getTipoSaque() {
        return NOTA2;
    }

    @Override
    protected int getValor() {
        return 2;
    }
    
}
