package aboutNumber;

import static org.junit.jupiter.api.Assertions.*;

import aboutNumber.AboutNumber;
import org.junit.jupiter.api.Test;

class AboutNumberTest {



    @Test
    public void testIfANumber_isPositive(){
        assertTrue(AboutNumber.isPositive(6));
    }

    @Test
    public void testIfANumber_isNotPositive(){
        assertFalse(AboutNumber.isPositive(-6));
    }

    @Test
    public void testIfANumber_isNegative(){
        assertTrue(AboutNumber.isNegative(-5));
    }

    @Test
    public void testIfANumber_isNotNegative(){
        assertFalse(AboutNumber.isNegative(5));
    }

    @Test
    public void testIfANumber_isZero(){
        assertTrue(AboutNumber.isZero(0));
    }

    @Test
    public void testIfANumber_isNotZero(){
        assertFalse(AboutNumber.isZero(9));
    }

    @Test
    public void testIfANumber_isEven(){
        assertTrue(AboutNumber.isEven(6));
    }

    @Test
    public void testIfANumber_isNotEven(){
        assertFalse(AboutNumber.isEven(5));
    }

    @Test
    public void testIfANumber_isOdd(){
        assertTrue(AboutNumber.isOdd(3));
    }

    @Test
    public void testIfANumber_isNotOdd(){
        assertFalse(AboutNumber.isOdd(6));
    }

    @Test
    public void testIfANumber_isPrime(){
        assertTrue(AboutNumber.isPrimeNumber(5));
    }

    @Test
    public void testIfANumber_isNotPrime(){
        assertFalse(AboutNumber.isPrimeNumber(6));
    }

    @Test
    public void testIfANumber_isComposite(){
        assertTrue(AboutNumber.isCompositeNumber(8));
    }

    @Test
    public void testIfANumber_isNotComposite(){
        assertFalse(AboutNumber.isCompositeNumber(2));
    }

    @Test
    public void testIfANumber_isSquare(){
        assertTrue(AboutNumber.isSquare(25));
    }

    @Test
    public void testIfANumber_isNotSquare(){
        assertFalse(AboutNumber.isSquare(17));
    }

    @Test
    public void testIfANumber_isCube(){
        assertTrue(AboutNumber.isCube(8));
    }

    @Test
    public void testIfANumber_isNotCube(){
        assertFalse(AboutNumber.isCube(5));
    }

    @Test
    public void testIfANumber_isPerfectNumber(){
        assertTrue(AboutNumber.isPerfectNumber(6));
    }

    @Test
    public void testIfANumber_isNotPerfectNumber(){
        assertFalse(AboutNumber.isPerfectNumber(7));
    }

    @Test
    public void testIfANumber_isPalindrome(){
        assertTrue(AboutNumber.isPalindrome(121));
    }

    @Test
    public void testIfANumber_isNotPalindrome(){
        assertFalse(AboutNumber.isPalindrome(16));
    }

    @Test
    public void testIfANumber_isAbundantNumber(){
        assertTrue(AboutNumber.isAbundantNumber(12));
    }

    @Test
    public void testIfANumber_isNotAbundantNumber(){
        assertFalse(AboutNumber.isAbundantNumber(11));
    }

    @Test
    public void testIfANumber_isDeficientNumber(){
        assertTrue(AboutNumber.isDeficientNumber(9));
    }

    @Test
    public void testIfANumber_isNotDeficientNumber(){
        assertFalse(AboutNumber.isDeficientNumber(12));
    }

    @Test
    public void testIfANumber_isBinary(){
        assertTrue(AboutNumber.isBinary(1011));
    }

    @Test
    public void testIfANumber_isArmStrongNumber(){
        assertTrue(AboutNumber.isArmStrongNumber(153));
    }

    @Test
    public void testDigitalSumOfAnumber(){
        assertEquals(6,AboutNumber.digitalSum(123));
    }

    @Test
    public void testFactorialOfAnumber(){
        assertEquals(120,AboutNumber.factorialOf(5));
    }

    @Test
    public void testTriangularNumber(){
        assertTrue(AboutNumber.isTriangular(6));
    }

    @Test
    public void testIfNumber_NotTriangularNumber(){
        assertFalse(AboutNumber.isTriangular(5));
    }

    @Test
    public void testIfNumber_NotAFibonacciNumber(){
        assertFalse(AboutNumber.isFibonacci(4));
    }

    @Test
    public void testIfNumber_isFibonacciNumber(){
        assertTrue(AboutNumber.isFibonacci(5));
    }


}
