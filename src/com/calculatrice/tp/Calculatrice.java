package com.calculatrice.tp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculatrice {
    
    //calculatrice variables
    double number1;
    double number2;
    char operation = 'n';
    
    
    private JPanel mainPanel;
    private JTextField textField;
    private JPanel screenPanel;
    private JPanel buttonsRow1;
    private JPanel buttonsRow2;
    private JPanel buttonsRow3;
    private JPanel buttonsRow4;
    private JButton clear;
    private JButton benaire;
    private JButton modulo;
    private JButton division;
    private JButton seven;
    private JButton eight;
    private JButton nine;
    private JButton multiplication;
    private JButton four;
    private JButton five;
    private JButton six;
    private JButton soubstraction;
    private JButton one;
    private JButton two;
    private JButton three;
    private JButton addition;
    private JButton zero;
    private JButton dot;
    private JButton egal;
    private JPanel buttonsRow5;
    private JLabel infoLabel;

    public Calculatrice() {
        clear.addActionListener(e -> textField.setText(""));
        
        benaire.addActionListener(e -> {
            if(!textField.getText().equals("")){
                textField.setText(Integer.toBinaryString(Integer.parseInt(textField.getText())));
            }
        });
        
        seven.addActionListener(e -> textField.setText(textField.getText() + "7"));
        eight.addActionListener(e -> textField.setText(textField.getText() + "8"));
        nine.addActionListener(e -> textField.setText(textField.getText() + "9"));
        four.addActionListener(e -> textField.setText(textField.getText() + "4"));
        five.addActionListener(e -> textField.setText(textField.getText() + "5"));
        six.addActionListener(e -> textField.setText(textField.getText() + "6"));
        one.addActionListener(e -> textField.setText(textField.getText() + "1"));
        two.addActionListener(e -> textField.setText(textField.getText() + "2"));
        three.addActionListener(e -> textField.setText(textField.getText() + "3"));
        zero.addActionListener(e -> textField.setText(textField.getText() + "0"));
        dot.addActionListener(e -> {
            if(!textField.getText().contains(".")){
                textField.setText(textField.getText() + ".");
            }
        });
        addition.addActionListener(e -> {
            if(!textField.getText().equals("")){
                operation = '+';
                infoLabel.setText("Addition");
                number1 = Double.parseDouble(textField.getText());
                clear.doClick();
            }
        });
        egal.addActionListener(e -> {
            if(!textField.getText().equals("")){
                number2 = Double.parseDouble(textField.getText());
                switch (operation){
                    case '+': textField.setText(String.valueOf(number1 + number2));break;
                    case '-': textField.setText(String.valueOf(number1 - number2));break;
                    case '/': 
                        if(number2 == 0){
                            JOptionPane.showMessageDialog(new JFrame(),
                                    "You can't divide by zero.",
                                    "Arithmetic Exception",
                                    JOptionPane.WARNING_MESSAGE);
                            clear.doClick();
                            break;
                        }
                        textField.setText(String.valueOf(number1 / number2));
                        break;
                    case '*': textField.setText(String.valueOf(number1 * number2));break;
                    case '%': textField.setText(String.valueOf(number1 % number2));break;
                    default:
                        System.out.println("Something is wrong");
                } 
            }
        });
        soubstraction.addActionListener(e -> {
            if(!textField.getText().equals("")){
                operation = '-';
                infoLabel.setText("Subtraction");
                number1 = Double.parseDouble(textField.getText());
                clear.doClick();
            }
        });
        multiplication.addActionListener(e -> {
            if(!textField.getText().equals("")){
                operation = '*';
                infoLabel.setText("Multiplication");
                number1 = Double.parseDouble(textField.getText());
                clear.doClick();
            }
        });
        division.addActionListener(e -> {
            if(!textField.getText().equals("")){
                operation = '/';
                infoLabel.setText("Division");
                number1 = Double.parseDouble(textField.getText());
                clear.doClick();
            }
        });
        modulo.addActionListener(e -> {
            if(!textField.getText().equals("")){
                operation = '%';
                infoLabel.setText("Modulo");
                number1 = Double.parseDouble(textField.getText());
                clear.doClick();
            }
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
    
}
