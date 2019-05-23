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
public class Nota50 extends AbstractSaqueHandler {
    public static final int NOTA50 =1;
    
    protected int handleSaque(int valor)
    {
        int valorRestante = valor - 50;
        return valorRestante;
    }

    @Override
    protected int getTipoSaque() {
        return NOTA50;
    }
    
    @Override
    protected int getValor() {
        return 50;
    }
    
}
