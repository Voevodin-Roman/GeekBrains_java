package homework5;

//Задание 1: создание класса с полями
public class Employee {
   private final String name;
   private final String last_name;
   private final String middle_name;
   private final String function;
   private final String email;
   private final long phone;
   private final int salary;
   private final int old;

   // Задание 2: создаем конструктор
   public Employee(String name, String last_name, String middle_name, String function, String email, long phone, int salary, int old) {
      this.name = name;
      this.last_name = last_name;
      this.middle_name = middle_name;
      this.function = function;
      this.email = email;
      this.phone = phone;
      this.salary = salary;
      this.old = old;
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

   public static void main(String[] args) {
      //Задание 4: создаём массив из объектов
      Employee[] arrayEmployees = new  Employee[5];
      arrayEmployees[0] = new Employee("Иван", "Иванович", "Иванов", "Инженер", "ivanov@n.n", 79054851212L,150000, 30);
      arrayEmployees[1] = new Employee("Петр", "Петров", "Пертович", "Престидижитатор", "petrov@p.p", 79065524212L, 200000, 45);
      arrayEmployees[2] = new Employee("Сидор", "Сидоров", "Сидорович", "Дворник", "sidorov@s.s", 79030001214L,15000, 52);
      arrayEmployees[3] = new Employee("Фекл", "Феклов", "Феклович", "Пахарь", "feklov@f.f", 78058654444L, 12563, 68);
      arrayEmployees[4] = new Employee("Лентяй", "Лентяев", "Лентяевич", "Потомственный безработный", "lentayev@l.l", 79045556622L, 2, 25);

      //Задание 5: печатаем сотрудников возрастом выше 40 лет
      for (int i = 0; i < arrayEmployees.length; i++) {
         if (arrayEmployees[i].old > 40) {
            arrayEmployees[i].printEmployee();
         }
      }
   }
}
