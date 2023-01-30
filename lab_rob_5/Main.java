package lab_rob_5;



public class Main {

    public static void main(String[] args) {
        Place place = new Place(10,8,10);
//        System.out.println("Кількість місць= " + place.showNumberOfSeats());
        place.square1();
// перевизначений метод
        System.out.println("Кількість місць= " + place.showNumberOfSeats2());
// метод із довільною логікою, який в якості параметрів або внутрішніх  змінних використовує мінімум одну змінну екземплярів
//інших двох класів
        place.show1();
        place.returnLength();
        place.method();



        System.out.println();

       Teacher teacher = new Teacher("Оксана","Марченко","C2");
        System.out.println("Ім'я та прізвище: "+teacher.pib1());
        teacher.showLevelOfEnglish1();
// перевизначений метод
        teacher.showLevelOfEnglish2();
        teacher.showName();
        teacher.method();

        System.out.println();

        Groups groups = new Groups(8,2,3);
        System.out.println("Кількість груп= " + groups.showGroups1());
        groups.sum1();
// перевизначений метод
        System.out.println("Кількість груп= " + groups.showGroups2());
//метод, який в якості параметру прийматиме екземпляр того ж класу, де створено метод
        System.out.println("Кількість молодших груп= "+ groups.returnYoungChildren(groups));
        groups.method();
        groups.method(2);

        System.out.println();

//Статичний клас
        SecondTeacher.about();
        SecondTeacher.firstM(2);

        System.out.println();

//Finale клас
        TraineeTeacher traineeTeacher = new TraineeTeacher();
        traineeTeacher.aboutTrainee();
        traineeTeacher.aboutTrainee(2,"B2");

        System.out.println();

        Students students = new Students(8,2,3);
        students.test();

        System.out.println();

        Dispatch dispatch = new Dispatch();
        dispatch.choice(1);
        dispatch.choice(2);
        dispatch.choice(3);



    }


}