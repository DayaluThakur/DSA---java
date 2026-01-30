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
        int max=arr[0];
        int count=0;
        for(int i=0;i<arr.length;i++){
            max<arr[i];
            max=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            max!=arr[i];
            count=count+1;
        
        }
        System.out.println(count);
        
    }
}