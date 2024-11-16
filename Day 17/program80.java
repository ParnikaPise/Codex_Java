import java.util.Scanner;

class Table{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        int num=sc.nextInt();

        for(int i=10;i>=1;i--){
            int multi=num*i;
            System.out.println(num + " X " + i +" = " + multi);
        }
    }
}