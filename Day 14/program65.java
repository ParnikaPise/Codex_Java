import java.util.Scanner;

class Odd{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter num1");
        int num1=sc.nextInt();
        System.out.println("Enter num2");
        int num2=sc.nextInt();
        

        System.out.println("Series of Odd Numbers Ranging between "+num1+" & "+num2+ " is:");
        for (int i = num1; i <= num2; i++) {
            if (i%2==1) {
                System.out.print(i + ", ");
                
            }
        }
    }
}