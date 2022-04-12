package ru.gb.voevodin;

public class HomeWorkApp {
    public static void printTheeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSing(){
        int a = 465;
        int b = -464;
        if ((a + b) >= 0){
            System.out.println("Сумма положительная");
        }else{
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor(){
        int value = -577;
        if (value <= 0){
            System.out.println("Красный");
        }else if (value > 0 && value <= 100){
            System.out.println("Желтый");
        }else{
            System.out.println("Зелёный");
        }
    }
    public static void compareNumbers(){
        int a = 234;
        int b = 444;
        if (a >= b){
            System.out.println("a>=b");
        }else{
            System.out.println("a<b");
        }
    }
    public static void main(String[] args) {
        printTheeWords();
        checkSumSing();
        printColor()
        compareNumbers();
    }
}
