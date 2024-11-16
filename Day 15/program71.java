import java.util.Scanner;

class MinNum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1");
        int num1=sc.nextInt();
        System.out.println("Enter numm2");
        int num2=sc.nextInt();

        if (num1<num2) {
            System.out.println("The minimum number amongst " + num1 + " & " + num2 + " is: " + num1);
        }else{
            System.out.println("The minimum number amongst " + num1 + " & " + num2 + " is: " + num2);
        }
    }
}