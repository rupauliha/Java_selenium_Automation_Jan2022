package Day5;

public class A {
    public A()
    {
        System.out.println("Construct with no argument");

    }
    public A(String K)
    {
        System.out.println("Construct with 1 arg"+"---"+ K);
    }
    public A(int i,int j)
    {
        System.out.println("Construct with 2 argument"+"---"+ i+"--"+ j);
    }


    public static void main(String[] args) {
        System.out.println("Main start here");
        A a1=new A();
        A a2=new A("Himanshu");
        A a3=new A(10,10);
        System.out.println("Main ends here");
    }
}

