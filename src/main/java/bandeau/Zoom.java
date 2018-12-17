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
    public class Zoom extends Effet {

    private Bandeau b;

    public Zoom(Bandeau b) {
        this.b = b;
        b.setBackground(Color.BLACK);
    }

    public void playOn(int n) {

        for (int i = 1; i <= n; i++) {
		b.sleep(150);
		b.setMessage("Dans votre magasin Citadium");
            for (int j = 0; j < 150; j += 3) {
                b.setFont(new Font(null, Font.BOLD, 20 + j));
                b.sleep(150);

            }
        }
    }
}