package ru.gb.voevodin;
import java.util.Arrays;
import java.util.Random;
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
        int size = 6;
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
        System.out.println("Задание 6: Минимальное значение: " + min);
        System.out.println("Задание 6: Максимальное значение: " + max);

        //Задание 7
        int[] array7 = {1, 1, 1, 0, 0, 3};
        //for (int u = 0; u < array7.length; u++) { //Заполняем массив случайными числами
         //  array7[u] = new Random().nextInt(99);
        //}
        System.out.println("Задание 7: массив " + Arrays.toString(array7));
        if (checkArrey(array7) == true){
            System.out.println("Данный массив делится внутри себя на равные части ");
        }else{
            System.out.println("Данный массив не делится внутри себя на равные части ");
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
    public static boolean checkArrey(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        for (int j = 0; j < a.length; j++) {
            if (sum - a[j] == a[j]) {
                return true;
            } else if (sum == 0) {
                return false;
            } else {
                sum = sum - a[j];
            }
        }
    }
}