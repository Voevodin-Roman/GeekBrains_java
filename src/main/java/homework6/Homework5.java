package homework6;

public class Homework5 {
    public static void main(String[] args) {
        int runningDistance = 120;
        int swimingDistance = 4;

        Cat cat = new Cat(200, 0, true, false);
        Dog dog = new Dog(500, 10, true, true);
        cat.runind(runningDistance);
        cat.swimind(swimingDistance);
        dog.runind(runningDistance);
        dog.swimind(swimingDistance);

    }
}
