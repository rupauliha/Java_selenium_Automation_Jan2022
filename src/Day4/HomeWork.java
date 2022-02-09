package Day4;

public class HomeWork {
    public static void main(String[] args) {
        Object[][] ObjectArray=new Object[5][2];
        //First person
        ObjectArray[0][0]="Amit";
        ObjectArray[0][1]=9999999;
        //Second Person
        ObjectArray[1][0]="Himanshu";
        ObjectArray[1][1]=88888888;
        //Third Person
        ObjectArray[2][0]="Sumit";
        ObjectArray[2][1]=7777777;
        //Fourth Person
        ObjectArray[3][0]="David";
        ObjectArray[3][1]=666666;
        //Fifth Person
        ObjectArray[4][0]="Manoj";
        ObjectArray[4][1]=60606060;
        System.out.println("Rows of the Array "+ObjectArray.length);
        System.out.println("Column of the Array "+ObjectArray[0].length);
        for (int i=0;i< ObjectArray.length;i++) {
            for (int j=0;j<ObjectArray[i].length;j++) {
                System.out.print(ObjectArray[i][j]+" ");
        }
            System.out.println(" ");
        }

       }

}

