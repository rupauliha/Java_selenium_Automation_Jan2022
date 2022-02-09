package day3;

public class Arrays {
    public static void main(String[] args) {
        int[] intArray=new int[5];
        intArray[0]=11;
        intArray[1]=22;
        intArray[2]=444;
        intArray[3]=5559;
        intArray[4]=5558;

        System.out.println("third element in the array->"+intArray[2]);
        System.out.println("size of the array->"+intArray.length);

        for(int i=0; i<intArray.length; i++)
        {
            System.out.println(intArray[i]);
        }

    }
}
