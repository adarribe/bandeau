/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;
import java.awt.*;


/**
 *
 * @author hbroucke
 */
public class Clignote extends Effet {

    private Bandeau b;
    

    public Clignote(Bandeau b) {
        this.b = b;
        b.setBackground(Color.white);
    }

   
    public void playOn(int n) {
        
        for (int i = 1; i <= n; i++) {
            
            b.sleep(100);

            b.setForeground(Color.black);

            b.setMessage("Attention promotion imminente");
            b.setBackground(Color.white);
            b.sleep(100);
            b.setBackground(Color.black);
            b.setForeground(Color.white);
          
        }
    }

}