package proje11;

public class SesliHarfler {

	public static void main(String[] args) {
		
		char harf = 'X';

			switch (harf) {
			
			case 'A':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("Kalın sesli harf");
				break;
			case 'E':
			case 'İ':
			case 'Ö':
			case 'Ü':
				System.out.println("İnce sesli harf");
				break;
				default:
					System.out.println("Sessiz harf girdiniz");
				
				
			}
	}

}
