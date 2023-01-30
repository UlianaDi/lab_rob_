package lab_rob_2;

public class Teacher {
    String name;
    String surname;
    String levelOfEnglish;


    public Teacher(String name, String surname, String levelOfEnglish) {
        this.name = name;
        this.surname = surname;
        this.levelOfEnglish = levelOfEnglish;
    }
    void showLevelOfEnglish(){
        System.out.println("Рівень англійської викладача= "+ levelOfEnglish);
    }

    String pib(){
        return name+" "+surname;
    }
    // перевизначений метод
    void showLevelOfEnglish(int yearsOfTeaching){
        System.out.println("Рівень англійської викладача= "+ levelOfEnglish + "  та кількість років викладання= " + yearsOfTeaching);
    }
}