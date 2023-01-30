package lab_rob_6;

public class Main {
    public static void main(String[] args) {
        Groups groups = new Groups("C2", 8, 4, 3);
        groups.sum();
        groups.showLevelOfEnglish();

        System.out.println();

        SecondTeacherAndTraineeTeacher secondTeacherAndTraineeTeacher = new SecondTeacherAndTraineeTeacher();
        secondTeacherAndTraineeTeacher.aboutTrainee();
        secondTeacherAndTraineeTeacher.about();
        secondTeacherAndTraineeTeacher.aboutTrainee(2,"B2");

        System.out.println();
    }
}
