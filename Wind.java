package org.vigen.oganesyan.java;

import javax.print.DocFlavor;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Scanner;

import static java.lang.String.*;

/**
 * Created by ТыжАдмин on 01.11.2016.
 */
public class Wind extends JFrame {

    public Wind() {


        Font font = new Font("Comic Sans MS", Font.BOLD, 12);
        Font font2 = new Font("ALGERIAN", Font.BOLD, 20);
        Font font3 = new Font("Berlin Sans FB", Font.BOLD, 15);
        Font font4 = new Font("Berlin Sans FB", Font.BOLD, 18);
        Font font5 = new Font("Tahoma", Font.BOLD, 12);
        setTitle(" AI UK ");
        setBackground(Color.orange);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(999, 700, 1600, 950);
        setLayout(null);
        JButton WORK_ON_TEXT = new JButton("Обработать текст ");
        WORK_ON_TEXT.setBounds(512, 89, 190, 55);
        WORK_ON_TEXT.setFont(font);
        WORK_ON_TEXT.setBackground(Color.CYAN);

        add(WORK_ON_TEXT);
        JLabel NUMBER_OF_WORDS = new JLabel("The number of words : ");
        NUMBER_OF_WORDS.setFont(font3);
        NUMBER_OF_WORDS.setBounds(800, 110, 290, 150);
        add(NUMBER_OF_WORDS);

        JTextField textField = new JTextField();
        textField.setBounds(900, 193, 60, 50);
        add(textField);
        JTextArea ENGLISH_TEXT = new JTextArea();
        ENGLISH_TEXT.setBounds(32, 167, 700, 550);
        ENGLISH_TEXT.setLineWrap(true);
        ENGLISH_TEXT.setWrapStyleWord(true);
        ENGLISH_TEXT.setFont(font2);
        add(ENGLISH_TEXT);
        JLabel NUMBER_OF_GRAMMAR_CONSTRUCTIONS = new JLabel("Tne number of grammar constructions : ");
        NUMBER_OF_GRAMMAR_CONSTRUCTIONS.setFont(font4);
        NUMBER_OF_GRAMMAR_CONSTRUCTIONS.setBounds(800,201,355,180);
        add(NUMBER_OF_GRAMMAR_CONSTRUCTIONS);
        JLabel PRESENT_SIMPLE = new JLabel("Present Simple constructions : ");
        PRESENT_SIMPLE.setFont(font3);
        PRESENT_SIMPLE.setBounds(800,270,290,150);
        add(PRESENT_SIMPLE);
        JTextField PRESENT_SIMPLE_TXTFIELD = new JTextField();
        PRESENT_SIMPLE_TXTFIELD.setBounds(900,359,60,50);
        add(PRESENT_SIMPLE_TXTFIELD);
        JLabel PRESENT_PERFECT = new JLabel("Present Perfect constructions : ");
        PRESENT_PERFECT.setFont(font3);
        PRESENT_PERFECT.setBounds(800,380,290,150);
        add(PRESENT_PERFECT);
        JTextField PRESENT_PERFECT_FIELD = new JTextField();
        PRESENT_PERFECT_FIELD.setBounds(900,463,60,50);
        add(PRESENT_PERFECT_FIELD);
        String s = ENGLISH_TEXT.getText();
        String [] TEXT_ARRAY;
        TEXT_ARRAY = s.split(" ");
        int tl;
        tl = TEXT_ARRAY.length;
        WORK_ON_TEXT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(valueOf(tl));
            }
        });

 /*       int count = 1;
        int i = txxt.length;


            while (i > 0) {
                if (txxt[i] == String.valueOf(' ') ) {
                    count = count + 1;
                    i = i - 1;
                } else if (txxt[i] != String.valueOf('-')) {
                    count = count + 1;
                    i = i - 1;
                }


                int finalCount = count;
                x.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        textField.setText(String.valueOf(finalCount));
                    }
                });
            }*/

            setVisible(true);


    }
}
