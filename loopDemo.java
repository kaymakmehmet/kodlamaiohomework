package Proje5;

public class loopDemo {

	public static void main(String[] args) {
		//for 
		for(int i=1;i<10;i++) {
			System.out.println(i);
		}
		
		for(int i=1;i<10;i+=2) {
			System.out.println(i);
			
	}
		System.out.println("for Döngü bitti");

		//while
		int i = 2;
	while(i<10) {
		System.out.println(i);
		i+=2;
	}
	System.out.println("while dongüsü bitti");
	
	
	//d0-while
	int j = 100;
	do { 
		System.out.println(j);
		j+=2;
	}while(j<10);
	System.out.println("do while dongüsü bitti");
}
}
