import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        CheckCase c = new CheckCase();
        c.check(num);
    }

}

class CheckCase {
    void check(int num) {
        if (num % 2 == 0)
            System.out.println("The number is even");
        else
            System.out.println("The number is odd");
    }

}