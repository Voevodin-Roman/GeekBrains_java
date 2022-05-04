package homework5;

import java.util.Arrays;

public class Homework5 {
    public static void main(String[] args) {
        //Задание 4: создаём массив из объектов
        Employee[] arrayEmployees = new  Employee[5];
        arrayEmployees[0] = new Employee("Иван", "Иванович", "Иванов", "Инженер", "ivanov@n.n", "+79054851212",150000, 30);
        arrayEmployees[1] = new Employee("Петр", "Петров", "Пертович", "Престидижитатор", "petrov@p.p", "+79065524212", 200000, 45);
        arrayEmployees[2] = new Employee("Сидор", "Сидоров", "Сидорович", "Дворник", "sidorov@s.s", "+79030001214",15000, 33);
        arrayEmployees[3] = new Employee("Фекл", "Феклов", "Феклович", "Пахарь", "feklov@f.f", "+78058654444", 12563, 68);
        arrayEmployees[4] = new Employee("Лентяй", "Лентяев", "Лентяевич", "Потомственный безработный", "lentayev@l.l", "+79045556622", 2000, 44);
        //Задание 5: печатаем сотрудников возрастом выше 40 лет
        for (int i = 0; i < arrayEmployees.length; i++) {
            if (arrayEmployees[i].getOld() > 40) {
                arrayEmployees[i].printEmployee();
            }
        }

    }

}
