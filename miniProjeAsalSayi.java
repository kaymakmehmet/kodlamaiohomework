package Proje10;

public class miniProjeAsalSayi {

	public static void main(String[] args) {
		int number = 97;
		
		/*
		for (int i = 2; i<number; i++) {
			int reminder = number % i;
			if(reminder == 0 ) {
				System.out.println("asal değildir");
				break;
			}else {
				System.out.println("asaldır");
				break;
			}
		} */
		
		
		boolean isPrime = true;
		
		if (number<2) {
			System.out.println("geçersiz sayı girdiniz");
		}
		
		for(int i=2; i<number; i++) {
			
			if(number % i == 0) {
				isPrime = false;
				
			}
			
		}
			if(isPrime) {
				System.out.println("sayi asaldır");
			}else {
				System.out.println("sayi asal değildir");
			}
		
	}

}
