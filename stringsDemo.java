package Proje9;

public class stringsDemo {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel";

		System.out.println(mesaj);
		/*
		 * System.out.println("Eleman sayisi : " + mesaj.length());
		 * System.out.println("5. eleman : " + mesaj.charAt(4));
		 * System.out.println(mesaj.concat(" Yaşasın ! "));
		 * System.out.println(mesaj.startsWith("B"));
		 * System.out.println(mesaj.startsWith("b"));
		 * 
		 * System.out.println(mesaj.endsWith("."));
		 * 
		 * char[] karakterler = new char[5]; mesaj.getChars(0, 5, karakterler, 0);
		 * 
		 * System.out.println(karakterler); System.out.println(mesaj.indexOf("ü"));
		 * System.out.println(mesaj.lastIndexOf("ç"));
		 */
		
			System.out.println(mesaj.replace(" ", "-"));   
			
	        // ya da değişkene tanımlayabiliriz
			
			String yeniMesaj = mesaj.replace(" ", "-");
			
			System.out.println(yeniMesaj);
			
			System.out.println(mesaj.substring(2, 10)); 
			//10 a kadar demek oluyor
		
		
			//split kullanımında for döngüsü kullanılır. parçalama yaptığından birden fazla çıktı verecek o yüzden dizi 
			
			for ( String kelimeler : mesaj.split(" ") ) {
				
				System.out.println(kelimeler);
			}
			
			
			
			
	}

}
