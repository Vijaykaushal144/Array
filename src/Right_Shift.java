import java.util.Scanner;

public class Right_Shift {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array=");
        int n=sc.nextInt();
        int array[]=new int[n];
        System.out.println("Enter the value of array=");
        for (int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        int temp=array[array.length-1];
        for (int i=array.length-1;i>0;i--)
        {
            array[i]=array[i-1];
        }
        array[0]=temp;
        for (int i=0;i<n;i++)
        {
            System.out.print(array[i]+",");
        }
    }
}
