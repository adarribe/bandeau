/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;
import java.awt.*;
import java.awt.Color;
import static javafx.scene.text.Font.font;

/**
 *
 * @author hbroucke
 */

public class Rainbow extends Effet {
private Bandeau b;

    public Rainbow(Bandeau b){
        this.b = b;
    }
    
    public void playOn(int n){
                b.setMessage("Réduction de 20%");
		b.sleep(1000);
		b.setBackground(Color.BLACK);
		b.setMessage("Nike");
                b.setForeground(Color.WHITE);
		b.sleep(1000);
                b.setBackground(Color.RED);
		b.setMessage("Reebok");
                b.setForeground(Color.BLUE);
		b.sleep(1000);
                b.setBackground(Color.ORANGE);
		b.setMessage("Off White");
                b.setForeground(Color.WHITE);
		b.sleep(1000);
                b.setBackground(Color.WHITE);
		b.setMessage("Vans");
                b.setForeground(Color.GREEN);
		b.sleep(1000);
    }
    
}
