package lab_rob_3;

public class TraineeTeacher {
    final int age = 19;
    final String name = "Олена";
    final String mark = "Відмінно";

    void aboutTrainee(){
        System.out.println("Імя: " + name + ", вік: " + age + ", оцінки в університеті: " + mark);
    }

    void aboutTrainee(final int c, final String level){
        System.out.println("Кількість пройдених курсів: " + c);
        System.out.println("Рівень англійської: " + level);
    }

}
