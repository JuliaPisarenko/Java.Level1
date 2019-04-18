package ru.geekbrains.java.level1.lesson6;

public class Main {
    public static void main(String[] args) {

       Animals [] animalsArray = {
               new Cat( "Barsik", 200, 0, 2),
               new Cat( "Murzik", 150, 0, 1.5f),
               new Dog("Sharik", 500, 10, 0.5f),
               new Dog ( "Tuzik", 400, 8, 0.2f)};

        Marathon [] marathonArray = {
                new Marathon(100, 0, 1.5f),
                new Marathon(600, 5, 0.5f)};

        for (int m = 0; m <marathonArray.length; m++) {

            System.out.println();
            System.out.println("Marathon # " + (m+1) + ".           Run distance: " + marathonArray[m].runDistance
                    + ". Swim distance: " + marathonArray[m].swimDistance + ". Jump high: " + marathonArray[m].jumpHigh);

            for (int i = 0; i < animalsArray.length ; i++) {
                System.out.println("Participant " + i + " - " + animalsArray[i].name +
                        ". Run distance: " + animalsArray[i].run(marathonArray[m].runDistance)
                        + ". Swim distance:  " + animalsArray[i].swim(marathonArray[m].swimDistance)
                        + ". Jump high: " + animalsArray[i].jump(marathonArray[m].jumpHigh));
            }
        }
    }



}
