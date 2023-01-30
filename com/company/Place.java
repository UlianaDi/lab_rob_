package com.company;

public class Place {
    int length;
    int width;
    int numberOfSeats;

    public Place(int length, int width, int numberOfSeats) {
        this.length = length;
        this.width = width;
        this.numberOfSeats = numberOfSeats;
    }

    void square(int height){
        System.out.println("Площа приміщення= "+ length*width*height);
    }
    int showNumberOfSeats(){
        return numberOfSeats;
    }
}
