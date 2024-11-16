import java.util.Scanner;

class KineticEnergy{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Mass:");
        double mass=sc.nextInt();
        System.out.println("Enter Velocity");
        double velocity=sc.nextInt();

        double KE=0.5*(mass*velocity*velocity);
        System.out.println("Kinetic Energy of that Object is "+KE);
    }
}