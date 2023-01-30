package lab_rob_2;


public class Main {

    public static void main(String[] args) {
        Place place = new Place(10,8,10);
        System.out.println("Кількість місць= " + place.showNumberOfSeats());
        place.square(3);
// перевизначений метод
        System.out.println("Кількість місць= " + place.showNumberOfSeats(8));
// перевизначений конструктор
        Place place1 = new Place();
        Place place2 = new Place(10);
        Place place3 = new Place(10,6);

        System.out.println();

        Teacher teacher = new Teacher("Оксана","Марченко","C2");
        System.out.println("Ім'я та прізвище: "+teacher.pib());
        teacher.showLevelOfEnglish();
// перевизначений метод
        teacher.showLevelOfEnglish(5);

        System.out.println();

        Groups groups = new Groups(8,2,3);
        System.out.println("Кількість груп= " + groups.showGroups());
        groups.sum();
// перевизначений метод
        System.out.println("Кількість груп= " + groups.showGroups(5,8));
//метод, який в якості параметру прийматиме екземпляр того ж класу, де створено метод
        System.out.println("Кількість молодших груп= "+ groups.returnYoungChildren(groups));
    }


}