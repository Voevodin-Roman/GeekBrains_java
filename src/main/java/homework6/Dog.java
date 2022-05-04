package homework6;

public class Dog extends Animal {
    static int numberObjects = 0;
    public Dog(int maxRunLength, int maxSwimLength, boolean knowsRun, boolean knowsSwim) {
        super(maxRunLength, maxSwimLength, knowsRun, knowsSwim);
        numberObjects++;
    }

    @Override
    public void runind(int distanceRun) {
        if (isRun() == true && distanceRun <= getMaxRunLength()) {
            System.out.println("Пёсик пробежал " + distanceRun + "m");
        }else {
            System.out.println("Пёсик не пробежал " + distanceRun + "m");
        }
    }

    @Override
    public void swimind(int distanceSwim) {
        if (isKnowsSwim() == true && distanceSwim <= getMaxSwimLength()) {
            System.out.println("Пёсик проплыл " + distanceSwim + "m");
        }else {
            System.out.println("Пёсик не проплыл " + distanceSwim + "m. Утоп.");
        }
    }
}
