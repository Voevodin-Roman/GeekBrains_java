package ru.gb.voevodin.miner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameLogic extends JFrame{
    private int[][] game_bord;
    private final int width;
    private final int height;
    private JButton[][] jButtons;

    public GameLogic(int[][] game_bord, int width, int height) {
        this.game_bord = game_bord;
        this.width = width;
        this.height = height;
        creatingArrayButton();

    }


    public void creatingArrayButton(){
        jButtons = new JButton[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                JButton a = new JButton(" ");
                jButtons[i][j] = a;
            }
        }
        creatingGameWindow();
    }

    public void creatingGameWindow() {

        setTitle("Найди мины");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, width*60, height*60);
        Font font8 = new Font("Arial", Font.BOLD, 8);
        setLayout(new GridLayout(width, height));
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                add(new JButton("0"));
                int finalI = i;
                int finalJ = j;
                jButtons[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        jButtons[finalI][finalJ].setText("2");

                    }
                });

            }
        }
      //for (int i = 0; i < width; i++) {
      //    for (int j = 0; j < height; j++) {
      //        int finalI = i;
      //        int finalJ = j;
      //        jButtons[i][j].addActionListener(new ActionListener() {
      //             @Override
      //             public void actionPerformed(ActionEvent e) {
      //                 jButtons[finalI][finalJ]= new JButton(String.valueOf(game_bord[finalI][finalJ]));


      //            }
      //        });
      //    }//creatingGameWindow();
      //}
        setVisible(true);
    }


}
