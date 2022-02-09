package day6.statictest;

public class TestA {
    public static void main(String[] args) {
        A a1=new A();
        a1.m1();
        System.out.println(a1.i);
        A a2=new A();
        a2.m1();
        System.out.println(a2.i);
        System.out.println(A.j);
        A.m2();
    }
}
