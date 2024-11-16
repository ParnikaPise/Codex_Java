import java.util.Scanner;

class PerfectNum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num");
        int num=sc.nextInt();
        int sum=0;
        for(int i = 1;i<num;i++){
            if (num%i==0) {
               
               // System.out.print(i);
                sum=sum+i;
                
               
            }
        }
          if (sum==num) {
            System.out.println(num + "is a perfect number");
          } else{
            System.out.println(num + "is not a perfect number");
          } 
            
        
        
    }
}