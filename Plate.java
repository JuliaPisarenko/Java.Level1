package ru.geekbrains.java.level1.lesson7;

public class Plate {
    private int valueBowl;
    private int valueFood;

    public Plate(int valueBowl,int valueFood) {
        this.valueBowl = valueBowl;
        this.valueFood = valueFood;
    }
    public int getValueBowl() {
        return valueBowl;
    }

    public void setValueBowl(int valueBowl) {
        this.valueBowl = valueBowl;
    }

    public int getValueFood() {
        return valueFood;
    }

    public void setValueFood(int valueFood) {
        this.valueFood = valueFood;
    }




    public void infoPlate(){
        System.out.println("Left food " + valueFood + " gram.");
    }

    public void fillThePlate(){
        valueFood = valueFood + valueBowl - valueFood;
    }

    public void decreaseFood (int consumption){
        valueFood -= consumption;
    }
}
