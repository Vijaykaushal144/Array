import java.util.Scanner;

public class Number_Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array=");
        int number=sc.nextInt();
        int array[]=new int[number];
        System.out.println("Enter the value=");
        for (int i=0;i<number;i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.println("Your revers value are =");
        for (int i=number-1;i>=0;i--)
            System.out.println(array[i]);

    }
}
