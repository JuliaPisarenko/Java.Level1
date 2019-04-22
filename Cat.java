package ru.geekbrains.java.level1.lesson7;

public class Cat {
    private String name;
    private int appetite;
    private int satisfied;

    public Cat(String name, int appetite, int satisfied) {
        this.name = name;
        this.appetite = appetite;
        this.satisfied = satisfied;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public int getSatisfied() {
        return satisfied;
    }

    public void setSatisfied(int satisfied) {
        this.satisfied = satisfied;
    }



    public void eat (Plate plate){
        plate.decreaseFood(appetite);
    }

    public void satisfiedCat(Cat cat){
       if (cat.getSatisfied() + cat.getAppetite() == cat.getAppetite())
           System.out.println(cat.getName() + " satisfied");
    }

}
