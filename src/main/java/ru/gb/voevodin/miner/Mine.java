package ru.gb.voevodin.miner;


public class Mine {
    private  int status;

    public Mine(int status) {

        this.status = status;
    }

    public int getStatus() {

        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
