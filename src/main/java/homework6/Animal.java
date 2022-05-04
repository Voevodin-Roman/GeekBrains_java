package homework6;

public class Animal {
    private final int maxRunLength;
    private final int maxSwimLength;
    private final boolean knowsRun;
    private final boolean knowsSwim;


    public Animal(int maxRunLength, int maxSwimLength, boolean knowsRun, boolean knowsSwim) {
        this.maxRunLength = maxRunLength;
        this.maxSwimLength = maxSwimLength;
        this.knowsRun = knowsRun;
        this.knowsSwim = knowsSwim;
    }

    public int getMaxRunLength() {
        return maxRunLength;
    }

    public int getMaxSwimLength() {
        return maxSwimLength;
    }

    public boolean isRun() {
        return knowsRun;
    }

    public boolean isKnowsSwim() {
        return knowsSwim;
    }

    public void swimind(int distanceSwim) {
        if (knowsSwim && distanceSwim <= maxSwimLength) {
            System.out.println(" проплыл " + distanceSwim + "m");
        } else {
            System.out.println(" не проплыл " + distanceSwim + "m");
        }
    }

    public void runind(int distanceRun) {
        if (knowsRun && distanceRun <= maxRunLength) {
            System.out.println(" пробежал " + distanceRun + "m");
        } else {
            System.out.println(" не пробежал " + distanceRun + "m");
        }
    }
}