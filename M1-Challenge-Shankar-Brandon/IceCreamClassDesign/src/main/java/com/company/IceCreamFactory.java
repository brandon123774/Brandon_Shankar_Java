package com.company;

import java.util.Objects;

public class IceCreamFactory {

    private float lbsOfIceCreamMade;
    private int numberOfEmployees;
    private boolean employeePresent;

    public void manufacture ()    {
        System.out.println("Today, " + lbsOfIceCreamMade + "pounds of ice cream was made and " + numberOfEmployees + " employees were at work.");
    }

    public IceCreamFactory(float lbsOfIceCreamMade, int numberOfEmployees, boolean employeePresent) {
        this.lbsOfIceCreamMade = lbsOfIceCreamMade;
        this.numberOfEmployees = numberOfEmployees;
        this.employeePresent = employeePresent;
    }

    public float getLbsOfIceCreamMade() {
        return lbsOfIceCreamMade;
    }

    public void setLbsOfIceCreamMade(float lbsOfIceCreamMade) {
        this.lbsOfIceCreamMade = lbsOfIceCreamMade;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public boolean isEmployeePresent() {
        return employeePresent;
    }

    public void setEmployeePresent(boolean employeePresent) {
        this.employeePresent = employeePresent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCreamFactory that = (IceCreamFactory) o;
        return Float.compare(that.lbsOfIceCreamMade, lbsOfIceCreamMade) == 0 && numberOfEmployees == that.numberOfEmployees && employeePresent == that.employeePresent;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lbsOfIceCreamMade, numberOfEmployees, employeePresent);
    }

    @Override
    public String toString() {
        return "IceCreamFactory{" +
                "lbsOfIceCreamMade=" + lbsOfIceCreamMade +
                ", numberOfEmployees=" + numberOfEmployees +
                ", employeePresent=" + employeePresent +
                '}';
    }
}
