package ru.geekbrains.java.level1.lesson7;

public class MainCatEatPlate {
    public static void main(String[] args) {
        Cat [] catArray = {
                new Cat ("Barsik", 20, 0),
                new Cat ("Murzik", 25, 0),
                new Cat ("Siam", 35, 0),
                new Cat ("Puhh", 40, 0)};

        Plate plate = new Plate(60, 50);

        for (int feedTime = 1; feedTime <= 3; feedTime++) {

            System.out.println("TIME TO EAT " + feedTime);
            System.out.println();

            for (int i = 0; i <catArray.length ; i++) {

                if (plate.getValueFood() < catArray[i].getAppetite()){
                    System.out.println("Not enough food! The cat " + catArray[i].getName() + " is hugry! Fill the plate!");
                    plate.fillThePlate();
                    i--;

                }  else  if (plate.getValueFood() >= catArray[i].getAppetite()){
                    catArray[i].eat(plate);
                    catArray[i].satisfiedCat(catArray[i]);
                }
                plate.infoPlate();
                System.out.println();
            }
        }
    }
}
