/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptercliente.model;

import lib.ClienteExterno;

public class AdapterCliente implements ICliente
{
    ClienteExterno adapter;

    public AdapterCliente(ClienteExterno adaptador) {
        this.adapter = adaptador;
    }
    
    @Override
    public String getNomeCompleto() {
        return adapter.getNome() + ' ' + adapter.getSobreNome();
    }
    
    
    @Override
    public String getTelefone() {
        return adapter.getTelefone();
    }


    @Override
    public String getEmail() {
        return adapter.getEmail();
    }


    @Override
    public String getCelular() {
        return adapter.getCelular();    
                
    }

    @Override
    public void setNomeCompleto(String nomeCompleto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTelefone(String telefone) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setEmail(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCelular(String celular) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
