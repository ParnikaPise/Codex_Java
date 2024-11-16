import java.util.Scanner;
class Maths{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1=sc.nextInt();
        System.out.println("Enter num2");
        int num2=sc.nextInt();
        int addition=num1+num2;
        System.out.println("Addition is " + addition);

        if(num1>num2){
            int sub=num1-num2;
            System.out.println("Substraction is " + sub);
        }else{
            int sub1=num2-num1;
            System.out.println("Substraction is" + sub1);
        }

    }
}