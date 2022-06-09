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

    public void goPlay(){
        GameBody gameBody = new GameBody(width, height, mine);
        gameBody.fillStatus();


    }
}
