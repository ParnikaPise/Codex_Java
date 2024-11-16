import java.util.Scanner;

class SuccessorPredecessor{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number");
         int num=sc.nextInt();
         int Predecessor=num-2;
         System.out.println("Second Predecessor:" + Predecessor);
         int Successor=num+2;
         System.out.println("Second Successor:" + Successor);
    }
}