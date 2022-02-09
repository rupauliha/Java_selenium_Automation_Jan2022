package day8.inheritance.constructer_inheritance;

public class Parent {
    public Parent()
    {
        System.out.println("In Parent default const");
    }
    public Parent(int i)
    {
        System.out.println("In 1 arg const");
    }
    public Parent(int i, String j)
    {
        System.out.println("In 2 arg const");
    }
    public void m2()
    {
        System.out.println("Parent m2()");
    }



}
