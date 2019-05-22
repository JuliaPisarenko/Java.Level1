package ru.geekbrains.lesson5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    static final int size = 10000000;
    static final int h = size / 2;
    static float[] arr = new float[size];

    public static void main(String[] args) {

        wholeArrCounter ();
        dividedArrCounter ();

    }

    public static void wholeArrCounter () {

        Arrays.fill(arr,1);
        long timer = System.currentTimeMillis();


        for(int i=0; i<size; i++){
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.out.println("Время выполнения процедуры: " + (System.currentTimeMillis() - timer) + " миллисекунд.");
    }

    public static void dividedArrCounter () {


        Arrays.fill(arr,1);

        long timer = System.currentTimeMillis();

        float[] arr1 = new float[h];
        float[] arr2 = new float[h];


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.arraycopy(arr, 0, arr1, 0, h);
                System.arraycopy(arr, h, arr2, 0, h);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<arr1.length; i++){
                    arr1[i] = (float)(arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<arr2.length; i++){
                    arr2[i] = (float)(arr2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });

        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.arraycopy(arr1, 0, arr, 0, h);
                System.arraycopy(arr2, 0, arr, h, h);
            }
        });

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Время выполнения процедуры: " + (System.currentTimeMillis() - timer) + " миллисекунд.");
    }

}

