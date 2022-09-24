package proje13;

public class ArkadasSayilar {

	public static void main(String[] args) {
	
		int sayi1 = 284;
		int sayi2 = 220;
		int total1 = 0;
		int total2 = 0;
		
		for (int i=1;i<sayi1;i++) {
			if(sayi1 % i == 0 ) {
				total1 = total1 + i;
			}
		}
		for ( int j=1; j<sayi2;j++) {
			if (sayi2 % j == 0) {
				total2 = total2 + j;
				
			}
		}
		if(sayi1 == total2 && sayi2 == total1) {
			System.out.println("sayilar arkadaş sayidir.");
		}
		else {
			System.out.println("sayilar arkadaş sayi değiller.");
		}
	}

}
