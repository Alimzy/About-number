public class Main {
    public static void main(String[] args) {
        int number = 35;

        if(isEven(number)) System.out.println("This number is an even number");
        if(isOdd(number)) System.out.println("This number is an odd number");
        if(isPrimeNumber(number)) System.out.println("This number is a prime number");
        if(isSquare(number)) System.out.println("This number is a square number");
        if(isPerfectNumber(number)) System.out.println("This number is a perfect number");
        System.out.println("The factorial of this number is " + factorial(number));

    }

    public static boolean isEven(int number) {

        return number % 2 == 0;
    }

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public static boolean isPrimeNumber(int number) {
        int factors = 0;

        for (int count = 1; count <= number; count++) {
            if (number % count == 0) {
                factors++;
            }
        }
        if (factors <= 2) {

            return true;
        }
        return false;
    }

    public static boolean isSquare(int number) {
        for (int counter = 1; counter < number; counter++) {
            if (counter * counter == number) {
                return true;
            }
        }
        return false;
    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int count = 1; count < number; count++) {
            if (number % count == 0) {
                sum += count;
            }
        }
        return sum == number;
    }


    public static int  factorial(int number) {
        int factorial = 1;

        for (int count = 1; count < number; count++) {
            factorial = factorial * count;
        }
        return factorial;
}



}