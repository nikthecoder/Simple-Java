//import java.util.Scanner; // beh�vs f�r Scanner-klassen

import javax.swing.JOptionPane;

public class UppgifterDel2 {

	public static void main(String[] args) {
		
		//------------------------------------------------------------------------------------
		//
		//		All tidigare kod som inte anv�nde dialog-rutor har kommenterats ut
		//
		//------------------------------------------------------------------------------------
		
		
		// skapa ett nytt Scanner-objekt s� att inmatning kan lagras
//		Scanner inmatning = new Scanner(System.in);
		
		// f�rbered en str�ng f�r inmatning
		String inmatningsStr�ng;
		
		// Antal CD's denna m�naden
//		System.out.print("Hur m�nga CD's har du k�pt denna m�naden? ");
//		int cdM�ngd = inmatning.nextInt();
		inmatningsStr�ng = JOptionPane.showInputDialog("Hur m�nga CD's har du k�pt denna m�naden?");
		int cdM�ngd = Integer.parseInt(inmatningsStr�ng);
		
		//the conditional operator med undersatser f�r att representera �ven else if
		int po�ng = cdM�ngd >= 4 ? 60: (cdM�ngd == 3 ? 30: (cdM�ngd == 2 ? 15: (cdM�ngd == 1 ? 5: 0)));
		
		// Antalet po�ng som anv�ndaren f�r, baserat p� den f�reg�ende villkorssatsen, presenteras
//		System.out.print("Det motsvarar " + po�ng + " po�ng.");
		JOptionPane.showMessageDialog(null, "Det motsvarar " + po�ng + " po�ng.");
	}

}
