package proje14;

public class SayiBulma {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 2, 4, 5, 7, 8, 0 };
		int aranacak = 7;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}

		}
		if (varMi) {
			System.out.println("sayi mevcuttur");
		} else {
			System.out.println("sayi mevcut değildir");
		}
	}

}
