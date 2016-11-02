package org.vigen.oganesyan.java;

import javax.swing.*;
import java.awt.*;

/**
 * Created by ТыжАдмин on 02.11.2016.
 */
public class Result extends JFrame {
    public Result(){
        Font font = new Font("Berlin Sans FB", Font.BOLD, 15);
        setTitle("AI UK");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(999,700,641,400);
        setVisible(true);
        setLayout(null);
        JLabel words = new JLabel("The number of words : ");
        words.setBounds(300,80,290,150);
        words.setFont(font);
        JLabel gramkon = new JLabel("The number of grammatic constructions : ");
        gramkon.setBounds(280,30,290,150);
        gramkon.setFont(font);
        JLabel hrdns = new JLabel("The hardness of text : ");
        hrdns.setBounds(285,3,290,150);
        hrdns.setFont(font);


        add(words);
        add(gramkon);
        add(hrdns);

    }
}
