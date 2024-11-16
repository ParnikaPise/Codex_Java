import java.util.Scanner;

class Division{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1");
        int num1=sc.nextInt();
        System.out.println("Enter num2");
        int num2=sc.nextInt();

        int remainder=num1%num2;
        int quotient=num1/num2;

        System.out.println("Quotient:" + quotient);
        System.out.println("Remainder:"+ remainder);
    }
}