//import java.util.Scanner; // beh�vs f�r Scanner-klassen

import javax.swing.JOptionPane; // beh�vs f�r dialog-boxar

public class Uppgifter {

	public static void main(String[] args) {
		
		//------------------------------------------------------------------------------------
		//
		//		All tidigare kod som inte anv�nde dialog-rutor har kommenterats ut
		//
		//------------------------------------------------------------------------------------
		
		
		// skapa ett nytt Scanner-objekt s� att inmatning kan lagras
//		Scanner inmatning = new Scanner(System.in);
		
		String inmatningsStr�ng;
		
		// L�pare 1
		
//		System.out.print("Vad �r ditt namn? " ); // namn
//		String L�pare1 = inmatning.nextLine();
//		System.out.print("Vad var din sluttid [i minuter]? "); // sluttid
//		double tid1 = Double.parseDouble(inmatning.nextLine());
		
		// namn
		String L�pare1;
		L�pare1 = JOptionPane.showInputDialog("Vad �r ditt namn?");

		// sluttid
		inmatningsStr�ng = JOptionPane.showInputDialog("Vad var din sluttid [i minuter]?");
		double tid1 = Double.parseDouble(inmatningsStr�ng);

		// L�pare 2
		
//		System.out.print("Vad �r ditt namn? "); // namn
//		String L�pare2 = inmatning.nextLine();
//		System.out.print("Vad var din sluttid [i minuter]? "); // sluttid
//		double tid2 = Double.parseDouble(inmatning.nextLine());
		
		// namn
		String L�pare2;
		L�pare2 = JOptionPane.showInputDialog("Vad �r ditt namn?");

		// sluttid
		inmatningsStr�ng = JOptionPane.showInputDialog("Vad var din sluttid [i minuter]?");
		double tid2 = Double.parseDouble(inmatningsStr�ng);
		
		// L�pare 3
//		System.out.print("Vad �r ditt namn? "); // namn
//		String L�pare3 = inmatning.nextLine();
//		System.out.print("Vad var din sluttid [i minuter]? "); // sluttid
//		double tid3 = Double.parseDouble(inmatning.nextLine());
		
		// namn
		String L�pare3;
		L�pare3 = JOptionPane.showInputDialog("Vad �r ditt namn?");

		// sluttid
		inmatningsStr�ng = JOptionPane.showInputDialog("Vad var din sluttid [i minuter]?");
		double tid3 = Double.parseDouble(inmatningsStr�ng);
		
//		inmatning.close(); // f�rslut Scanner-objektet f�r att f�rhindra resursl�cka
		
		
		// P�b�rja utmatningen
		
		String utmatning = "Alla l�pare och deras sluttider [i minuter]:\n";
		
//		System.out.println("Alla L�pare och deras sluttider:");
		
		// om l�pare 1 var f�rst
		if (tid1 < tid2 && tid1 < tid3) {
			// om l�pare 2 kom p� andra plats
			if (tid2 > tid1 && tid2 < tid3) {
				// visa alla l�pare och deras tider
//				System.out.printf("%s, %.2fm\n", L�pare1, tid1);
//				System.out.printf("%s, %.2fm\n", L�pare2, tid2);
//				System.out.printf("%s, %.2fm\n", L�pare3, tid3);
				
				utmatning += String.format("%s, %.2fm\n", L�pare1, tid1)
						+ String.format("%s, %.2fm\n", L�pare2, tid2)
						+ String.format("%s, %.2fm\n", L�pare3, tid3);
			}
			// om l�pare 3 kom p� andra plats
			else {
				// visa alla l�pare och deras tider
//				System.out.printf("%s, %.2fm\n", L�pare1, tid1);
//				System.out.printf("%s, %.2fm\n", L�pare3, tid3);
//				System.out.printf("%s, %.2fm\n", L�pare2, tid2);
				
				utmatning += String.format("%s, %.2fm\n", L�pare1, tid1)
						+ String.format("%s, %.2fm\n", L�pare3, tid3)
						+ String.format("%s, %.2fm\n", L�pare2, tid2);
			}
		}
		// om l�pare 2 var f�rst
		else if (tid2 < tid1 && tid2 < tid3) {
			// om l�pare 1 kom p� andra plats
			if (tid1 > tid2 && tid1 < tid3) {
				// visa alla l�pare och deras tider
//				System.out.printf("%s, %.2fm\n", L�pare2, tid2);
//				System.out.printf("%s, %.2fm\n", L�pare1, tid1);
//				System.out.printf("%s, %.2fm\n", L�pare3, tid3);
				
				utmatning += String.format("%s, %.2fm\n", L�pare2, tid2)
						+ String.format("%s, %.2fm\n", L�pare1, tid1)
						+ String.format("%s, %.2fm\n", L�pare3, tid3);
			}
			// om l�pare 3 kom p� andra plats
			else {
				// visa alla l�pare och deras tider
//				System.out.printf("%s, %.2fm\n", L�pare2, tid2);
//				System.out.printf("%s, %.2fm\n", L�pare3, tid3);
//				System.out.printf("%s, %.2fm\n", L�pare1, tid1);
				
				utmatning += String.format("%s, %.2fm\n", L�pare2, tid2)
						+ String.format("%s, %.2fm\n", L�pare3, tid3)
						+ String.format("%s, %.2fm\n", L�pare1, tid1);
			}
		}
		// om l�pare 3 var f�rst
		else {
			// om l�pare 1 kom p� andra plats
			if (tid1 > tid3 && tid1 < tid2) {
				// visa alla l�pare och deras tider
//				System.out.printf("%s, %.2fm\n", L�pare3, tid3);
//				System.out.printf("%s, %.2fm\n", L�pare1, tid1);
//				System.out.printf("%s, %.2fm\n", L�pare2, tid2);
				
				utmatning += String.format("%s, %.2fm\n", L�pare3, tid3)
						+ String.format("%s, %.2fm\n", L�pare1, tid1)
						+ String.format("%s, %.2fm\n", L�pare2, tid2);
			}
			// om l�pare 2 kom p� andra plats
			else {
				// visa alla l�pare och deras tider
//				System.out.printf("%s, %.2fm\n", L�pare3, tid3);
//				System.out.printf("%s, %.2fm\n", L�pare2, tid2);
//				System.out.printf("%s, %.2fm\n", L�pare1, tid1);
				
				utmatning += String.format("%s, %.2fm\n", L�pare3, tid3)
						+ String.format("%s, %.2fm\n", L�pare2, tid2)
						+ String.format("%s, %.2fm\n", L�pare1, tid1);
			}
		}
		// visa resultatet
		JOptionPane.showMessageDialog(null, utmatning);
		
		// avsluta programmet och dialog-boxarna
		System.exit(0);
	}

}
