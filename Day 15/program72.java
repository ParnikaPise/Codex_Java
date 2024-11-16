import java.util.Scanner;

class Velocity{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter distance:");
        int distance=sc.nextInt();
        System.out.println("Enter time:");
        int time=sc.nextInt();
        int velocity=distance/time;
        System.out.println("The Velocity of a particle roaming in space is " + velocity + "m/s.");
    }
}