package Homework7;

public class FeedCat {
    public static void main(String[] args) {
        Cat[] cat = new Cat[4];
        cat[0] = new Cat("Василий", 5);
        cat[1] = new Cat("Мурзик", 10);
        cat[2] = new Cat("Барсик", 15);
        cat[3] = new Cat("Пушок", 20);
        Bowl bowl = new Bowl(10);
        bowl.info();
        bowl.addingFeed(30);
        for (Cat a : cat) {
            a.eat(bowl);
        }
        bowl.info();
    }
}
