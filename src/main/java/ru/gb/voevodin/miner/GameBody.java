package ru.gb.voevodin.miner;
import java.util.Random;
public class GameBody {

    private static final int CELL_FLAG = 100000000;
    private final int width;
    private final int height;
    private final int mine;
    private static final int MINE = -10;
    private static final int EMPTY = -1;

    public GameBody(int width, int height, int mine) {
        this.width = width;
        this.height = height;
        this.mine = mine;

    }

    public void fillStatus() {
        int[][] board = new int[width][height];
        int mines = mine;
        final Random random = new Random();
        while (mines > 0) {
            int x = random.nextInt(width), y = random.nextInt(height);
            if (board[x][y] == MINE) {
                continue;
            }
            board[x][y] = MINE;
            mines--;
        }
        board = calculateMines(board);
        GameLogic gameLogic = new GameLogic(board, width, height);


        for (int[] ints : board) {
            System.out.println();
            for (int anInt : ints) {
                System.out.print(anInt + "   ");

            }
        }
    }
    private int[][] calculateMines(int[][] board) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (board[i][j] == MINE) {
                    continue;
                }
                board[i][j] = getMinesCountAroundCell(board, i, j);
            }
        }
        return board;
    }

    private int getMinesCountAroundCell(int[][] board, int line, int row) {

        int mCount = 0;
        for (int i = line - 1; i <= line + 1; i++) {
            for (int j = row - 1; j <= row + 1; j++) {
                if (i < 0 || i >= width || j < 0 || j >= height) {
                    continue;
                }
                if (board[i][j] == MINE) {
                    mCount++;
                }
            }
        } return mCount;
    }
}




