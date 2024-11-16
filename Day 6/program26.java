import java.util.Scanner;

class Compare{
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number 1");
    int num1=sc.nextInt();
    System.out.println("Enter number 2");
    int num2=sc.nextInt();
    System.out.println("Enter number 3");
    int num3=sc.nextInt();
    SecondLargeNum s = new SecondLargeNum(num1, num2, num3);
    s.numbers();
    }
}

class SecondLargeNum{
        int num1,num2,num3;
    SecondLargeNum(int num1,int num2,int num3){
        this.num1=num1;
        this.num2=num2;
        this.num3=num3;

    }


    void numbers(){
        if (num1>num2 && num1<num3 || num2==num3 && num3>num1) {
            System.out.println("The second largest number is :" + num1);
            
        } 
        else if( num1 < num2 && num2 < num3 || num1==num3 && num3>num2) {
            System.out.println("The second largest number is :" + num2);
            
        } else if(num1>num3 && num3>num2 || num2==num1 && num2>num3){
            System.out.println("The second largest number is :"+ num3);
        }else{
            System.out.println("Cant compare the numbers");
        }
    }
}

