//import java.util.Scanner; // behövs för Scanner-klassen

import javax.swing.JOptionPane; // behövs för dialog-boxar

public class Uppgifter {

	public static void main(String[] args) {
		
		//------------------------------------------------------------------------------------
		//
		//		All tidigare kod som inte använde dialog-rutor har kommenterats ut
		//
		//------------------------------------------------------------------------------------
		
		
		// skapa ett nytt Scanner-objekt så att inmatning kan lagras
//		Scanner inmatning = new Scanner(System.in);
		
		String inmatningsSträng;
		
		// Löpare 1
		
//		System.out.print("Vad är ditt namn? " ); // namn
//		String Löpare1 = inmatning.nextLine();
//		System.out.print("Vad var din sluttid [i minuter]? "); // sluttid
//		double tid1 = Double.parseDouble(inmatning.nextLine());
		
		// namn
		String Löpare1;
		Löpare1 = JOptionPane.showInputDialog("Vad är ditt namn?");

		// sluttid
		inmatningsSträng = JOptionPane.showInputDialog("Vad var din sluttid [i minuter]?");
		double tid1 = Double.parseDouble(inmatningsSträng);

		// Löpare 2
		
//		System.out.print("Vad är ditt namn? "); // namn
//		String Löpare2 = inmatning.nextLine();
//		System.out.print("Vad var din sluttid [i minuter]? "); // sluttid
//		double tid2 = Double.parseDouble(inmatning.nextLine());
		
		// namn
		String Löpare2;
		Löpare2 = JOptionPane.showInputDialog("Vad är ditt namn?");

		// sluttid
		inmatningsSträng = JOptionPane.showInputDialog("Vad var din sluttid [i minuter]?");
		double tid2 = Double.parseDouble(inmatningsSträng);
		
		// Löpare 3
//		System.out.print("Vad är ditt namn? "); // namn
//		String Löpare3 = inmatning.nextLine();
//		System.out.print("Vad var din sluttid [i minuter]? "); // sluttid
//		double tid3 = Double.parseDouble(inmatning.nextLine());
		
		// namn
		String Löpare3;
		Löpare3 = JOptionPane.showInputDialog("Vad är ditt namn?");

		// sluttid
		inmatningsSträng = JOptionPane.showInputDialog("Vad var din sluttid [i minuter]?");
		double tid3 = Double.parseDouble(inmatningsSträng);
		
//		inmatning.close(); // förslut Scanner-objektet för att förhindra resursläcka
		
		
		// Påbörja utmatningen
		
		String utmatning = "Alla löpare och deras sluttider [i minuter]:\n";
		
//		System.out.println("Alla Löpare och deras sluttider:");
		
		// om löpare 1 var först
		if (tid1 < tid2 && tid1 < tid3) {
			// om löpare 2 kom på andra plats
			if (tid2 > tid1 && tid2 < tid3) {
				// visa alla löpare och deras tider
//				System.out.printf("%s, %.2fm\n", Löpare1, tid1);
//				System.out.printf("%s, %.2fm\n", Löpare2, tid2);
//				System.out.printf("%s, %.2fm\n", Löpare3, tid3);
				
				utmatning += String.format("%s, %.2fm\n", Löpare1, tid1)
						+ String.format("%s, %.2fm\n", Löpare2, tid2)
						+ String.format("%s, %.2fm\n", Löpare3, tid3);
			}
			// om löpare 3 kom på andra plats
			else {
				// visa alla löpare och deras tider
//				System.out.printf("%s, %.2fm\n", Löpare1, tid1);
//				System.out.printf("%s, %.2fm\n", Löpare3, tid3);
//				System.out.printf("%s, %.2fm\n", Löpare2, tid2);
				
				utmatning += String.format("%s, %.2fm\n", Löpare1, tid1)
						+ String.format("%s, %.2fm\n", Löpare3, tid3)
						+ String.format("%s, %.2fm\n", Löpare2, tid2);
			}
		}
		// om löpare 2 var först
		else if (tid2 < tid1 && tid2 < tid3) {
			// om löpare 1 kom på andra plats
			if (tid1 > tid2 && tid1 < tid3) {
				// visa alla löpare och deras tider
//				System.out.printf("%s, %.2fm\n", Löpare2, tid2);
//				System.out.printf("%s, %.2fm\n", Löpare1, tid1);
//				System.out.printf("%s, %.2fm\n", Löpare3, tid3);
				
				utmatning += String.format("%s, %.2fm\n", Löpare2, tid2)
						+ String.format("%s, %.2fm\n", Löpare1, tid1)
						+ String.format("%s, %.2fm\n", Löpare3, tid3);
			}
			// om löpare 3 kom på andra plats
			else {
				// visa alla löpare och deras tider
//				System.out.printf("%s, %.2fm\n", Löpare2, tid2);
//				System.out.printf("%s, %.2fm\n", Löpare3, tid3);
//				System.out.printf("%s, %.2fm\n", Löpare1, tid1);
				
				utmatning += String.format("%s, %.2fm\n", Löpare2, tid2)
						+ String.format("%s, %.2fm\n", Löpare3, tid3)
						+ String.format("%s, %.2fm\n", Löpare1, tid1);
			}
		}
		// om löpare 3 var först
		else {
			// om löpare 1 kom på andra plats
			if (tid1 > tid3 && tid1 < tid2) {
				// visa alla löpare och deras tider
//				System.out.printf("%s, %.2fm\n", Löpare3, tid3);
//				System.out.printf("%s, %.2fm\n", Löpare1, tid1);
//				System.out.printf("%s, %.2fm\n", Löpare2, tid2);
				
				utmatning += String.format("%s, %.2fm\n", Löpare3, tid3)
						+ String.format("%s, %.2fm\n", Löpare1, tid1)
						+ String.format("%s, %.2fm\n", Löpare2, tid2);
			}
			// om löpare 2 kom på andra plats
			else {
				// visa alla löpare och deras tider
//				System.out.printf("%s, %.2fm\n", Löpare3, tid3);
//				System.out.printf("%s, %.2fm\n", Löpare2, tid2);
//				System.out.printf("%s, %.2fm\n", Löpare1, tid1);
				
				utmatning += String.format("%s, %.2fm\n", Löpare3, tid3)
						+ String.format("%s, %.2fm\n", Löpare2, tid2)
						+ String.format("%s, %.2fm\n", Löpare1, tid1);
			}
		}
		// visa resultatet
		JOptionPane.showMessageDialog(null, utmatning);
		
		// avsluta programmet och dialog-boxarna
		System.exit(0);
	}

}
