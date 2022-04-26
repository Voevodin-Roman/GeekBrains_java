package ru.gb.voevodin;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Homework4 {
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
    private static final int CELL_OPEN = 1;
    private static final int CELL_CLOSE = 0;
    private static final int CELL_FLAG = 100000;
    private static int LATEST = 13;
    private static int HEIGHT = 13;
    private static int MINE_COUNT = 40;
    private static final int MINE = 1000;
    private static final int EMPTY = -1;
    private static int CHARACTERS = LATEST * HEIGHT;
    private  static int[][] MINEBORD = generateBoard();

    public static void main(String[] args) {
        System.out.println("Введите ширину минного поля");
        final Scanner scanner1 = new Scanner(System.in);
        LATEST = Integer.parseInt(scanner1.nextLine());
        System.out.println("Введите высоту минного поля");
        final Scanner scanner2 = new Scanner(System.in);
        HEIGHT = Integer.parseInt(scanner2.nextLine());
        System.out.println("Введите количество мин");
        final Scanner scanner3 = new Scanner(System.in);
        MINE_COUNT = Integer.parseInt(scanner3.nextLine());
        System.out.println("Для открытия ячейки введите её номер");
        System.out.println("Что бы пометить ячейку флагом, поставьте после номера ячейки звёздочку *");
        System.out.println("После установки флага ячейка помечается желтым флагом");
        final boolean isWin = play();
        if (isWin) {
            System.out.println("Ура!Вы победитель!");
        } else {
            for (int i = 0; i < HEIGHT; i++){
                System.out.println();
                for (int j = 0; j < LATEST; j++) {
                    if(MINEBORD[i][j] == 1000){
                        System.out.print(ANSI_RED_BACKGROUND + ANSI_GREY);
                        System.out.printf(printSpaces(), " ");
                        System.out.print(ANSI_RESET + " ");
                    }else {
                        String cellColorend = getColorCode(MINEBORD[i][j]);
                        System.out.print(ANSI_BLACK_BACKGROUND + cellColorend);
                        if (MINEBORD[i][j] == EMPTY) {
                            System.out.printf(printSpaces(), " ");
                        } else {
                            System.out.printf(printSpaces(), MINEBORD[i][j]);
                        }
                        System.out.print(ANSI_RESET + " ");
                    }
                }
            }
        }
        System.out.println();
        System.out.println("Печалька!!!Вы проиграли!");
    }
    private static boolean isWin(final int[][] moves) {
        int openCell = 0;
        for (int[] lines : moves) {
            for (int cell : lines) {
                if (cell == CELL_OPEN) {
                    openCell++;
                }
            }
        }
        return openCell == HEIGHT * LATEST - MINE_COUNT;
    }

    public static boolean play() {
        int[][] board = MINEBORD;
        int[][] moves = new int[HEIGHT][LATEST];
        boolean isPass;
        boolean win;
        do {
            isPass = move(board, moves);
            win = isWin(moves);
        } while (isPass && !win);

        return isPass;
    }

    private static boolean move(final int[][] board, final int[][] moves) {
        final Scanner scanner = new Scanner(System.in);
        printBoard(board, moves);
        while (true) {
            System.out.println("Введите номер ячейки и нажмите Enter,  ");
            System.out.print("что бы пометить ячейку флагом добавьте звёздочку после номера ячейки: ");
            String s = scanner.nextLine();
            boolean star = false;
            if (s.endsWith("*")) {
                s = s.substring(0, s.length() - 1);
                star = true;
            }
            int number = Integer.parseInt (s);
            int row = number % LATEST;
            int line = number / LATEST;
            if(number >= 0 && number < CHARACTERS ){
                if (star) {
                    moves[line][row] = number + CELL_FLAG;
                    System.out.println(moves[line][row]);
                    return true;
                }
                if (isMine(board[line][row])) {
                    return false;
                }
                moves[line][row] = CELL_OPEN;
                return true;
            }

        }
    }

    private static void printBoard(final int[][] board, final int[][] moves) {
        System.out.println();
        int numberCell = -1;
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < LATEST; j++) {
                numberCell = numberCell +1;
                if (moves[i][j] == CELL_CLOSE) {
                    System.out.print(ANSI_GREY_BACKGROUND + ANSI_GREY); // + UDRERLINEDTEXT
                    System.out.printf(printSpaces(), numberCell);
                    System.out.print(ANSI_RESET + " ");
                    continue;
                }
                if (moves[i][j] > 100000) {
                    int p = moves[i][j] - CELL_FLAG;
                    System.out.print(ANSI_YELLOW_BACKGROUND + ANSI_GREY);
                    System.out.printf(printSpaces(), p);
                    System.out.print(ANSI_RESET + " ");
                    continue;
                }
                String cellColor = getColorCode(board[i][j]);
                System.out.print(ANSI_BLACK_BACKGROUND + cellColor);
                if (board[i][j] == EMPTY) {
                    System.out.printf(printSpaces(), " ");
               // } else if (isMine(board[i][j])) {
               //     System.out.printf(printSpaces(), "*");
                } else {
                    System.out.printf(printSpaces(), board[i][j]);
                }
                System.out.print(ANSI_RESET + " ");
            }
            System.out.println();
        }
    }
    private static String printSpaces() {
        int length = (int) (Math.log10(CHARACTERS) + 1);
        String str = Integer.toString(length);
        return "%" + str + "s";
    }

    private static String getColorCode(final int i) {
        switch (i) {
            case EMPTY:
                return ANSI_WHITE;
            case MINE:
                return ANSI_PURPLE;
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
        }
        return ANSI_GREY;
    }

    private static int[][] generateBoard() {
        final int[][] board = fillMines();
        calculateMines(board);
        return board;
    }

    private static int[][] fillMines() {
        int[][] board = new int[HEIGHT][LATEST];
        int mines = MINE_COUNT;
        final Random random = new Random();
        while (mines > 0) {
            int x = random.nextInt(HEIGHT), y = random.nextInt(LATEST);
            if (isMine(board[x][y])) {
                continue;
            }
            board[x][y] = MINE;
            mines--;
        }
        return board;
    }

    private static void calculateMines(int[][] board) {
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < LATEST; j++) {
                if (isMine(board[i][j])) {
                    continue;
                }
                board[i][j] = getMinesCountAroundCell(board, i, j);
            }
        }
    }

    private static boolean isMine(int i) {
        return i == MINE;
    }

    private static int getMinesCountAroundCell(int[][] board, int line, int row) {
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
