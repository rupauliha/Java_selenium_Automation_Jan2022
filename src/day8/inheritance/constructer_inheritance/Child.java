package day8.inheritance.constructer_inheritance;

public class Child extends Parent {
    public Child()
    {
        System.out.println("In default Child const");
    }
    public Child (int i)
    {
        System.out.println("In 1 arg Child const");
    }
    public Child(int i, String j)
    {
        System.out.println("In 2 arg Child const");
    }
    public void m1()
    {
        System.out.println("Child m1()");
    }

    public static void main(String[] args) {
        Child c1=new Child();
        c1.m1();
        c1.m2();
    }
}
