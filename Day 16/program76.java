import java.util.Scanner;

class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1=sc.nextInt();
        System.out.println("Enter num2");
        int num2=sc.nextInt();
        int fact=1;
        for (int i = num1; i <= num2 ; i++) {
            fact=fact*i;
            System.out.println("Factorial of " + i+ " is "+fact);
        }
    }
}