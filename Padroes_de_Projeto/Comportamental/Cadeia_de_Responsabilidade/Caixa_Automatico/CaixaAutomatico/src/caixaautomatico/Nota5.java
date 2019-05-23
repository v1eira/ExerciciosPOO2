/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixaautomatico;

/**
 *
 * @author ewerson
 */
public class Nota5 extends AbstractSaqueHandler {
    public static final int NOTA5 = 4;
    
    protected int handleSaque(int valor)
    {
        int valorRestante = valor - 5;
        return valorRestante;
    }

    @Override
    protected int getTipoSaque() {
        return NOTA5;
    }
    
    @Override
    protected int getValor() {
        return 5;
    }
}
