package proje12;

public class MukemmelSayi {

	public static void main(String[] args) {

		int number = 0;
		int total = 0;

		for (int i = 1; i < number; i++) {

			if (number % i == 0) {

				total = total + i;

			}
		}
		
			if( total <= 0) {
			
			System.out.println("0 ve 0 dan küçük sayılar mükemmel sayi olarak nitelendirilemez");
		}
			else if (total == number) {
			System.out.println("sayi mükemmel sayidir");
		} 
		else {
			System.out.println("sayi mükemmel sayi değildir");
		}

	}

}
