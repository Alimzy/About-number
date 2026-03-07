package aboutNumber;

public class AboutNumber {
    public static void main(String[] args) {
        int number = 21;

        if(isEven(number)) System.out.println("This number is an even number");
        if(isOdd(number)) System.out.println("This number is an odd number");
        if(isPrimeNumber(number)) System.out.println("This number is a prime number");
        if(isCompositeNumber(number)) System.out.println("This number is a composite number");
        if(isSquare(number)) System.out.println("This number is a square number");
        if(isCube(number)) System.out.println("This number is a cube number");
        if(isPerfectNumber(number)) System.out.println("This number is a perfect number");
        if(isAbundantNumber(number)) System.out.println("This number is an abundant number");
        if(isArmStrongNumber(number)) System.out.println("This number is an armstrong number");
        if(isDeficientNumber(number)) System.out.println("This number is a Deficient number");
        if(isPositive(number)) System.out.println("This number is a positive number");
        if(isNegative(number)) System.out.println("This number is a Negative number");
        if(isPalindrome(number)) System.out.println("This number is a Palindrome number");
        if(isBinary(number)) System.out.println("This number is a Binary number");
        if(isFibonacci(number)) System.out.println("This number is a Fibonacci number");
        System.out.println(digitalSum(number));
        System.out.println(factorialOf(number));
    }

    public static boolean isPositive(int number){
        return number > 0;
    }

    public  static boolean isNegative(int number){
        return number < 0;
    }

    public static boolean isZero(int number){
        return number == 0;
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

    public static boolean isCompositeNumber(int number) {
        int factors = 0;

        for (int count = 1; count <= number; count++) {
            if (number % count == 0) {
                factors++;
            }
        }
        if (factors <= 2) {

            return false;
        }
        return true;
    }

    public static boolean isSquare(int number) {
        for (int counter = 1; counter < number; counter++) {
            if (counter * counter == number) {
                return true;
            }
        }
        return false;
    }

    public static boolean isCube(int number) {
        for (int counter = 1; counter < number; counter++) {
            if (counter * counter * counter == number) {
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

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversed = 0;

        while (number > 0) {
            reversed = reversed * 10 + (number % 10);
            number /= 10;
        }

        return originalNumber == reversed;
    }

    public static boolean isAbundantNumber(int number) {
        int sum = 0;
        for (int count = 1; count < number; count++) {
            if (number % count == 0) {
                sum += count;
            }
        }
        return sum > number;
    }

    public static boolean isDeficientNumber(int number) {
        int sum = 0;
        for (int count = 1; count < number; count++) {
            if (number % count == 0) {
                sum += count;
            }
        }
        return sum < number;
    }


    public static boolean isBinary(int number){
        int lastDigit;
        while(number > 0){
             lastDigit = number % 10;
            if(lastDigit != 0 && lastDigit != 1){
                return false;
            }
            number /= 10;
        }
        return true;

    }

    public static boolean isArmStrongNumber(int number){
        String digits = ""+ number;
        int digit = number;
        int mySum = 0;
        int numberLength = digits.length();
        while (digit > 0){
            int lastDigit = digit % 10;
            int exponential = (int) Math.pow(lastDigit, numberLength);
            mySum += exponential;
            digit = digit / 10;
        }
        return mySum == number;
    }

    public static int digitalSum(int number){
        int mySum = 0;
        while (number > 0){
            int lastDigit = number % 10;
            mySum += lastDigit;
            number /= 10;
        }
        return mySum;
    }

    public static int factorialOf(int number){
        int factorial = 1;
        for(int count =1; count <= number;count++){
            factorial *= count;

        }

        return factorial;
    }

    public static boolean isTriangular(int number){
        int sum = 0;
        for(int count = 0; count <= number; count++){
            sum += count;
            if (sum == number) return true;
        }
        return false;
    }


    public static boolean isFibonacci(int number){
        int firstNumber = 0;
        int secondNumber = 1;
       int sum = 0;
        for(int count = 0;count <= number;count++){
             sum = firstNumber + secondNumber;
            if (sum == number) return true;
        firstNumber = secondNumber;
        secondNumber = sum;
        }
        return false;
    }







}