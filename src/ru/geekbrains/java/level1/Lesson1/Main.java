package ru.geekbrains.java.level1.Lesson1;

public class Main {

    public static void main(String[] args) {
        byte b = 50;
        short sh = 15000;
        int i = 200000;
        long l = 30000000L;
        float fl = 35.0f;
        double dl = 500.5005005005;
        boolean bln = true;
        char ch = 'C';

        System.out.println("Результат вычисления = " + calculation(6, 4, 10, 2));

        System.out.println("Сумма двух чисел лежит в пределах от 10ти до 20ти -  " + checkSumTwoNumbers10to20 (6, 15));

        negOrPosNumb(12);

        System.out.println("Это число отрицательное - " + checkIfNeg(-3));

        helloName("Adam");

        yearVysokosny (2);
        yearVysokosny (8);
        yearVysokosny (200);
        yearVysokosny (1200);
        yearVysokosny (1523);
        yearVysokosny (1900);
        yearVysokosny (2000);
        yearVysokosny (2004);

    }

    public static int calculation(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    public static boolean checkSumTwoNumbers10to20(int a, int b) {
        if ((a + b) >= 10 && (a + b) <= 20) {
            return true;
        } else return false;
    }

    public static void negOrPosNumb(int a) {

        System.out.println((a >= 0 ? a + "  - это положительное число" : a + " - это отрицательное число"));
    }

    public static boolean checkIfNeg(int a) {
        if (a < 0); return true;
    }

    public static void helloName(String name){
              System.out.println("Привет, " + name);
    }


    public static void yearVysokosny (int year){

        if (year>=100 && year %400 == 0){
            System.out.println("Год " + year + " является высокосным");
        }
        else if (year %4 == 0 && year%100 != 0){
                System.out.println("Год " + year + " является высокосным");
            }
            else
                System.out.println("Год " + year + " не является высокосным");
        }
    }

