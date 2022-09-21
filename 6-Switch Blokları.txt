public class Main {
	
	public static void main(String[] args) {
	
		char grade = 'B';
		
		switch(grade) {
		case 'A':
			System.out.println("Mukemmel : Gectiniz");
			break;
		case 'B':
			System.out.println("Cok Guzel : Gectiniz");
			break;
		case 'C':
			System.out.println("iyi : Gectiniz");
			break;
		case 'D':
			System.out.println("Fena Degil : Gectiniz");
			break;
		case 'F':
			System.out.println("Malesef : Kaldiniz");
			break;
			default:
			System.out.println("Gecersiz not girdiniz");
		}
		
		//Kendi IF denemem
		
		char not1 = 'A';
		char not2 = 'B';
		char not3 = 'C';
		char not4 = 'D';
		char not5 = 'F';
		char notOgrenci = 'C';
			
		if (notOgrenci==not1) {
			System.out.println("Mukemmel : Gectiniz");
		}
		else
		if (notOgrenci==not2) {
			System.out.println("Cok Guzel : Gectiniz");
		}
		else
		if (notOgrenci==not3) {
			System.out.println("iyi : Gectiniz");
		}
		else
		if (notOgrenci==not4) {
			System.out.println("Fena Degil : Gectiniz");
		}
		else
		if (notOgrenci==not5) {
			System.out.println("Malesef : Kaldiniz");
		}
		else {
			System.out.println("Gecerli bir not giriniz.");
		}
		
		}
	}
	


