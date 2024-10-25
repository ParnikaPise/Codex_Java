import java.util.Scanner;

class Math{
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);  
      System.out.println("Enter values:");
      int num1 =sc.nextInt();
      int num2=sc.nextInt();
      int num3=sc.nextInt();
      Compare c = new Compare( num1,num2,num3);
      c.largeSmall();
    }
}

class Compare{
        int num1,num2,num3;
           Compare(int num1,int num2,int num3){
              this.num1=num1;
              this.num2=num2;
              this.num3=num3;

           }
        void largeSmall(){
            if (num1>num2 && num1>num3) {
                System.out.println("Num1 is greater");
                
            } else if (num1<num2 && num2>num3) {
                System.out.println("num2 is greater");
                
            } else if (num1<num2 && num2<num3) {
                System.out.println("num3 is greater");
            } 

            } 
                
            
        }

