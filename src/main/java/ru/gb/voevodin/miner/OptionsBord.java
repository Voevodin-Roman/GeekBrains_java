package ru.gb.voevodin.miner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OptionsBord extends JFrame {
    public void startWindow(){
        // Данный класс предназначен для ввода и хранения размера игрового поля и количества мин
        setTitle("Setting");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 300, 300);
        Font font25 = new Font("Arial", Font.BOLD, 25);
        Font font12 = new Font("Arial", Font.BOLD, 12);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        JLabel widthLabel = new JLabel("Введите количество столбцов");
        widthLabel.setFont(font12);
        add(widthLabel);

        JTextField addwidth = new JTextField();
        addwidth.setFont(font25);
        add(addwidth);

        JLabel heightLabel = new JLabel("Введите количество строк");
        heightLabel.setFont(font12);
        add(heightLabel);

        JTextField addheight = new JTextField();
        addheight.setFont(font25);
        add(addheight);

        JLabel minelabel = new JLabel("Введите желаемое количество мин");
        minelabel.setFont(font12);
        add(minelabel);

        JTextField addmine = new JTextField();
        addmine.setFont(font25);
        add(addmine);


        JButton button = new JButton("OK");
        button.setFont(font25);
        add(button, BorderLayout.SOUTH);
        setVisible(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int width = Integer.parseInt(addwidth.getText());
                int height = Integer.parseInt(addheight.getText());
                int mine = Integer.parseInt(addmine.getText());
                Bord bord = new  Bord(width, height, mine);
                bord.goPlay();
                dispose();


            }
        });
    }




}
