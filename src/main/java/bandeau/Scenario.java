/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;
import javax.swing.*;
import java.awt.*;
import java.awt.RenderingHints;
import java.awt.Rectangle;
import java.awt.BorderLayout;
import java.awt.geom.AffineTransform;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.FontMetrics;


/**
 *
 * @author hbroucke
 */
    public class Scenario {
    
    private final Bandeau b = new Bandeau();
    private final Clignote c = new Clignote(b);
    private final Zoom z = new Zoom(b);
    private final Rotate r = new Rotate(b);
    private final Rainbow w = new Rainbow(b); 


    public static void main(String[] args) {
        new Scenario().ResultatBandeau();
    }

    public void ResultatBandeau() {
        
      c.playOn(10);
      z.playOn(1);
      r.playOn(10);
      w.playOn(1);
    }
}
    