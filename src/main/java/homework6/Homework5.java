package homework6;

public class Homework5 {
    public static void main(String[] args) {
        int runningDistance = 600;
        int swimingDistance = 11;

        Cat cat1 = new Cat(200, 0, true, false);
        Cat cat2 = new Cat(200, 0, true, false);
        Cat cat3 = new Cat(200, 0, true, false);
        Cat cat4 = new Cat(200, 0, true, false);
        Cat cat5 = new Cat(200, 0, true, false);
        Cat cat6 = new Cat(200, 0, true, false);
        Cat cat7 = new Cat(200, 0, true, false);
        Dog dog1 = new Dog(500, 10, true, true);
        Dog dog2 = new Dog(500, 10, true, true);
        Dog dog3 = new Dog(500, 10, true, true);

        cat1.runind(runningDistance);
        cat1.swimind(swimingDistance);
        dog1.runind(runningDistance);
        dog1.swimind(swimingDistance);
        System.out.println("Всего животных: " + Animal.numberObjects);
        System.out.println("Кошек: " + Cat.numberObjects);
        System.out.println("Собак: " + Dog.numberObjects);

    }
}
