package ru.geekbrains.java.level1.Lesson4;

import java.util.Random;
import java.util.Scanner;

public class CrossHome {

     static int SIZE_X = 5;
     static int SIZE_Y = 5;
     static int SIZE_WIN = 4;

     static char[][] field = new char[SIZE_Y][SIZE_X];

     static char PLAYER_DOT = 'X';
     static char AI_DOT = 'O';
     static char EMPTY_DOT = '-';

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    // инициализация игрового поля
    public static void initialField() {
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                field[i][j] = EMPTY_DOT;
            }
        }
    }

    // распечатываем игровое поле
    public static void printField(){
        System.out.println("------");
        for (int i = 0; i < SIZE_Y; i++) {
            System.out.print("|");
            for (int j = 0; j <SIZE_X ; j++) {
                System.out.print(field[i][j]  + "|");
            }
            System.out.println();
        }
        System.out.println("------");
    }

    // проверка, что клетка свободна (проверка возможности хода)
    public static boolean isCellEmpty(int x, int y){
        if ( x < 0 || y < 0 || x > SIZE_X || y > SIZE_Y ){
            return false;
        }
        return field[y][x]==EMPTY_DOT;
    }

    // впиываем крестик или нолик
    public static void setSymb(int x, int y, char symb){
        field[y][x]= symb;
    }

    //ход игрока
    public static void playerStep(){
        int x,y;
      do {
          System.out.println("Введите кординаты X Y от (" + SIZE_Y + " до " + SIZE_X + ")");
          x = scanner.nextInt() - 1;
          y = scanner.nextInt() - 1;
      }while(!isCellEmpty(x,y));
      setSymb(y, x, PLAYER_DOT);
    }

    //ход системы
    public static void aiStep(){
        int x,y;
        do {
            System.out.println("Ход системы");
            x = random.nextInt(SIZE_X);
            y = random.nextInt(SIZE_Y);
        }while(!isCellEmpty(x,y));
        setSymb(y, x, AI_DOT);
    }




    //проверка, что поле не заполнено полностью
    public static boolean isFieldFull(){
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                if (field[i][j]==EMPTY_DOT) {
                    return false;
                }
            }
        } return true;
    }


    //проверка выигрыша
    public static boolean checkWinRowsColumns(char symb){
        boolean rows, columns;
        for (int i = 0; i < SIZE_X ; i++) {
            rows = true;
            columns = true;
            for (int j = 0; j <SIZE_Y ; j++) {
               rows = rows && (field[i][j] == symb);
               columns = columns && (field[j][i] == symb);
            } if (rows || columns) return true;
        }return false;
    }

    public static boolean checkDiagonalsRight (char symb){
        boolean diaUpRight , diaDownRight ;
        diaUpRight= true;
        diaDownRight = true;
        for (int i = 0 , j = SIZE_X - 1; i < SIZE_X; i++, j--) {
             diaDownRight = diaDownRight && (field[i][j] == symb);
             diaUpRight = diaUpRight && (field[SIZE_Y - 1 - i][j] == symb);
        }if (diaDownRight || diaUpRight) return true;
        return false;
    }

    //игра
    public static void game(){
        initialField();
        printField();

        while(true){
            playerStep();
            printField();
            if(checkWinRowsColumns(PLAYER_DOT)){
                System.out.println("You win!");
                break;
            }
            if(checkDiagonalsRight(PLAYER_DOT)){
                System.out.println("You win!");
                break;
            }
            if (isFieldFull()){
                System.out.println("Draw!");
                break;
            }

            aiStep();
            printField();
            if(checkWinRowsColumns(AI_DOT)){
                System.out.println("System win!");
                break;
            }
            if(checkDiagonalsRight(AI_DOT)){
                System.out.println("System win!");
                break;
            }
            if (isFieldFull()){
                System.out.println("Draw!");
                break;
            }
        }
    }

    public static void main(String[] args) {
        game();
    }

}
