package ru.geekbrains.java.level1.Lesson5;

public class Main {
    public static void main(String[] args) {

    Employee[] employeesArray = new Employee[5];
    employeesArray[0] = new Employee("Ivanov Ivan Ivanovich", "Engineer", "ivanov_iv@mailbox.com", "892312312", 50000, 30);
    employeesArray[1] = new Employee("Petrov Petr Petrovich","Programmer","sidorov_si@mailbox.com","89263335588",80000,25);
    employeesArray[2] = new Employee("Sidorov Sidor Sidorovich","Manager","sidorov_si@mailbox.com","89185554488",60000,60);
    employeesArray[3] = new Employee("Lebedeva Maria Petrovna","Accontant","lebedeva_ma@mailbox.com","89267778855",100000,45);
    employeesArray[4] = new Employee("Solovieva Elena Ivanovna","Director","solovieva_el@mailbox.com","89182224466",120000,50);

        for (int i = 0; i < employeesArray.length ; i++) {
            if (employeesArray[i].getmAge() >40 )
                employeesArray[i].informationOfEmployee();
            System.out.println();
        }
    }
}
