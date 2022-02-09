package Day5;

public class Laptop {
        int hardDrive;
        int ram;
        String brand;
        public void start(String name){
            System.out.println(name +" "+"Starting");
        }
        public void stop(String name){
            System.out.println(name +" "+"Stopping");
        }

        public static void main(String[] args) {
            Laptop hp=new Laptop();
            Laptop dell=new Laptop();
            hp.hardDrive=80;
            hp.ram=256;
            hp.brand="HP";
            dell.hardDrive=100;
            dell.ram=512;
            dell.brand="dell";
            System.out.println("for hp"+"---"+hp.ram+"---"+hp.hardDrive+"---"+hp.brand+"---");
            System.out.println("for Dell"+"---"+dell.ram+"---"+dell.hardDrive+"---"+dell.brand+"---");
            hp.stop("Hp laptop");
            hp.start("HP Laptop");
            dell.stop("dell Laptop");
            dell.start("dell laptop");





    }
    }



