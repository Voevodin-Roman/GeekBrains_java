package Homework7;

public class FeedCat {
    public static void main(String[] args) {
        Cat cat = new Cat("Мурзик", 10);
        Cat cat1 = new Cat("Барсик", 15);
        Bowl bowl = new Bowl(20);
        bowl.info();
        cat.eat(bowl);
        bowl.addingFeed(20);
        cat1.eat(bowl);
        bowl.info();
    }
}
