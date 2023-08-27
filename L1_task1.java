/*
    import java.util.Scanner;

    public class L1_task1 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println(" Enter your choice: ");
                System.out.println("1. Add");
                System.out.println("2. Subtract");
                System.out.println("3. Multiplication");
                System.out.println("4. Divide");
                System.out.println("5. Square Root");
                System.out.println("6. Exponentiation");
                System.out.println("0. Exit");

                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                if (choice == 0) {
                    System.out.println("Exiting the calculator. Goodbye!");
                    break;
                }

                double result = 0;

                switch (choice) {
                    case 1:
                        result = add();
                        break;
                    case 2:
                        result = subtract();
                        break;
                    case 3:
                        result = multiplication();
                        break;
                    case 4:
                        result = divide();
                        break;
                    case 5:
                        result = squareRoot();
                        break;
                    case 6:
                        result = exponentiation();
                        break;
                    default:
                        System.out.println("Invalid choice. Enter a valid choice.");
                        continue;
                }

                System.out.println("Result: " + result);
            }

            scanner.close();
        }

        private static double getNumberInput() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            return scanner.nextDouble();
        }

        private static double add() {
            double num1 = getNumberInput();
            double num2 = getNumberInput();
            return num1 + num2;
        }

        private static double subtract() {
            double num1 = getNumberInput();
            double num2 = getNumberInput();
            return num1 - num2;
        }

        private static double multiplication() {
            double num1 = getNumberInput();
            double num2 = getNumberInput();
            return num1 * num2;
        }

        private static double divide() {
            double num1 = getNumberInput();
            double num2 = getNumberInput();
            if (num2 == 0) {
                System.out.println("Any number cannot divide by zero.");
                return 0;
            }
            return num1 / num2;
        }

        private static double squareRoot() {
            double num = getNumberInput();
            if (num < 0) {
                System.out.println("Square root of a negative number can not done in our calculator");
                return 0;
            }
            return Math.sqrt(num);
        }

        private static double exponentiation() {
            double base = getNumberInput();
            double exponent = getNumberInput();
            return Math.pow(base, exponent);
        }
    }


*/