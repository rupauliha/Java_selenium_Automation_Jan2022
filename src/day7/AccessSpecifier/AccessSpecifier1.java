package day7.AccessSpecifier;

public class AccessSpecifier1 {
    public int i1 = 10;
     protected int i2 = 20;
    int i3 = 30; //default variable
    private int i4 = 40;

    public void m1(){
        System.out.println("Inside public m1() ");
    }
    static protected void m2(){
        System.out.println("Inside protected m2() ");
    }
    void m3(){
        System.out.println("Inside default  m3() ");
    }
    private void m4(){
        System.out.println("Inside private  m4() ");
    }

    public static void main(String[] args) {
        AccessSpecifier1 obj = new AccessSpecifier1();
        System.out.println("Public variable i1->"+obj.i1);
        System.out.println("Protected variable i2->"+obj.i2);
        System.out.println("Default variable i3->"+obj.i3);
        System.out.println("Private variable i4->"+obj.i4);

        obj.m1();
        //obj.m2();
        obj.m3();
        obj.m4();
    }
}

class TestAccessSpecifier1{
    public void m(){
        AccessSpecifier1 obj = new AccessSpecifier1();
        System.out.println("Public variable i1->"+obj.i1);
        System.out.println("Protected variable i2->"+obj.i2);
        System.out.println("Default variable i3->"+obj.i3);
//        System.out.println("Private variable i4->"+obj.i4); //private variable cannot be accessed outside the AccessSpecifier1 class

        obj.m1();
        //obj.m2();
        obj.m3();
//        obj.m4();//private methods cannot be accessed outside the AccessSpecifier1 class
    }
}

