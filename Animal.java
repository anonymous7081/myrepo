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
        hc.greet();
        AnotherClass ac = new AnotherClass();
        ac.printMessage();
        ac.eat();
        hc.run();
    }

}
class HelperClass extends Animal{
    public void greet() {
        System.out.println("Hello from HelperClass!");
    }
}

class AnotherClass extends Animal{
    public void printMessage() {
        System.out.println("This is AnotherClass.");
    }
}
