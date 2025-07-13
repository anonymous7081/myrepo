import java.util.Scanner;
public class calcolator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean s;
    do{
    System.out.print("enter num1 :");
    int num1 = sc.nextInt();
    System.out.print("enter num2 :");
    int num2 = sc.nextInt();
    System.out.print("enter Symbol :");
    String sym = sc.next();
        switch(sym){
            case "+": System.out.println(num1+num2);
            break;
            case "/": System.out.println(num1/num2);
            break;
            case "*": System.out.println(num1*num2);
            break;
            case "-": System.out.println(num1-num2);
            break;
            default : System.out.println("wrong symbol");
            break;
        }
        System.out.println("do  u want continue ? : ");
         s = sc.nextBoolean();
    }while(s);
    sc.close();
    }
}
