public class Employee {
    String s;
    int id;
    Employee(String s , int id){
        this.s = s;
        this.id = id;
    }
    public static void main(String[] args) {
        Employee e1 = new Employee("Aditya" ,7791);
        Employee e2 = new Employee("Tanu", 6484);
        System.err.println(e1.s+" "+ e1.id);
        System.out.println(e2.s+ " " + e2.id);
    }
}
