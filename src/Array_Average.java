import java.util.Scanner;

public class Array_Average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Student=");
        int number=sc.nextInt();
        int array[]=new int[number];
        System.out.println("Enter the marks=");
        for (int i=0;i<number;i++)
        {
            array[i]=sc.nextInt();
        }
        int average=0;
        for (int i=0;i<number;i++)
        {
            average=average+array[i];
        }
        average=average/number;
        System.out.println("average marks are  " +average);
    }
}
