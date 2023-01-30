package lab_rob_5;


class Place extends Teacher {
   private int length;
   private int width;
   private int numberOfSeats;

     Place(int length, int width, int numberOfSeats) {
         super("Оксана","Марченко","C2");
         this.length = length;
        this.width = width;
        this.numberOfSeats = numberOfSeats;
    }

   private void square(int height){
        System.out.println("Площа приміщення= "+ length*width*height);
    }
   public void square1(){          //метод, що приймає на вхід та повертає результат роботи закритого методу
         square(6);
     }


    private int showNumberOfSeats(){
       return numberOfSeats;
    }
    public int showNumberOfSeats1(){ //метод, що приймає на вхід та повертає результат роботи закритого методу
       return showNumberOfSeats();
    }

    // перевизначений метод
    private double showNumberOfSeats(double numberOfSeats){
        return numberOfSeats;
    }
    public double showNumberOfSeats2(){  //метод, що приймає на вхід та повертає результат роботи закритого методу
         return showNumberOfSeats(8.0);
    }
    //метод посилкового типу
    Place placeUp(int i){
        Place place = new Place(length+i,width+i,numberOfSeats+i);
        return place;
    }

    // метод із довільною логікою, який в якості параметрів або внутрішніх  змінних використовує мінімум одну змінну екземплярів
    //інших двох класів
//     Teacher teacher  = new Teacher("Оксана","Марченко","C2");
//     Groups groups  = new Groups(8,2,3);
     private void show(){
         System.out.println("Ім'я викладача: "+ super.getName() + "; Кількість студентів в групі: " + super.getNumberOfStudentsInGroup());
     }
     public void returnLength(){
         System.out.println("Двжина приміщення: " + length);
         System.out.println(pib1());
     }
     @Override
     public void method(){
         System.out.println("Інформація про школу");
         show();
     }
     public void show1(){         //метод, що приймає на вхід та повертає результат роботи закритого методу
         show();
     }

     public int getLength() {
         return length;
     }

     public void setLength(int length) {
         this.length = length;
     }

     public int getWidth() {
         return width;
     }

     public void setWidth(int width) {
         this.width = width;
     }

     public int getNumberOfSeats() {
         return numberOfSeats;
     }

     public void setNumberOfSeats(int numberOfSeats) {
         int i = numberOfSeats * 2;
         this.numberOfSeats = numberOfSeats;
     }
 }