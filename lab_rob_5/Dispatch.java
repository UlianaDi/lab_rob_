package lab_rob_5;

public class Dispatch {
    Groups groups = new Groups(8,2,3);
    Teacher teacher = new Teacher("Оксана","Марченко","C2");
    Place place = new Place(10,8,10);
    Groups g;

    void choice(int j){
        if (j == 1){
            g = groups;
            g.method();
        } else if (j == 2){
            g = teacher;
            g.method();
        } else if (j == 3) {
            g = place;
            g.method();
        } else {
            System.out.println("Немає такого!!!!!");
        }
    }
}
