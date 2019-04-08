package ru.geekbrains.Level1.Lesson2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWorkLesson3 {

    /* 1. Написать программу, которая загадывает случайное число от 0 до 9,
    и пользователю дается 3 попытки угадать это число.
    При каждой попытке компьютер должен сообщить больше ли указанное пользователем число
    чем загаданное, или меньше.   После победы или проигрыша выводится запрос –
    «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
     */

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int bound = 10;
        do {
            int theNumber = randomNumber(bound);
            range(0, bound-1);

            for (int i = 0; ; i++) {

                int guessNumber = getNumberFromScanner();

                if (theNumber == guessNumber) {
                    System.out.println("You won!");
                    break;
                } else if (theNumber < guessNumber) {
                    System.out.println("The Number is smaler");
                    continue;
                } else {
                    System.out.println("The Number is bigger");
                    continue;
                }
            }
        } while (continueOrNot() == 1);



       /* Создать массив из слов String[] words
        При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
        сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь.
        Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
        apple – загаданное   apricot - ответ игрока
        ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
        Для сравнения двух слов посимвольно, можно пользоваться:
        String str = "apple";
        str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
        Играем до тех пор, пока игрок не отгадает слово  Используем только маленькие буквы */

        welcomeGameFruits();

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        do {
            Random random = new Random();
            int pos = random.nextInt(words.length);
            String theString = new String(words[pos]);

            do {
             String strGuess = getStringFromScanner();
             int maxLengthString = 15;

                 for (int i = 0; i < theString.length() && i < strGuess.length(); i++) {
                     if (theString.charAt(i) == strGuess.charAt(i)) {
                         System.out.print(strGuess.charAt(i));
                     } else
                         System.out.print("#");
                 }

                 for (int j = 0; j < maxLengthString; j++) {
                    if ((theString.length()+j) == maxLengthString || (strGuess.length() +j) == maxLengthString);
                    System.out.print("#");
                }

                 if (theString.equals(strGuess)) {
                     System.out.println("\n" + "This is '" + theString + "'! Well done! You win!");
                     break;
                 } else System.out.println("\n Try again");


               } while (true);

          }  while (continueOrNot() != 0) ;

        }



    public static int randomNumber(int bound) {
        Random random = new Random();
        int theNumber = random.nextInt(bound);
        return theNumber;
         }

    public static void range(int min, int max) {
        System.out.println("Guess the number from " + min + " to " + max + ":");
         }

    public static int getNumberFromScanner() {
        int x;
        x = sc.nextInt();
        return x;
         }

    public static int continueOrNot() {
        int c;
        System.out.println("\n" + "Do you want to play again? If yes - press 1, if no - press 0");
             c = sc.nextInt();
             if (c==0) System.out.println("Thanks for the game! See you!)\n");
       return c;
         }

    public static String getStringFromScanner() {
        System.out.println("Guess what is the fruit or the vegetable \n");
        String str;
        str = sc.next();
        return str;
    }


    public static void welcomeGameFruits(){
        System.out.println("Hello there! Welcome to the game 'Guess the fruit or the vegetable' \n");
    }


}



