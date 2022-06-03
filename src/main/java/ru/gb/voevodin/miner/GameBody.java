package ru.gb.voevodin.miner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class GameBody {
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_WHITE = "\u001B[37m";
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_GREY = "\u001b[38;5;236m";
    private static final String ANSI_GREY_BACKGROUND = "\u001b[48;5;246m";
    private static final String ANSI_BLACK_BACKGROUND = "\u001b[48;5;238m";
    private static final String ANSI_RED_BACKGROUND = "\u001b[48;5;9m";
    private static final String ANSI_YELLOW_BACKGROUND = "\u001b[48;5;226m";
    private static final int CELL_FLAG = 100000000;
    private final int width;
    private final int height;
    private final int mine;
    private int multiplication;
    private static final int MINE = -10;
    private static final int EMPTY = -1;

    public GameBody(int width, int height, int mine) {
        this.width = width;
        this.height = height;
        this.mine = mine;
        multiplication = width * height;
    }


    private static String getColorCode(final int i) {
        switch (i) {
            case EMPTY:
                return ANSI_WHITE;
            case 1:
                return ANSI_BLUE;
            case 2:
                return ANSI_GREEN;
            case 3:
                return ANSI_RED;
            case 4:
                return ANSI_CYAN;
            case 5:
                return ANSI_YELLOW;
            case 6:
                return ANSI_PURPLE;
        }
        return ANSI_GREY;
    }
    private  int[][] fillStatus() {
        int[][] board = new int[width][height];
        int mines = mine;
        final Random random = new Random();
        while (mines > 0) {
            int x = random.nextInt(width), y = random.nextInt(height);
            if (board[x][y]!= MINE) {
                continue;
            }
            board[x][y] = MINE;
            mines--;
        }


        return board;
    public void CreatingCellsWithMines(int summ){

        ArrayList <Integer> addmines = new ArrayList<>(summ);

        for (int i = 0; i < summ; i++) {
            addmines.add(i);
        }
        Collections.shuffle(addmines);
        for (int i = 0; i < summ; i++) {
            elements[i] = new Mine(0);
        }


        for (int i = 0; i < mine; i++) {
            elements[addmines.get(i)].setStatus(MINE);
        }

        for (int i = 0; i < summ; i++) {
            if(elements[i].getStatus() != MINE){

                elements[i].setStatus(getMinesCountAroundCell(i));
            }

        }
        for (int i = 0; i < summ; i++) {
            System.out.println(elements[i].getStatus());
        }




    }
    private int getMinesCountAroundCell(int line) {
        int mCount = 0;
        for (int i = line - width - 1; i <= line -width + 1; i++) {
            int mCount = 0;
            for (int i = line - 1; i <= line + 1; i++) {
                for (int j = row - 1; j <= row + 1; j++) {
                    if (i < 0 || i >= HEIGHT || j < 0 || j >= LATEST) {
                        continue;
                    }
                    if (isMine(board[i][j])) {
                        mCount++;
                    }
                }
            }
            return mCount;
    }


}




