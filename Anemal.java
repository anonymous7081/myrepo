public class Anemal {
     int age;
    String color;
    /* 
    public static void main(String[] args) {
        Anemal buzo = new Anemal();
        buzo.age = 10;
        buzo.color = "Black";
        System.out.println(buzo.age + " " + buzo.color);
    } */
   public void initObj(String c, int a){
        color = c;
        age = a;
   }
   public void display(){
    System.err.println(color+" "+ age);
   }
   public static void main(String[] args) {
     Anemal buzu = new Anemal();
     buzu.initObj("black", 10);
     buzu.display();
   }
}
