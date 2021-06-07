package com.Inheritance;

import java.util.Objects;

public class Farmer extends Person {

    //abilities specific for farmer
    private int plow;
    private int harvest;

    //person covers all props

    public void farm()  {
        System.out.println("I am a farmer and I have " + plow + " plow power and " + harvest + " harvest power.");
    }

    public Farmer(String name, int strength, int health, int stamina, int speed, int attackPower, int run, int attack, int heal, int decreaseHealth, int increaseStamina, int decreaseStamina, int plow, int harvest) {
        super(name, strength, health, stamina, speed, attackPower, run, attack, heal, decreaseHealth, increaseStamina, decreaseStamina);
        this.plow = plow;
        this.harvest = harvest;
    }

    public int getPlow() {
        return plow;
    }

    public void setPlow(int plow) {
        this.plow = plow;
    }

    public int getHarvest() {
        return harvest;
    }

    public void setHarvest(int harvest) {
        this.harvest = harvest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Farmer farmer = (Farmer) o;
        return plow == farmer.plow && harvest == farmer.harvest;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), plow, harvest);
    }

    @Override
    public String toString() {
        return "Farmer{" +
                "plow=" + plow +
                ", harvest=" + harvest +
                '}';
    }
}
