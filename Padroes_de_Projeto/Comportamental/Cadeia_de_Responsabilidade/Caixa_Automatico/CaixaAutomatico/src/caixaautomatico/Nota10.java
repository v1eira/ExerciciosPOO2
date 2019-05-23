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
public class Nota10 extends AbstractSaqueHandler {
    public static final int NOTA10 = 3;
    
    protected int handleSaque(int valor)
    {
        int valorRestante = valor - 10;
        return valorRestante;
    }

    @Override
    protected int getTipoSaque() {
        return NOTA10;
    }
    
    @Override
    protected int getValor() {
        return 10;
    }
}
