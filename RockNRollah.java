/*
 * RockNRollah.java
 */

import java.util.Random;

/**
 *
 * @author JimGalvan
 */
public class RockNRollah {
       
    public static void main(String[] args) {
    	// Create a Random object
    	
    	Random randomNumbers = new Random();
    	int[] sum = new int[13];    	
        
        for (int roll = 1; roll <= 36_000_000; roll++) {
        	int dice1 = randomNumbers.nextInt(6);
        	int dice2 = randomNumbers.nextInt(6);
        	int sumDice = dice1 + dice2;
        	++sum[2 + sumDice];

        }
        
        System.out.println("Results after " + 36000000 + " rolls");
        System.out.println("-------------------------");
        System.out.println("Value\tFrequency");
        
        for (int result = 2; result < sum.length; result++) {
        	System.out.printf("%3d%13d%n", result, sum[result]);
        }
        
    }
    
}
