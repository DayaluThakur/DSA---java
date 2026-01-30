import java.util.Scanner;

public class array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the size of an array:");
        int[]arr=new int[n];
        System.out.println("Enter the element:");
        for(int i=1;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(arr[i]);
    }
}