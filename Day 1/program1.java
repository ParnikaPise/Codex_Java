import java.util.Scanner;

class Demo {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number = ");
    int num = sc.nextInt();
    Number s = new Number();
    s.checkNumber(num);
  }
}

class Number {

  void checkNumber(int num) {
    if (num == 0)
      System.out.println("Number is zero");
    else if (num > 0)
      System.out.println("Number is positive");
    else
      System.out.println("Number is negative");

  }

}