package ru.gb.voevodin.miner;

public class Bord {
    private final int width;
    private final int height;
    private final int mine;

    public Bord(int width, int height, int mine) {
        this.width = width;
        this.height = height;
        this.mine = mine;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getMine() {
        return mine;
    }
}
