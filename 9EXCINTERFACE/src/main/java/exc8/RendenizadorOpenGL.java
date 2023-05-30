/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exc8;

import javax.swing.*;

/**
 *
 * @author Nathan Graebin
 */
public class RendenizadorOpenGL implements Rendenizavel {

    public void renderizar() {
        JFrame frame = new JFrame("HelloWorldSwing!");
        final JLabel label = new JLabel("Hello world!");
        frame.getContentPane().add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

}
