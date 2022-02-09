package Day4;

public class TwodimArray {
    public static void main(String[] args) {
        int[][] twoDimArray = new int[4][3];
        //first row
        twoDimArray[0][0]= 10;
        twoDimArray[0][1]= 20;
        twoDimArray[0][2]= 30;
        //second row
        twoDimArray[1][0]= 40;
        twoDimArray[1][1]= 50;
        twoDimArray[1][2]= 60;
        //third row
        twoDimArray[2][0]= 70;
        twoDimArray[2][1]= 80;
        twoDimArray[2][2]= 90;
        //fourth row
        twoDimArray[3][0]= 100;
        twoDimArray[3][1]= 110;
        twoDimArray[3][2]= 120;

        System.out.println("Lenth of the Array is "+ twoDimArray.length); //4
        System.out.println("Column of the Arrays is " + twoDimArray[0].length); //3
        //outer for loop for rows
        for (int i =0; i<=twoDimArray.length;i++)
        {
            //inner for loop for colums
            for (int j = 0; j <twoDimArray[i].length; j++) {
                System.out.print(twoDimArray[i][j]+" ");
            }
            System.out.println();
        }


    }
}
