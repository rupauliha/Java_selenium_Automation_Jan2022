package day6.statictest;

public class Mainmethodtest {

    public static void main(){
        System.out.println("User definded main method");
    }

    public static void main(String[] args) {
        System.out.println("main start here");
        main();
    }
}
