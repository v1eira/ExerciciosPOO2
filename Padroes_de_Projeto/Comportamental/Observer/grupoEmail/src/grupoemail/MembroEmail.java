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
public class MembroEmail implements Observer {
    
    private String email;

    @Override
    public void update(Observable obs) {
        System.out.println("Mensagem recebida por email.");
    }
    
}
