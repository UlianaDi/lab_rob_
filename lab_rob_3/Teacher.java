package lab_rob_3;

 class Teacher {
     private String name;
     private String surname;
     private String levelOfEnglish;


     Teacher(String name, String surname, String levelOfEnglish) {
        this.name = name;
        this.surname = surname;
        this.levelOfEnglish = levelOfEnglish;
    }

   private void showLevelOfEnglish(){
        System.out.println("Рівень англійської викладача= "+ levelOfEnglish);
    }
   public void showLevelOfEnglish1(){    //метод, що приймає на вхід та повертає результат роботи закритого методу
       showLevelOfEnglish();
   }

   private String pib(){
        return name+" "+surname;
    }
   public  String pib1(){               //метод, що приймає на вхід та повертає результат роботи закритого методу
         return pib();
   }

    // перевизначений метод
    private void showLevelOfEnglish(int yearsOfTeaching){
        System.out.println("Рівень англійської викладача= "+ levelOfEnglish + "  та кількість років викладання= " + yearsOfTeaching);
    }
    public void showLevelOfEnglish2() { //метод, що приймає на вхід та повертає результат роботи закритого методу
        showLevelOfEnglish();
    }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getSurname() {
         return surname;
     }

     public void setSurname(String surname) {
         this.surname = surname;
     }

     public String getLevelOfEnglish() {
         return levelOfEnglish;
     }

     public void setLevelOfEnglish(String levelOfEnglish) {
         this.levelOfEnglish = levelOfEnglish;
     }
 }