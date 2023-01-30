package com.company;

public class Groups {
    int numberOfStudentsInGroup;
    int numberOfYoungerGroups;
    int numberOfOlderGroups;

    public Groups( int numberOfStudentsInGroup, int numberOfYoungerGroups, int numberOfOlderGroups) {
        this.numberOfStudentsInGroup = numberOfStudentsInGroup;
        this.numberOfYoungerGroups = numberOfYoungerGroups;
        this.numberOfOlderGroups = numberOfOlderGroups;
    }
    void sum(){
        int i =  (numberOfYoungerGroups+numberOfOlderGroups) * numberOfStudentsInGroup;
        System.out.println("Загальна кількість студентів= "+i);
    }
    int showGroups(){
        return numberOfYoungerGroups+numberOfOlderGroups;
    }

}
