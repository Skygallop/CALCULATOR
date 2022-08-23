import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		
	
		// hyp = Math.max(sidehyp, sideop, sidead);
		
		
		
		double hyppd = Double.parseDouble(JOptionPane.showInputDialog("Enter hypotenuse: "));
		JOptionPane.showMessageDialog(null, "Your hypotenuse is: "+hyppd);
		double adpd = Double.parseDouble(JOptionPane.showInputDialog("Enter adjacent: "));
		JOptionPane.showMessageDialog(null, "Your adjacent side is: "+adpd);
		double oppd = Double.parseDouble(JOptionPane.showInputDialog("Enter opposite: "));
		JOptionPane.showMessageDialog(null, "Your opposite side is: "+oppd);
		
		
		double sidehyp = hyppd;
		double sidead = adpd;
		double sideop = oppd;
		double resone;
		double restwo;
		double resthree;
		
		
		String sct = JOptionPane.showInputDialog("Sin: A Cos: B Tan: C");
		JOptionPane.showMessageDialog(null, "Operation: "+sct);
		String output = sct.toLowerCase(); 
	
		if (output.contains("a")) {
			
			resone = (sideop/sidehyp);
			JOptionPane.showMessageDialog(null, "Operation: "+resone);
			
			}
		
		if (output.contains("b")) {
			
			restwo = (sidead/sidehyp);
			JOptionPane.showMessageDialog(null, "Operation: "+restwo);
		}
		
		if (output.contains("c")) {
			resthree = (sideop/sidead);
			JOptionPane.showMessageDialog(null, "Operation: "+resthree);
			
		}
		
	
		
		
			
			
			
			
		}
		
		
		
		}

		

	


