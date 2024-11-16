import java.util.Scanner;

class ArrayInpuut{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        int n=5;
        System.out.println("Enter array elements");
        for(int i=1;i<=5;i++){
            a[i]=sc.nextInt();
           
        }
        System.out.print("The array elements are:" );
        for(int i =1;i<=n;i++){
            System.out.print(a[i] + " " );
        a[i]++;
        }

    }
}