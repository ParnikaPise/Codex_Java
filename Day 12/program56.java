import java.util.Scanner;

class Math{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1=sc.nextInt();
        System.out.println("Enter num2");
        int num2=sc.nextInt();

        int multiply=num1*num2;
        System.out.println("Multiplication is"+multiply);

        if (num1<num2) {
            int div=num2/num1;
            System.out.println("Division is " + div);
            
        }else{
            int div=num1/num2;
            System.out.println("Division is " + div);
        }

    }
}