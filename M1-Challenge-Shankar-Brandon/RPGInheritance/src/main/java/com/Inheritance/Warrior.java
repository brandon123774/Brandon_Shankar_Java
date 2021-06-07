package com.Inheritance;

import java.util.Objects;

public class Warrior extends Person {

    //props diff
    //shieldStrength
    private int shieldStrength;

    //abilities diff
    //decreaseShieldStrength
    private int decreaseShieldStrength;

    public void fight()  {
        System.out.println("I am a warrior and I have " + shieldStrength + " shield strength which allows me to take heavy blows in fights.");
    }

    public Warrior(String name, int strength, int health, int stamina, int speed, int attackPower, int run, int attack, int heal, int decreaseHealth, int increaseStamina, int decreaseStamina, int shieldStrength, int decreaseShieldStrength) {
        super(name, strength, health, stamina, speed, attackPower, run, attack, heal, decreaseHealth, increaseStamina, decreaseStamina);
        this.shieldStrength = shieldStrength;
        this.decreaseShieldStrength = decreaseShieldStrength;
    }

    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }

    public int getDecreaseShieldStrength() {
        return decreaseShieldStrength;
    }

    public void setDecreaseShieldStrength(int decreaseShieldStrength) {
        this.decreaseShieldStrength = decreaseShieldStrength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Warrior warrior = (Warrior) o;
        return shieldStrength == warrior.shieldStrength && decreaseShieldStrength == warrior.decreaseShieldStrength;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), shieldStrength, decreaseShieldStrength);
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "shieldStrength=" + shieldStrength +
                ", decreaseShieldStrength=" + decreaseShieldStrength +
                '}';
    }
}
