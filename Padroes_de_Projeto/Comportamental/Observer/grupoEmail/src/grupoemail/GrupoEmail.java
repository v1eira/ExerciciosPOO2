/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupoemail;

/**
 *
 * @author ewerson
 */
public class GrupoEmail {

    public static void main(String[] args) {
        CaixaEntradaGrupo inbox = new CaixaEntradaGrupo();
        MembroEmail email = new MembroEmail();
        MembroWhatsApp wpp = new MembroWhatsApp();
        
        inbox.addObserver(email);
        inbox.addObserver(wpp);
        
        inbox.setNovaMensagem("Olá, mundo!");
    }
    
}
