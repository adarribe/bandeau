/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;


/**
 *
 * @author hbroucke
 */
public abstract class Effet {
    protected int n;
    
    public Effet() {
        
    }
    
    public abstract void playOn(int n);
    
}
