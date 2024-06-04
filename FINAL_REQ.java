import java.math.BigInteger;

public class BinomialCoefficient { 
    // Method to calculate binomial coefficient
    // Method-level comments to explain the purpose of the method and its parameters
    // Explaining the algorithm and usage of BigInteger for handling large numbers
    
    public static BigInteger binomialCoefficient(int n, int k) {
        BigInteger result = BigInteger.ONE;
        for (int i = 0; i < k; i++) {
            result = result.multiply(BigInteger.valueOf(n - i));
            result = result.divide(BigInteger.valueOf(i + 1));
        }
        return result;
    }

    public static void main(String[] args) {
        // Define values for n and k
        int n = 12;
        int k = 8;
        
        // Calculate and print binomial coefficient
        System.out.println("Binomial Coefficient of (" + n + " choose " + k + ") = " + binomialCoefficient(n, k));
        
        // My information
        System.out.println("Programmed by Mistica, Noreen B. from BSIT-GD");
    }
}
