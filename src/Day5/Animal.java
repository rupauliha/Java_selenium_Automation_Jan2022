package Day5;

public class Animal {
    String color;
    int leg;
    int ear;
    double weight;
    public void eat (String name){
        System.out.println(name + " Eating");
    }
    public void sleep (String name){
        System.out.println(name + " Sleeping");
    }

    {System.out.println("Non static block");}

    static{System.out.println("Static block");}

    public static void main(String[] args) {
        Animal dog=new Animal();
        Animal lion=new Animal();
        System.out.println("For dog"+"---"+  dog.color+"---"+ dog.ear+"----" + dog.leg+"----" + dog.weight);
        System.out.println("For lion"+"---"+  lion.color+"-----" + lion.ear+"------" +lion.leg+"-----" +lion.weight);
        dog.eat("dog");
        dog.sleep("dog");
        lion.eat("lion");
        lion.sleep("lion");
    }

}
class test1{

}
