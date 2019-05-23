/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixaautomatico;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ewerson
 */
public abstract class AbstractSaqueHandler implements SaqueHandler {
    
    private SaqueHandler nextSaqueHandler;
    
    @Override
    public void setNextHandler(SaqueHandler handler) {
        this.nextSaqueHandler = handler;
    }
    
    @Override
    public void processHandler(List lista, int valor) {
        int valorRestante = valor;
        int nota = getValor();
        if (lista.contains(getTipoSaque())) {
            while (nota <= valorRestante) {
                valorRestante = handleSaque(valorRestante);
                System.out.println("Nota -> R$:" + nota + ",00");
            }
        }
        if (nextSaqueHandler != null && valorRestante > 0) {
            this.nextSaqueHandler.processHandler(lista, valorRestante);
        }
    }
    
    protected abstract int handleSaque(int valor);
    protected abstract int getTipoSaque();
    protected abstract int getValor();
    
}
