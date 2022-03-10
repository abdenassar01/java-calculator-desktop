package com.calculatrice.tp;

import javax.swing.*;

public class MainApplication {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculatrice");
        frame.setContentPane(new Calculatrice().getMainPanel());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    
}
