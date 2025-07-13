 class Tust {
    Object show(){
        System.out.println("1");
        return null;
    }
}
class Xyz extends Tust{
    public String show(){
        System.out.println("2");
        return null;
    }

    public static void main(String[] args) {
        Tust t = new Tust();
        t.show();
        Xyz x = new Xyz();
        x.show();
    }
}
