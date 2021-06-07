package com.company;

public class App {

    public static void main(String[] args) {

        IceCreamSales sale = new IceCreamSales(2, 7.99,"Tay");
        IceCreamFactory factory = new IceCreamFactory(5000000,50,true);

        sale.sales();
        factory.manufacture();
    }
}
