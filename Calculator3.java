import java.util.Scanner;

public class Calculator3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Enter number 1:");
            double a = sc.nextDouble();

            System.out.println("Enter number 2:");
            double b = sc.nextDouble();

            System.out.println("Enter your operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");

            int c = sc.nextInt();
            double ans;

            switch (c) {
                case 1:
                    ans = addition(a, b);
                    System.out.println("Addition of " + a + " and " + b + " is = " + ans);
                    break;
                case 2:
                    ans = subtraction(a, b);
                    System.out.println("Subtraction of " + a + " and " + b + " is = " + ans);
                    break;
                case 3:
                    ans = multiplication(a, b);
                    System.out.println("Multiplication of " + a + " and " + b + " is = " + ans);
                    break;
                case 4:
                    if (b != 0) {
                        ans = division(a, b);
                        System.out.println("Division of " + a + " and " + b + " is = " + ans);
                    } else {
                        System.out.println("Cannot divide by zero");
                    }
                    break;
                case 5:
                    ans = modulus(a, b);
                    System.out.println("Modulus of " + a + " and " + b + " is = " + ans);
                    break;
                default:
                    System.out.println("Invalid Operation");
            }

            System.out.println("Do you want to continue? (y/n)");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        sc.close();
        System.out.println("Calculator closed.Thank you");
    }

    static double addition(double a, double b) {
        return a + b;
    }

    static double subtraction(double a, double b) {
        return a - b;
    }

    static double multiplication(double a, double b) {
        return a * b;
    }

    static double division(double a, double b) {
        return a / b;
    }

    static double modulus(double a, double b) {
        return a % b;
    }
}
