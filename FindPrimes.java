public class FindPrimes {
       
    public static void main(String[] args) {
        System.out.println("Prime numbers < 10k:");
        
		System.out.println(isPrime(-54050));

        
         }
    
    public static boolean isPrime(int num) {
    	boolean result = true;
    	
    	if (num <= 1 ) {
    		result = false;
    	}
    	
    	else {
    		for (int i = 2; i <= Math.sqrt(num); ++i){
            if (num % i == 0){ // check the remainder
            	
                result = false;
                break;
            }
    		}
    		}
    	
		return result;
    	}
}