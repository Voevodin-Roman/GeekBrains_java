package homework6;

public class Animals {
    private final int maxRunLength;
    private final int maxSwimLength;
    private final boolean run;
    private final boolean swim;


    public Animals(int maxRunLength, int maxSwimLength, boolean run, boolean swim) {
        this.maxRunLength = maxRunLength;
        this.maxSwimLength = maxSwimLength;
        this.run = run;
        this.swim = swim;
    }

    public int getMaxRunLength() {
        return maxRunLength;
    }

    public int getMaxSwimLength() {
        return maxSwimLength;
    }

    public boolean isRun() {
        return run;
    }

    public boolean isSwim() {
        return swim;
    }
}
