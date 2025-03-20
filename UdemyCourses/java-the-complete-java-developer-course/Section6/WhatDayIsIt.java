public class WhatDayIsIt {

    public static void main(String args[]){

        int dayOfWeek = 5;

        String day =switch(dayOfWeek){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "No day I'm aware of";
        };

        System.out.println(day);
    }
}