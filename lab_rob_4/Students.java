package lab_rob_4;

public class Students extends Groups{
    public Students(int numberOfStudentsInGroup, int numberOfYoungerGroups, int numberOfOlderGroups) {
        super(numberOfStudentsInGroup, numberOfYoungerGroups, numberOfOlderGroups);
    }

    void students(){
        sum1();
        System.out.println("Кількість студентів в одній групі: " + getNumberOfStudentsInGroup());
    }
    void test(){
        Student student = new Student();
        student.showAge();
    }
    class Student{
        int age = 12;
        void showAge(){
            students();
            System.out.println("Вік студента: " + age);
        }
    }
}
