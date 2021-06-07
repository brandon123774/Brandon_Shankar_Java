package com.company;

import java.util.Objects;

public class IceCreamSales {

    private int numberPurchase;
    private double totalCost;
    private String orderName;

    public void sales() {
        System.out.println("Customer bought " + numberPurchase + " of ice cream and the total cost was " + totalCost + " and the name on the order was " + orderName + ".");
    }

    public IceCreamSales(int numberPurchase, double totalCost, String orderName) {
        this.numberPurchase = numberPurchase;
        this.totalCost = totalCost;
        this.orderName = orderName;
    }

    public int getNumberPurchase() {
        return numberPurchase;
    }

    public void setNumberPurchase(int numberPurchase) {
        this.numberPurchase = numberPurchase;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCreamSales that = (IceCreamSales) o;
        return numberPurchase == that.numberPurchase && Double.compare(that.totalCost, totalCost) == 0 && Objects.equals(orderName, that.orderName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberPurchase, totalCost, orderName);
    }

    @Override
    public String toString() {
        return "IceCreamSales{" +
                "numberPurchase=" + numberPurchase +
                ", totalCost=" + totalCost +
                ", orderName='" + orderName + '\'' +
                '}';
    }
}
