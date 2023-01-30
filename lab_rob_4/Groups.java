package lab_rob_4;

public class Groups {
    private int numberOfStudentsInGroup;
    private int numberOfYoungerGroups;
    private int numberOfOlderGroups;

     Groups(int numberOfStudentsInGroup, int numberOfYoungerGroups, int numberOfOlderGroups) {
        this.numberOfStudentsInGroup = numberOfStudentsInGroup;
        this.numberOfYoungerGroups = numberOfYoungerGroups;
        this.numberOfOlderGroups = numberOfOlderGroups;
    }

     Groups(int numberOfStudentsInGroup) {
        this.numberOfStudentsInGroup = numberOfStudentsInGroup;
    }


    private void sum(){
        int i =  (numberOfYoungerGroups+numberOfOlderGroups) * numberOfStudentsInGroup;
        System.out.println("Загальна кількість студентів= "+i);
    }
    public void sum1(){  //метод, що приймає на вхід та повертає результат роботи закритого методу
         sum();
    }

    private int showGroups(){
        return numberOfYoungerGroups+numberOfOlderGroups;
    }
    public int showGroups1(){   //метод, що приймає на вхід та повертає результат роботи закритого методу
         return showGroups();
    }

    // перевизначений метод
    private double showGroups(double numberOfYoungerGroups, double numberOfOlderGroups) {
        return numberOfYoungerGroups + numberOfOlderGroups;
    }
    public double showGroups2(){    //метод, що приймає на вхід та повертає результат роботи закритого методу
         return showGroups(12,8);
    }

    //метод, який в якості параметру прийматиме екземпляр того ж класу, де створено метод
    int returnYoungChildren(Groups groups){
        sum();
        return numberOfYoungerGroups;
    }

    public int getNumberOfStudentsInGroup() {
        return numberOfStudentsInGroup;
    }

    public void setNumberOfStudentsInGroup(int numberOfStudentsInGroup) {
        this.numberOfStudentsInGroup = numberOfStudentsInGroup;
    }

    public int getNumberOfYoungerGroups() {
        return numberOfYoungerGroups;
    }

    public void setNumberOfYoungerGroups(int numberOfYoungerGroups) {
        this.numberOfYoungerGroups = numberOfYoungerGroups;
    }

    public int getNumberOfOlderGroups() {
        return numberOfOlderGroups;
    }

    public void setNumberOfOlderGroups(int numberOfOlderGroups) {
         int n = numberOfOlderGroups * 2;
        this.numberOfOlderGroups = numberOfOlderGroups;
    }
}