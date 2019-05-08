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
class ItemPedido {

    private String descricao;
    private String nome;
    private StatusItem status;

    void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    void setNome(String nome) {
        this.nome = nome;
    }
    
    void setStatus(StatusItem status) {
        this.status = status;
    }
    
}
