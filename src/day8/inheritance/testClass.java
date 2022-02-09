package day8.inheritance;

public class testClass {
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.run("animal");
        Dog dog=new Dog();
        dog.run("Dog");
        Tiger tiger=new Tiger();
        tiger.run("Tiger");
        System.out.println(dog.ear);
        System.out.println(dog.legs);
        System.out.println(tiger.ear);
        System.out.println(tiger.legs);
    }
}
