package Day2;

public class ObjectDemo {

    int i = 10; //instance variable
   //method written here
    public void m1(){
        System.out.println("In non-static m1() method..");
    }

    public static void main(String[] args) {

        //create object or instance of my class

        //new creates memory location for object to reside
        //ObjectDemo() - constructor of class ObjectDemo . It will initialize instance variable
        //object creation = instantiation

        ObjectDemo obj = new ObjectDemo();
        obj.m1();
        System.out.println("Default value of i for first object->"+obj.i);
        obj.i = 20;
        System.out.println("Updated value of i for first object ->"+obj.i);
 //here ObjectDemo is user definded data types and obj2 is object
        ObjectDemo obj2 = new ObjectDemo();
        System.out.println("Default value of i for second object->"+obj2.i);

        obj2 = null; //de-allocating object2 memory
        obj = new ObjectDemo(); //3rd object will be created
        System.out.println("Value of i for 3rd object ->"+obj.i);

    }


}
