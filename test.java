public class test {
    /*int n;
    String s;
    public static void main(String[] args) {
        test t = new test();
        System.out.println(t.n+ " "+t.s);
    } */
    /* test(){
        System.out.println("this is default construstor");
    }
    public static void main(String[] args) {
        test t = new test();
    } */
   test(int a){
        System.out.println(" this is a parameterized constructer");
   }
   public static void main(String[] args) {
    test t = new test(10);
    
   }
}
