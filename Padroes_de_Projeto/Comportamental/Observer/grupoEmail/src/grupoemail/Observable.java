/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupoemail;

import java.util.ArrayList;

/**
 *
 * @author ewerson
 */
public class Observable {
    
    private ArrayList<Observer> monitores = new ArrayList();
    
    public void addObserver(Observer obs) {
        this.monitores.add(obs);
    }
    
    public void deleteObserver(Observer obs) {
        monitores.remove(obs);
    }
    
    public void notifyObservers() {
        for (Observer obs : monitores) {
            obs.update(this);
        }
    }
    
}
