package day8.inheritance;

public class B extends A{
    int j=20;
    public void m2()
    {
        System.out.println("inside b-> m2()");
    }

    public static void main(String[] args) {

        B b=new B();
        System.out.println(b.i);
        System.out.println(b.j);
        b.m1();
        b.m2();
    }
}
