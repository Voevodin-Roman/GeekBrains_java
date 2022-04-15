package ru.gb.voevodin;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int year = 1986;
        String text = "Печатаем текст";
        System.out.println("Задание 1 - " + checkingTwoNumbers(a , b));
        realNumberSign(a);
        System.out.println("Задание 3 - " + numberState(a));
        printText(a, text);
        if (leapYearDefinition(year) == true) {
            System.out.println("Задание 5 - Год високосный ");
        }else{
             System.out.println("Задание 5 - Год не високосный");
        }
    }
    //Задание 1
    public static boolean checkingTwoNumbers(int a, int b) {
        if( a + b >= 10 && a + b <= 20){
            return true;
        }else{
            return false;
        }
    }
    //Задание 2
    public static void realNumberSign(int a){
        if(a < 0){
            System.out.println("Задание 2 - Число отрицательное");
        }else{
            System.out.println("Задание 2 - Число положительное");
        }
    }
    //Задание 3
    public static boolean numberState(int a){
        if( a < 0){
            return true;
        }else {
            return false;
        }
    }
    //Задание 4
    public static void printText(int a, String text){
        System.out.println("Задание 4 - печатаем переменную " + a + " раз(а):");
        for (int i = 0; i < a; i++) {
            System.out.println(text);
        }
    }
    //Задание 5
    public static boolean leapYearDefinition(int y){
        if(y % 400 == 0){
            return true;
        }else if (y % 100 == 0){
            return false;
        }else  if (y % 4 == 0){
            return true;
        }else{
            return false;
        }
    }
}
