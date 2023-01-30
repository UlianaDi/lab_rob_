package lab_rob_5;

public class SecondTeacher {

    static String name = "Ірина";
    static int age;

    static {
        age = 23;
    }

    static void about(){
        System.out.println("Вік: " + age);
        System.out.println("Імя: " + name);
    }

    static void firstM(int e){
        System.out.println("Вся інформація про вчителя: ");
        about();
        System.out.println("Досвід: " + e + " роки");
    }


}
