import java.util.Scanner;

class Even{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i%2==0) {
                int square=i*i;
                int cube=i*i*i;
                System.out.println("Cube of "+ i+" is :"+ cube+" and Square of " + i + " is: " + square);
                
            }
            
        }
    }
}