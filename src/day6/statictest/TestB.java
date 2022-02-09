package day6.statictest;

public class TestB {
    public static void main(String[] args) {
        A b1=new A();
        b1.m1();
        System.out.println(b1.i);
        System.out.println(A.j);
        A.m2();

    }
}
