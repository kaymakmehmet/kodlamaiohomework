package proje4;

public class Switchbloklari {

	public static void main(String[] args) {
		 char grade = 'M';
		 
		 switch (grade) {
		 
		 case 'A':
			 System.out.println("Mükemmel : Geçitiniz ");
			 break;
		 case 'B':
			 System.out.println("İyi geçtiniz");
			 break;
		 case 'C':
			 System.out.println("fena değil geçtiniz ");
			 break;
		 case 'D':
			 System.out.println("İdare eder geçtiniz");
			 break;
		 case'F':
			 System.out.println("Maalesef kaldın bro");
			 break;
			 default: 
				 System.out.println("Girdiğiniz değer geçerli bir not değildir!!!!");
			 
			 
		 }

	}

}
