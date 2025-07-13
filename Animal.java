class Animal {
    public void eat(){
        System.out.println("I am eating");
    }
    public void run(){
        System.out.println("I am running");
    }
    public static void main(String[] args) {
        System.out.println("1");
        Animal dog = new Animal();
        dog.eat();
        Animal cat = new Animal();
        cat.run(); 
        HelperClass hc = new HelperClass();
        System.out.println(hc.greet());
        AnotherClass ac = new AnotherClass();
        ac.printMessage();
    }

}
class HelperClass {
    public String greet() {
        return "Hello from HelperClass!";
    }
}

class AnotherClass {
    public void printMessage() {
        System.out.println("This is AnotherClass.");
    }
}
