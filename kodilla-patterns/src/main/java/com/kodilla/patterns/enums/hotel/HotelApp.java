package com.kodilla.patterns.enums.hotel;

public class HotelApp {

    public static void main(String[] args) {
        System.out.println("Accommodation prices:");
        System.out.println("1. Single Bed rooms");
        System.out.println("   - low season:" + Season.LOW.getSingleBedPrices());
        System.out.println("   - high season:" + Season.HIGH.getSingleBedPrices());
        System.out.println("   - holiday season:" + Season.HOLIDAY.getDoubleBedPrices());
        System.out.println("2. Double Bed rooms");
        System.out.println("   - low season:" + Season.LOW.getDoubleBedPrices());
        System.out.println("   - high season:" + Season.HIGH.getDoubleBedPrices());
        System.out.println("   - holiday season:" + Season.HOLIDAY.getDoubleBedPrices());

        Season season = Season.HOLIDAY;

        System.out.println(season);
    }

}
