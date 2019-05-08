/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidos;

import java.util.ArrayList;

/**
 *
 * @author ewerson
 */
class Pedido {
    
    private ArrayList<ItemPedido> pedido = new ArrayList();

    public Pedido() {
        
    }

    void addItemPedido(ItemPedido item) {
        pedido.add(item);
    }
    
}
