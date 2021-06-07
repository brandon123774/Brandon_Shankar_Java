package com.Inheritance;

import java.util.Objects;

public class Constable extends Person {
    //props
    //jurisdiction

    private int jurisdiction;

    //abilities diff
    //arrest

    private int arrest;

    public void govern()  {
        System.out.println("I am a constable and I have " + jurisdiction + " power of jurisdiction and " + arrest + " power to arrest.");
    }
    public Constable(String name, int strength, int health, int stamina, int speed, int attackPower, int run, int attack, int heal, int decreaseHealth, int increaseStamina, int decreaseStamina, int jurisdiction, int arrest) {
        super(name, strength, health, stamina, speed, attackPower, run, attack, heal, decreaseHealth, increaseStamina, decreaseStamina);
        this.jurisdiction = jurisdiction;
        this.arrest = arrest;
    }

    public int getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(int jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public int getArrest() {
        return arrest;
    }

    public void setArrest(int arrest) {
        this.arrest = arrest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Constable constable = (Constable) o;
        return jurisdiction == constable.jurisdiction && arrest == constable.arrest;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), jurisdiction, arrest);
    }

    @Override
    public String toString() {
        return "Constable{" +
                "jurisdiction=" + jurisdiction +
                ", arrest=" + arrest +
                '}';
    }
}
