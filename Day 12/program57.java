import java.util.Scanner;

class Mathematics{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1=sc.nextInt();
        System.out.println("Enter num2");
        int num2=sc.nextInt();

        int sqnum1=num1*num1;
        int sqnum2=num2*num2;
        int sub=sqnum1-sqnum2;

        int cubenum1=num1*num1*num1;
        int cubenum2=num2*num2*num2;
        int add=cubenum1+cubenum2;

        System.out.println("Addition of " + cubenum1 + " & " + cubenum2 +" is " + add );
        System.out.println("Substraction  of " + sqnum1 + " & " + sqnum2 +" is " + sub);
    }
}