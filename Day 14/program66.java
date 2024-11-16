import java.util.Scanner;

class Swapping{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1");
        int num1=sc.nextInt();
        System.out.println("Enter num1");
        int num2=sc.nextInt();

        int temp;
        System.out.println("Before Swap:" +num1 + " " + num2);
     
        
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After Swap:" +num1 + " " + num2);
}
}
