package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {
    JLabel l1,l2,l3;
    JTextField tf1;
    JPasswordField pf2;
    JButton b1,b2,b3;
    Main() {

        l1 = new JLabel("WELCOME TO ATM");
        l1.setBounds(175,50,450,200);
        l1.setFont(new Font("Osward",Font.BOLD,38));


        l2 = new JLabel("CARD NO: ");
        l2.setBounds(125,150,375,200);
        l2.setFont(new Font("Raleway",Font.BOLD,20));

        l3 = new JLabel("PIN: ");
        l3.setBounds(125,225,375,200);
        l3.setFont(new Font("Raleway",Font.BOLD,20));

        tf1 = new JTextField(15);
        tf1.setFont(new Font("Arial",Font.BOLD,14));
        tf1.setBounds(300,235,230,30);

        pf2 = new JPasswordField(15);
        pf2.setBounds(300,310,230,30);
        pf2.setFont(new Font("Arial",Font.BOLD,14));

        b1 = new JButton("SIGN IN");
        b1.setBounds(300,400,100,30);
        b1.setFont(new Font("Arial",Font.BOLD,14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setFocusable(false);

        b2 = new JButton("CLEAR");
        b2.setBounds(430,400,100,30);
        b2.setFont(new Font("Arial",Font.BOLD,14));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setFocusable(false);

        b3 = new JButton("SIGN UP");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(300,450,230,30);
        b3.setFont(new Font("Arial",Font.BOLD,14));
        b3.setFocusable(false);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);


        add(l1);add(l2);add(l3);add(tf1);add(pf2);add(b1);add(b2);add(b3);
        setTitle("AUTOMATED TELLER MACHINE");
        getContentPane().setBackground(Color.WHITE);
        setSize(750,750);
        setLocation(500,70);
        setResizable(false);
        setLayout(null);
        setVisible(true);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if( e.getSource() ==b2) {
            tf1.setText("");
            pf2.setText("");
        } else if(e.getSource() ==b3) {
            new Signup().setVisible(true);
            this.setVisible(false);
        }
        }



    public static void main(String[] args) {
        new Main();
    }

}
