package main;

public class ClimbingStairs {
	 public static int climbStairs(int n) {
	        if (n <= 2) return n;

	        int first = 1;  // Ways to reach step 1
	        int second = 2; // Ways to reach step 2

	        for (int i = 3; i <= n; i++) {
	            int third = first + second;
	            first = second;
	            second = third;
	        }

	        return second;
	    }

	    public static void main(String[] args) {
	        int n = 5;  // You can change this value to test other inputs
	        System.out.println("Number of ways to climb to the top: " + climbStairs(n));
	    }
	}

