import java.util.Scanner;

public class Left_Rotation {
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
        int temp=array[0];
        for (int i=1;i<n;i++)
        {
            array[i-1]=array[i];
        }
        array[array.length-1]=temp;
        for (int i=0;i<n;i++)
        {
            System.out.print(array[i]+",");
        }
    }
}
