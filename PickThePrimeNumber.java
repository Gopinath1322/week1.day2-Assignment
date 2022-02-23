package week1.day2;

public class PickThePrimeNumber {

		public static void main(String[] args) {
			
			for (int i = 2; i < 30; i++) {
				boolean a=true;
//				if(i%2!=0)
//					System.out.println(i);
				
				for(int j=2;j<i;j++) {
					if(i%j==0)
					{
						a=false;
					}
				}
				if (a==true) {
					System.out.println(i+ "  is a prime number");
				}
				
			}
		}

	}


