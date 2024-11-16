import java.util.Scanner;

class Date {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month, date, year;
        System.out.println("Enter Date:");
        date = sc.nextInt();
        month = sc.nextInt();
        year = sc.nextInt();
        System.out.println(date + "/" + month + "/" + year);

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            if (date <= 31) {
                System.out.println("Valid date");
            } else {
                System.out.println("invalid date");
            }

        }

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (date <= 30) {
                System.out.println("Valid date");
            } else {
                System.out.println("invalid date");
            }

        }

        if (year % 4 != 0) {
            if (month == 2) {
                if (date <= 28) {
                    System.out.println("valid date");
                } else {
                    System.out.println("invalid date");
                }
            }
        } else {
            if (year % 4 == 0) {
                if (month == 2) {
                    if (date <= 29) {
                        System.out.println("valid date");
                    } else {
                        System.out.println("invalid date");
                    }
                }
            }
        }
    }
}
