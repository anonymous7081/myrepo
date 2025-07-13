public class Teast {
    void show(){
        System.out.println("1");
    }
    void show(int a){
        System.out.println("2");
    }

    public static void main(String[] args) {
        Teast t = new Teast();
        t.show(4);
        //System.out.println();
        t.show();
    }
}
