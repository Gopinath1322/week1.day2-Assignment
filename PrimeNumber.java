package week1.day2;

public class PrimeNumber {
	public static void main(String[] args) {
		int number=13;
		int count=0;
		
		for (int i = 1; i <=13; i++) {
			if (number%i==0) {
			count++;	
			}  
			
		}
		if (count==2)
			System.out.println("primeNumber");
		else
			System.out.println("not prime number");
	}

}
