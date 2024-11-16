import java.util.Scanner;

class Calci{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1");
        int num1=sc.nextInt();
        System.out.println("Enter num2");
        int num2=sc.nextInt();
        System.out.println("Choose Operator + - * /");
        char operator = sc.next().charAt(0);
        int result;

        switch (operator) {
            case '+':
               result = num1 + num2;
               System.out.println("Addition of" +num1 +" & " + num2 + " is:" + result);
                break;

            case '-':
            if (num1>num2) {
                    
                result= num1 - num2;
                System.out.println("Substracttion of" +num1 +" & " + num2 + " is:" + result);
            }else{
                result=num2-num1;
                System.out.println("Substraction of" +num1 +" & " + num2 + " is:" + result);
            }
                break;
             
            case '*':
                 result= num1 * num2;
                 System.out.println("Multiplication of" +num1 +" & " + num2 + " is:" + result);
                break;    
            
            case '/':
                if (num1>num2) {
                    
                    result= num1 / num2;
                    System.out.println("Division of" +num1 +" & " + num2 + " is:" + result);
                }else{
                    result=num2/num1;
                    System.out.println("Division of" +num2 +" & " + num1 + " is:" + result);
                }
               break;     
        
            default:
            System.out.println("Invalid Operation");
                break;
        }
    }
    
}