package com.Inheritance;

import java.util.Objects;

public class Person {

    //common properties of all 3 types
    private String name;
    private int strength;
    private int health;
    private int stamina;
    private int speed;
    private int attackPower;

    //common abilities of all 3 types
    private int run;
    private int attack;
    private int heal;
    private int decreaseHealth;
    private int increaseStamina;
    private int decreaseStamina;

    public Person(String name, int strength, int health, int stamina, int speed, int attackPower, int run, int attack, int heal, int decreaseHealth, int increaseStamina, int decreaseStamina) {
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
        this.run = run;
        this.attack = attack;
        this.heal = heal;
        this.decreaseHealth = decreaseHealth;
        this.increaseStamina = increaseStamina;
        this.decreaseStamina = decreaseStamina;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHeal() {
        return heal;
    }

    public void setHeal(int heal) {
        this.heal = heal;
    }

    public int getDecreaseHealth() {
        return decreaseHealth;
    }

    public void setDecreaseHealth(int decreaseHealth) {
        this.decreaseHealth = decreaseHealth;
    }

    public int getIncreaseStamina() {
        return increaseStamina;
    }

    public void setIncreaseStamina(int increaseStamina) {
        this.increaseStamina = increaseStamina;
    }

    public int getDecreaseStamina() {
        return decreaseStamina;
    }

    public void setDecreaseStamina(int decreaseStamina) {
        this.decreaseStamina = decreaseStamina;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return strength == person.strength && health == person.health && stamina == person.stamina && speed == person.speed && attackPower == person.attackPower && run == person.run && attack == person.attack && heal == person.heal && decreaseHealth == person.decreaseHealth && increaseStamina == person.increaseStamina && decreaseStamina == person.decreaseStamina && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, strength, health, stamina, speed, attackPower, run, attack, heal, decreaseHealth, increaseStamina, decreaseStamina);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", health=" + health +
                ", stamina=" + stamina +
                ", speed=" + speed +
                ", attackPower=" + attackPower +
                ", run=" + run +
                ", attack=" + attack +
                ", heal=" + heal +
                ", decreaseHealth=" + decreaseHealth +
                ", increaseStamina=" + increaseStamina +
                ", decreaseStamina=" + decreaseStamina +
                '}';
    }
}
