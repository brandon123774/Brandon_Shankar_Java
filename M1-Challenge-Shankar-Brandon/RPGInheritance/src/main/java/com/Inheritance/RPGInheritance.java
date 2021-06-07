package com.Inheritance;

public class RPGInheritance {
    public static void main(String[] args) {
        Farmer mcDonald = new Farmer("mcDonald", 75,100, 75, 10, 1, 10,5,10,10,20, 10,50,50 );
        Constable connie = new Constable("connie", 60, 100, 60, 20, 5, 5, 5, 10, 20, 5,10, 60,40);
        Warrior wario = new Warrior("wario",75,100,100,50,10,25,50,20,10,30,10,50,20);

        mcDonald.farm();
        connie.govern();
        wario.fight();

    }
}
