/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixaautomatico;

import java.util.ArrayList;

/**
 *
 * @author ewerson
 */
public class CaixaAutomatico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nota50 notaCinquenta = new Nota50();
        Nota20 notaVinte = new Nota20();
        Nota10 notaDez = new Nota10();
        Nota5 notaCinco = new Nota5();
        Nota2 notaDois = new Nota2();
        
        ArrayList lista = new ArrayList();
        lista.add(notaCinquenta.NOTA50);
        lista.add(notaVinte.NOTA20);
        lista.add(notaDez.NOTA10);
        lista.add(notaCinco.NOTA5);
        
        notaCinquenta.setNextHandler(notaVinte);
        notaVinte.setNextHandler(notaDez);
        notaDez.setNextHandler(notaCinco);
        notaCinco.setNextHandler(notaDois);
        
        notaCinquenta.processHandler(lista, 125);
    }
    
}
