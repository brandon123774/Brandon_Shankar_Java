package com.company;

public class ConverterSwitch implements Converter {

    public String convertMonth(int monthNumber) {

        switch (monthNumber) {
            case 1:
                convertMonth(1);
                break;
            case 2:
                convertMonth(2);
                break;
            case 3:
                convertMonth(3);
                break;
            case 4:
                convertMonth(4);
                break;
            case 5:
                convertMonth(5);
                break;
            case 6:
                convertMonth(6);
                break;
            case 7:
                convertMonth(7);
                break;
            case 8:
                convertMonth(8);
                break;
            case 9:
                convertMonth(9);
                break;
            case 10:
                convertMonth(10);
                break;
            case 11:
                convertMonth(11);
                break;
            case 12:
                convertMonth(12);
                break;
            default:
        }
        return "Error, please pick a month.";
    }


    public String convertDay(int dayNumber) {

        switch (dayNumber) {
            case 1:
                dayNumber(1);
                break;
            case 2:
                dayNumber(2);
                break;
            case 3:
                dayNumber(3);
                break;
            case 4:
                dayNumber(4);
                break;
            case 5:
                dayNumber(5);
                break;
            case 6:
                dayNumber(6);
                break;
            case 7:
                dayNumber(7);
                break;
            case 8:
                dayNumber(8);
            default:
                break;
        }
        return "Error, please pick a week day.";

    }
}

