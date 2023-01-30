package lab_rob_2;

public class Place {
    int length;
    int width;
    int numberOfSeats;

    public Place(int length, int width, int numberOfSeats) {
        this.length = length;
        this.width = width;
        this.numberOfSeats = numberOfSeats;
    }

    public Place() {
    }

    public Place(int length) {
        this.length = length;
    }

    public Place(int length, int width) {
        this.length = length;
        this.width = width;
    }

    void square(int height){
        System.out.println("Площа приміщення= "+ length*width*height);
    }
    int showNumberOfSeats(){
        return numberOfSeats;
    }
    // перевизначений метод
    double showNumberOfSeats(double numberOfSeats){
        return numberOfSeats;
    }
    //метод посилкового типу
    Place placeUp(int i){
        Place place = new Place(length+i,width+i,numberOfSeats+i);
        return place;
    }
}
