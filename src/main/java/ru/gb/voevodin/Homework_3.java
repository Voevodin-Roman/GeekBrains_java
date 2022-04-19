package ru.gb.voevodin;
import java.util.Arrays;
import java.util.List;
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

    }

        //Задание 5
        public static int[] createArray ( int len, int initialValue){
            int[] array = new int[len];
            for (int i = 0; i < array.length; i++) {
                array[i] = initialValue;
            }
            return array;
        }


}