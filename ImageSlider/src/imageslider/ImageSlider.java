/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageslider;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author ytr
 */
public class ImageSlider {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame();
        PanelSlider panel = new PanelSlider();
        frame.setContentPane(panel);
        frame.setSize(panel.getPreferredSize());
        frame.setPreferredSize(new Dimension(604, 431));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
       
    }
    
}
