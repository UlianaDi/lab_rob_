package lab_rob_6;

public class Teacher implements TeacherDemo{
    String levelOfEnglish;
    int numberOfStudentsInGroup;
    int numberOfYoungerGroups;
    int numberOfOlderGroups;

    public Teacher(String levelOfEnglish, int numberOfStudentsInGroup, int numberOfYoungerGroups, int numberOfOlderGroups) {
        this.levelOfEnglish = levelOfEnglish;
        this.numberOfStudentsInGroup = numberOfStudentsInGroup;
        this.numberOfYoungerGroups = numberOfYoungerGroups;
        this.numberOfOlderGroups = numberOfOlderGroups;
    }

    public void showLevelOfEnglish(){
        System.out.println("Рівень англійської викладача= "+ levelOfEnglish);
    }

    public void sum() {
        int i =  (numberOfYoungerGroups+numberOfOlderGroups) * numberOfStudentsInGroup;
        System.out.println("Загальна кількість студентів= "+i);
    }

    public interface New {
        void aboutTrainee(int c, String level);
    }
}
