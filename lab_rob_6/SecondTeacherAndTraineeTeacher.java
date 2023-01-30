package lab_rob_6;

public class SecondTeacherAndTraineeTeacher implements TraineeTeacherD, Teacher.New{
    String name = "Ірина";
    int age = 25;

    int age1 = 19;
    String name1 = "Олена";
    String mark = "Відмінно";

    public void about(){
        System.out.println("Вік: " + age);
        System.out.println("Імя: " + name);
    }

    public void aboutTrainee(){
        System.out.println("Імя: " + name + ", вік: " + age + ", оцінки в університеті: " + mark);
    }
    public void aboutTrainee(int c, String level){
        System.out.println("Кількість пройдених курсів: " + c);
        System.out.println("Рівень англійської: " + level);
    }




}
