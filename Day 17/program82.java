import java.util.Scanner;

class AreaOfRectangle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length");
        int length=sc.nextInt();
        System.out.println("Enter Breadth");
        int breadth=sc.nextInt();

        int area=length*breadth;
        System.out.println("Area of rectangle is : " + area);
    }
}