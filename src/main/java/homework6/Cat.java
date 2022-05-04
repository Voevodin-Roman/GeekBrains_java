package homework6;

public class Cat extends Animal {
    static int numberObjects = 0;
    public Cat(int maxRunLength, int maxSwimLength, boolean knowsRun, boolean knowsSwim) {
        super(maxRunLength, maxSwimLength, knowsRun, knowsSwim);
        numberObjects++;
    }
    @Override
    public void runind(int distanceRun) {
        if (isRun() == true && distanceRun <= getMaxRunLength()) {
            System.out.println("Кот пробежал " + distanceRun + "m");
        }else {
            System.out.println("Кот не пробежал " + distanceRun + "m");
        }
    }

    @Override
    public void swimind(int distanceSwim) {
        if (isKnowsSwim() == true && distanceSwim <= getMaxSwimLength()) {
            System.out.println("Кот проплыл " + distanceSwim + "m");
        }else {
            System.out.println("Кот не проплыл " + distanceSwim + "m. Утоп.");
        }
    }

}
