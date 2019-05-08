/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidos;

/**
 *
 * @author ewerson
 */
public class StatusItem {

    private static boolean podeCancelar;
    private static boolean compraConcluida;
    private final Estado estado;
    
    public static enum Estado { CARRINHO, FECHADO, PAGO, ENVIADO , ENTREGUE }

    public StatusItem(Estado estado, boolean podeCancelar, boolean compraConcluida) {
        this.estado = estado;
        StatusItem.podeCancelar = podeCancelar;
        StatusItem.compraConcluida = compraConcluida;
    }
   
    public static boolean getPodeCancelar() {
        return podeCancelar;
    }

    public static boolean getCompraConcluida() {
        return compraConcluida;
    }
}
