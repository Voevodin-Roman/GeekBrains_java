package ru.gb.voevodin;
import java.util.Arrays;
import java.util.Random;
import java.util.Stack;

public class Homework_3 {
    public static void main(String[] args) {

        //Задание 1
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) { //Заполняем массив случайными числами 0 и 1
            a[i] = new Random().nextInt(2);
        }
        System.out.println("Задание 1 Начальный массив: " + Arrays.toString(a));
        for (int i = 0; i < a.length; i++) { //Меняем числа местами
            if (a[i] == 0) {
                a[i] = 1;
            } else {
                a[i] = 0;
            }
        }
        System.out.println("Задание 1 Конечный массив:  " + Arrays.toString(a));

        //Задание 2
        int[] b = new int[100];
        for (int j = 0; j < b.length; j++) { //Заполняем массив числами от 1 до 100
            b[j] = j + 1;
        }
        System.out.println("Задание 2: " + Arrays.toString(b));

        //Задание 3
        int[] c = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int k = 0; k < c.length; k++) {
            if (c[k] < 6) {
                c[k] = c[k] * 2;
            }
        }
        System.out.println("Задание 3: " + Arrays.toString(c));

        //Задание 4
        int size = 5;
        int[][] d = new int[size][size];
        for (int l = 0; l < d.length; l++) {
            d[l][l] = 1;
            int oper = d.length - 1 - l;
            d[oper][l] = 1;
        }
        System.out.println("Задание 4: " + Arrays.deepToString(d));

        //Задание 5
        System.out.println("Задание 5: " + Arrays.toString(createArray(5, 44455)));

        //Задание 6
        int[] w = new int[10];
        for (int m = 0; m < w.length; m++) { //Заполняем массив случайными числами
            w[m] = new Random().nextInt(222);
        }
        System.out.println("Задание 6: Из массива" + Arrays.toString(w));
        Arrays.sort(w);
        int min = w[0];
        int max = w[w.length - 1];
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);

        //Задание 7
        int[] array7 = new int[4];
        for (int u = 0; u < array7.length; u++) { //Заполняем массив случайными числами
        array7[u] = new Random().nextInt(2);
        }
        System.out.println("Задание 7: массив " + Arrays.toString(array7));
        if (checkBalance(array7)){
            System.out.println("Данный массив делится внутри себя на равные части");
        }else{
            System.out.println("Данный массив не делится внутри себя на равные части");
        }

        //Задание 8
        int[] array8 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int positionShift = 4;
        System.out.println("Задание 8: Начальный массив " + Arrays.toString(array8));
        if(positionShift > array8.length -1 ){
            System.out.println("Ошибка. Заданное смещение <" + positionShift + "> больше длинны масcива");
        }else {
            System.out.println("Задание 8: Конечный массив, смещение на " + positionShift + " позиций " + Arrays.toString(mixingValuesInArray(array8, positionShift)));
        }
    }

    //Задание 5
    public static int[] createArray ( int len, int initialValue){
            int[] array = new int[len];
            for (int i = 0; i < array.length; i++) {
                array[i] = initialValue;
            }
            return array;
        }
    //Задание 7
    public static boolean checkBalance(int[] a){
        int sumAll = 0;
        int sumEnd = 0;
        boolean check = false;
        for (int i = 0; i < a.length; i++) {
            sumAll = sumAll + a[i];
        }
        for (int j = 0; j < a.length; j++) {
            sumAll = sumAll - a[j];
            sumEnd = sumEnd + a[j];
            if (sumAll == sumEnd) {
                check = true;
                break;
            }else{
                check = false;
            }
        }
        return check;
    }
    // Задание 8
    public static int[] mixingValuesInArray(int[] array, int a){
        Stack stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            stack.push(array[array.length -1 -i]);
        }
        for (int i = 0; i < array.length; i++) {
            int t;
            if(i + a >= 0 && i + a < array.length){
                t = i + a;
             }else if(i + a < 0) {
                 t = array.length + i + a;
            }else{
                t = (i + a) - array.length;
             }
            array[t] = (int) stack.pop();
        }
        return array;
    }
}
