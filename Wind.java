package org.vigen.oganesyan.java;

import javax.print.DocFlavor;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

/**
 * Created by ТыжАдмин on 01.11.2016.
 */
public class Wind extends JFrame {
    public Wind (){


        Font font=new Font ("Comic Sans MS", Font.BOLD, 12);
        Font font2 = new Font("ALGERIAN", Font.BOLD, 20);
        setTitle(" AI UK ");
        setBackground(Color.orange);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(999,700,1000,800);
        setLayout(null);
        JButton x = new JButton("Обработать текст ");
        x.setBounds(512,89,190,55);
        x.setFont(font);
        x.setBackground(Color.BLUE);
        x.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Result b = new Result();
            }
        });
        JButton z = new JButton("Показать в графике ");
        z.setBounds(320,90,190,55);
        z.setFont(font);
        z.setBackground(Color.red);
        JTextArea textArea = new JTextArea();
        textArea.setBounds(280,152,600,700);
        textArea.setFont(font2);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(x) ;
        add(z);
        add(textArea);
        


        setVisible(true);

    }
}
