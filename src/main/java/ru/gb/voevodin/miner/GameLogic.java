package ru.gb.voevodin.miner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Objects;

public class GameLogic extends JFrame{


    private final int FLAG = -20;
    private final int[][] gameBord;
    private final int width;
    private final int height;
    private JButton[][] jButtons;

    public GameLogic(int[][] game_bord, int width, int height) {
        this.gameBord = game_bord;
        this.width = width;
        this.height = height;
        creatingArrayButton();
    }

    public void creatingArrayButton(){
        //Заполняем массив кнопок
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
        //Формируем окно с игрой
        setTitle("Найди мины");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, width*60, height*60);
        setLayout(new GridLayout(width, height));
        // Создаем кнопки и вешаем на них слушатели
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                add(jButtons[i][j]);
                int finalI = i;
                int finalJ = j;
                jButtons[i][j].addMouseListener(new MouseListener() {
                    @Override
                    // Обработка нажатия правой и левой клавиши мыши
                    public void mouseClicked(MouseEvent e) {
                        if (e.getButton() == MouseEvent.BUTTON1) {
                            if (gameBord[finalI][finalJ] == -10) {
                                dispose();
                                gameOver();
                            } else {
                                jButtons[finalI][finalJ].setText(getColorCode(gameBord[finalI][finalJ]));
                            }
                        }else if(e.getButton() == MouseEvent.BUTTON3) {
                            if (Objects.equals(jButtons[finalI][finalJ].getText(), getColorCode(FLAG))) {
                                jButtons[finalI][finalJ].setText(" ");

                            } else {
                                jButtons[finalI][finalJ].setText(getColorCode(FLAG));
                            }
                        }


                    }
                    @Override
                    public void mousePressed(MouseEvent e) {
                    }
                    @Override
                    public void mouseReleased(MouseEvent e) {
                    }
                    @Override
                    public void mouseEntered(MouseEvent e) {
                    }
                    @Override
                    public void mouseExited(MouseEvent e) {
                    }
                });
                jButtons[i][j].addActionListener(actionEvent -> {
                    if(gameBord[finalI][finalJ] == -10){
                        dispose();
                        gameOver();

                    }else{
                        jButtons[finalI][finalJ].setText(getColorCode(gameBord[finalI][finalJ]));
                    }
                });
            }
        }
        setVisible(true);
    }
    private void gameOver(){
        // Метод выводящий заполненное игровое поле и сообщение о проигрыше
        setTitle("Найди мины");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, width*60, height*60);
        setLayout(new GridLayout(width, height));
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                    jButtons[i][j].setText(getColorCode(gameBord[i][j]));
                    add(jButtons[i][j]);
            }
        }
        setVisible(true);
        JOptionPane.showMessageDialog(null, "Вы проиграли");
        dispose();
    }

    private String getColorCode(final int i) {
        //Метод для форматирования текста внутри кнопки
        switch (i) {
            case 1:
                return "<html><h2><font color=\"blue\">1";
            case 2:
                return "<html><h2><font color=\"green\">2";
            case 3:
                return "<html><h2><font color=\"red\">3";
            case 4:
                return "<html><h2><font color=\"cyan\">4";
            case 5:
                return "<html><h2><font color=\"yellow\">5";
            case 6:
                return "<html><h2><font color=\"purple\">6";
            case 7:
                return "<html><h2><font color=\"purple\">6";
            case 8:
                return "<html><h2><font color=\"purple\">6";
            case -10:
                return "<html><h2><font color=\"red\">@";
            case -20:
                return "<html><h1><font color=\"red\">?";
        }
        return "<html><h2><font color=\"gray\">0";


    }
}
