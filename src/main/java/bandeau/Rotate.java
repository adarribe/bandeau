/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author hbroucke
 */

public class Rotate extends Effet {
private Bandeau b;    

    public Rotate(Bandeau b){
        this.b = b;
        b.setBackground(Color.white);
    }

    public void playOn(int n){
        	b.setFont(new Font("Courier new", Font.PLAIN, 40));
		b.sleep(100);
		b.setMessage("Réduction sur nos paires de sneakers");
		for (int i = 0; i <= 1000; i+=20) {
			b.setRotation(2*Math.PI*i / 100);
			b.sleep(100);
        }
    }
}

