package com.company;

public class Main {

    public static void main(String[] args) {
            Place place = new Place(10,8,10);
            System.out.println("Кількість місць= " + place.showNumberOfSeats());
            place.square(3);

            System.out.println();

            Teacher teacher = new Teacher("Оксана","Марченко","C2");
            System.out.println("Ім'я та прізвище: "+teacher.pib());
            teacher.showLevelOfEnglish();

            System.out.println();

            Groups groups = new Groups(8,2,3);
            System.out.println("Кількість груп= " + groups.showGroups());
            groups.sum();
        }
    }