package com.company;

public class ConverterApplication {
    public static void main(String[] args) {
        Converter converterIf = new ConverterIf();
        Converter converterSwitch = new ConverterSwitch();

        //convert month and day with if statements
        String monthIf = converterIf.convertMonth(12);
        String dayIf = converterIf.convertDay(1);
        System.out.println("ConverterIf input:12" + monthIf);
        System.out.println("ConverterIf input: 1" + dayIf);

        //convert month and dat with switch/break statements
        String monthSwitch = converterSwitch.convertMonth(5);
        String daySwitch = converterSwitch.convertDay(5);
        System.out.println("ConverterSwitch input: 5" + monthSwitch);
        System.out.println("ConverterSwitch input: 5" + daySwitch);
    }
}
