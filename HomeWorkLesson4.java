package ru.geekbrains.Level1.Lesson2;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkLesson4 {

    static int SIZE_X = 5;
    static int SIZE_Y = 5;
    static int SIZE_WIN = 4;  // количество выигршных фишек

    static char[][] field = new char[SIZE_Y][SIZE_X];

    static char PLAYER_DOT = 'X';
    static char AI_DOT = 'O';
    static char EMPTY_DOT = '.';

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
    public static void printField() {
        System.out.print("  ");
        for (int i = 0; i < SIZE_X; i++) {
            System.out.print(" " + (i + 1));
        }
        System.out.println();

        for (int i = 0; i < SIZE_Y; i++) {
            System.out.print(i + 1 + " |");
            for (int j = 0; j < SIZE_X; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
    }

    // проверка, что клетка свободна (проверка возможности хода)
    public static boolean isCellEmpty(int x, int y) {
        if (x < 0 || y < 0 || x > SIZE_X || y > SIZE_Y) {
            return false;
        }
        return field[y][x] == EMPTY_DOT;
    }

    // вписываем крестик или нолик
    public static void setSymb(int x, int y, char symb) {
        field[y][x] = symb;
    }

    //ход игрока
    public static void playerStep() {
        int x, y;
        do {
            System.out.println("Введите кординаты X Y от (" + SIZE_Y + " до " + SIZE_X + ")");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellEmpty(y, x));
        setSymb(y, x, PLAYER_DOT);
    }

    //ход системы
    public static void aiStep() {
        int x, y;
        do {
            System.out.println("Ход системы");
            x = random.nextInt(SIZE_X);
            y = random.nextInt(SIZE_Y);
        } while (!isCellEmpty(y, x));
        setSymb(y, x, AI_DOT);
    }


    //проверка, что поле не заполнено полностью
    public static boolean isFieldFull() {
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                if (field[i][j] == EMPTY_DOT) {
                    return false;
                }
            }
        }
        return true;
    }


 //   проверка выигрыша
//проверка колонок и рядов слева направо
    public static boolean checkWinColumnsLeft(char symb) {
        boolean columns;
        boolean rows;

        for (int i = 0; i < SIZE_X; i++) {
            columns = true;
            rows = true;
            int count = 0;
            for (int j = 0; j < SIZE_Y; j++) {
                columns = columns && (field[i][j] == symb);
                rows = rows && (field[j][i] == symb);
                if (columns == true ||rows == true ) {
                    count++;
                }
                if (count == SIZE_WIN) break;

            }
            if (columns || rows) return true;
        }
        return false;
    }

//проверка колонок и рядов справа налево
    public static boolean checkWinColumnsRowsRight(char symb) {
        boolean columns;
        boolean rows;

        for (int i = SIZE_X-1; i >0 ; i--) {
            columns = true;
            rows = true;
            int count = 0;
            for (int j = SIZE_Y -1; j >0; j--) {
                columns = columns && (field[i][j] == symb);
                rows = rows && (field[j][i] == symb);
                if (columns == true || rows == true) {
                    count++;
                }
                if (count == SIZE_WIN) break;

            }
            if (columns || rows) return true;
        }
        return false;
    }

    public static boolean checkDiagonalsLeft(char symb) {
        boolean diaUpLeft, diaDownLeft;
        diaUpLeft = true;
        diaDownLeft = true;
        int count = 0;
        for (int i = 0, j = SIZE_X - 1; i < SIZE_X; i++, j--) {
            diaDownLeft = diaDownLeft && (field[i][j] == symb);
            diaUpLeft = diaUpLeft && (field[SIZE_Y - 1 - i][j] == symb);
            if (diaDownLeft == true || diaUpLeft == true) {
                count++;
            }
            if (count == SIZE_WIN) break;
        }
        if (diaDownLeft || diaUpLeft) return true;
        return false;
    }

    public static boolean checkDiagonalsRight(char symb) {
        boolean diaUpRight, diaDownRight;
        diaUpRight = true;
        diaDownRight = true;
        int count = 0;
        for (int i = 0, j = SIZE_Y - 1; i < SIZE_Y; i++, j--) {
            diaDownRight = diaDownRight && (field[j][i] == symb);
            diaUpRight = diaUpRight && (field[SIZE_X - 1 - j][i] == symb);
            if (diaDownRight == true || diaUpRight == true) {
                count++;
            }
            if (count == SIZE_WIN) break;
        }
        if (diaDownRight || diaUpRight) return true;
        return false;
    }

    //игра
    public static void game() {
        initialField();
        printField();

        while (true) {
            playerStep();
            printField();
            if (checkWinColumnsRowsRight(PLAYER_DOT)) {
                System.out.println("Player win!");
                break;
            }
            if (checkWinColumnsLeft(PLAYER_DOT)) {
                System.out.println("Player win!");
                break;
            }
            if (checkDiagonalsRight(PLAYER_DOT)) {
                System.out.println("Player win!");
                break;
            }
            if (checkDiagonalsLeft(PLAYER_DOT)) {
                System.out.println("Player win!");
                break;
            }
            if (isFieldFull()) {
                System.out.println("Draw!");
                break;
            }

            aiStep();
            printField();
            if (checkWinColumnsRowsRight(AI_DOT)) {
                System.out.println("System win!");
                break;
            }
            if (checkWinColumnsLeft(AI_DOT)) {
                System.out.println("System win!");
                break;
            }
            if (checkDiagonalsRight(AI_DOT)) {
                System.out.println("System win!");
                break;
            }
            if (checkDiagonalsLeft(AI_DOT)) {
                System.out.println("System win!");
                break;
            }
            if (isFieldFull()) {
                System.out.println("Draw!");
                break;
            }
        }
    }

    public static void main(String[] args) {
        game();
    }

}

