//import java.util.Scanner; // behövs för Scanner-klassen

import javax.swing.JOptionPane;

public class UppgifterDel2 {

	public static void main(String[] args) {
		
		//------------------------------------------------------------------------------------
		//
		//		All tidigare kod som inte använde dialog-rutor har kommenterats ut
		//
		//------------------------------------------------------------------------------------
		
		
		// skapa ett nytt Scanner-objekt så att inmatning kan lagras
//		Scanner inmatning = new Scanner(System.in);
		
		// förbered en sträng för inmatning
		String inmatningsSträng;
		
		// Antal CD's denna månaden
//		System.out.print("Hur många CD's har du köpt denna månaden? ");
//		int cdMängd = inmatning.nextInt();
		inmatningsSträng = JOptionPane.showInputDialog("Hur många CD's har du köpt denna månaden?");
		int cdMängd = Integer.parseInt(inmatningsSträng);
		
		//the conditional operator med undersatser för att representera även else if
		int poäng = cdMängd >= 4 ? 60: (cdMängd == 3 ? 30: (cdMängd == 2 ? 15: (cdMängd == 1 ? 5: 0)));
		
		// Antalet poäng som användaren får, baserat på den föregående villkorssatsen, presenteras
//		System.out.print("Det motsvarar " + poäng + " poäng.");
		JOptionPane.showMessageDialog(null, "Det motsvarar " + poäng + " poäng.");
	}

}
