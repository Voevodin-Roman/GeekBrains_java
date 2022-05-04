package homework5;

//Задание 1: создание класса с полями
public class Employee {
   private final String name;
   private final String last_name;
   private final String middle_name;
   private final String function;
   private final String email;
   private final String phone;
   private final int salary;
   private final int old;

   // Задание 2: создаем конструктор
   public Employee(String name, String last_name, String middle_name, String function, String email, String phone, int salary, int old) {
      this.name = name;
      this.last_name = last_name;
      this.middle_name = middle_name;
      this.function = function;
      this.email = email;
      this.phone = phone;
      this.salary = salary;
      this.old = old;
   }

   public int getOld() {
      return old;
   }

   //Задание 3: создаём методы для печати объекта
   public String toString() {
      return  "Сотрудник  — " + name + " " + last_name + " " + middle_name + '\n' +
              "Должность — " + function + '\n' +
              "Электронная почта — " + email + '\n' +
              "Номер телефона — " + phone +'\n' +
              "Заработная плата — " + salary +'\n' +
              "Возраст — " + old +'\n';
   }

   public void printEmployee(){
      System.out.println(this);
   }
}
