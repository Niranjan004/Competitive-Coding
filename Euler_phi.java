//Time complexity: O(sqrt(n))
//Space complexity: O(1)

import java.util.*;

public class Euler_phi {
    
    // Returns the value of Euler's totient function phi(n)
    public static int phi(int n) {
        int result = n;// Initialize result as n
        
        // Check for all prime factors of n and subtract their multiples from result
        for (int p = 2; p <= n; p++) {
            if (n % p == 0) {// p is a prime factor of n
                while (n % p == 0) {// Remove all multiples of p from n
                    n /= p;
                }
                result -= result / p;
            }
        }

        return result;
    }
    // Main method to test the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int phi_n = phi(n);
        System.out.println("phi(" + n + ") = " + phi_n);
        sc.close();
    }
}
