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
public class PedidosComPadrao {
    
    // Implementação COM padrão de projeto
    public static void main(String[] args) {            
        ArrayList<Pedido> listaPedidos = new ArrayList();        
        for(int i=0; i< 200000; i++){             
            Pedido pedido = new Pedido();
            ItemPedido item1 = new ItemPedido();
            item1.setDescricao("lapis de cor modelo xyz");
            item1.setNome("lapis");                        
            item1.setStatus(FlyweightStatusItem.get(StatusItem.Estado.CARRINHO));
            ItemPedido item2 = new ItemPedido();
            item2.setDescricao("caneta cor azul");
            item2.setNome("caneta");                                    
            item2.setStatus(FlyweightStatusItem.get(StatusItem.Estado.CARRINHO));
            ItemPedido item3 = new ItemPedido();
            item3.setDescricao("caneta cor vermelha");
            item3.setNome("caneta");                        
            item3.setStatus(FlyweightStatusItem.get(StatusItem.Estado.CARRINHO));                       
            pedido.addItemPedido(item1);
            pedido.addItemPedido(item2);
            pedido.addItemPedido(item3);          
            listaPedidos.add(pedido);                         
        }
        //calcula a quantidade de memória consumida pelo programa java
        System.out.println("KB: " + (double) (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024);        
        System.out.println(listaPedidos.size());
    }
}
