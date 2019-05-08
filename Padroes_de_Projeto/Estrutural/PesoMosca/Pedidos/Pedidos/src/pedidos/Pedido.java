/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidos;

import java.util.List;

/**
 *
 * @author ewerson
 */
class Pedido {
    
    private List<ItemPedido> pedido;

    void addItemPedido(ItemPedido item) {
        this.pedido.add(item);
    }
    
}
