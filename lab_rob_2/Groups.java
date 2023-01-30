package lab_rob_2;

public class Groups {
    int numberOfStudentsInGroup;
    int numberOfYoungerGroups;
    int numberOfOlderGroups;

    public Groups( int numberOfStudentsInGroup, int numberOfYoungerGroups, int numberOfOlderGroups) {
        this.numberOfStudentsInGroup = numberOfStudentsInGroup;
        this.numberOfYoungerGroups = numberOfYoungerGroups;
        this.numberOfOlderGroups = numberOfOlderGroups;
    }

    public Groups(int numberOfStudentsInGroup) {
        this.numberOfStudentsInGroup = numberOfStudentsInGroup;
    }


    void sum(){
        int i =  (numberOfYoungerGroups+numberOfOlderGroups) * numberOfStudentsInGroup;
        System.out.println("Загальна кількість студентів= "+i);
    }
    int showGroups(){
        return numberOfYoungerGroups+numberOfOlderGroups;
    }
    // перевизначений метод
    double showGroups(double numberOfYoungerGroups, double numberOfOlderGroups) {
        return numberOfYoungerGroups + numberOfOlderGroups;
    }
 //метод, який в якості параметру прийматиме екземпляр того ж класу, де створено метод
    int returnYoungChildren(Groups groups){
        sum();
        return numberOfYoungerGroups;
    }

}
