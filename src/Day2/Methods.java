package Day2;

public class Methods {
    public static int multiplyNumber (int a,int b)
    {
        System.out.println("method start here");
        return a * b;

    }
    public static long SubTract (int a, int b)
    {
        return a-b;
    }
    public static int addNumber (int a, int b, int c)
    {
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println("main start here");
       int result=multiplyNumber(4,5);
        System.out.println(result);
        System.out.println("main ends here");
        System.out.println("Subtraction");
        long result1=SubTract(10,5);
        System.out.println(result1);
        System.out.println("Add start here");
       int result2=addNumber(5,6,4);
        System.out.println(result2);

    }
}
