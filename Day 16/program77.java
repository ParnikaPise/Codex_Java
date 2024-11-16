import java.util.Scanner;

class OhmsLaw{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of Current");
        int I=sc.nextInt();  //current
        System.out.println("Enter the value of Resistance");
        int R=sc.nextInt();  //Resistance

        int Voltage=I*R;
        System.out.println("Voltage V = " + Voltage);
    }
}