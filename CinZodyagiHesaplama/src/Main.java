import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Çin Zodyağı Hesaplama Programı");
		System.out.print("Lütfen doğum yılınızı giriniz: ");
		int year = scanner.nextInt();
		
		int remainder = year % 12;                  //kalanı burada alıp switch-case kullanmak istedim
		String output = "Çin zodyağı burcunuz: ";	//daha az yazmak için çıktıyı buraya sabitledim
		
		switch(remainder) {
		
		case 0:
			output += "Maymun";
			break;
		case 1:
			output += "Horoz";
			break;
		case 2:
			output += "Köpek";
			break;
		case 3:
			output += "Domuz";
			break;
		case 4:
			output += "Fare";
			break;
		case 5:
			output += "Öküz";
			break;
		case 6:
			output += "Kaplan";
			break;
		case 7:
			output += "Tavşan";
			break;
		case 8:
			output += "Ejderha";
			break;
		case 9:
			output += "Yılan";
			break;
		case 10:
			output += "At";
			break;
		case 11:
			output += "Koyun";
			break;
		}
		System.out.println(output);
	}

}
