package extra;

import java.net.URI;

import javax.swing.JOptionPane;

public class PiDay {
	public static void main(String[] args) {

		String PiDay= "3.14159265"; 
		
		
		for(int i = 0;i < PiDay.length(); i++ ) {
			
		String ans = JOptionPane.showInputDialog("PI?");
		if(ans.equalsIgnoreCase(PiDay.charAt(i) + "")) {
			JOptionPane.showMessageDialog(null, "Congratualtions");
			
			System.out.println(PiDay.charAt(i));
		
		}
		
		else{
			
		JOptionPane.showMessageDialog(null, "No pie for you!");
			System.exit(0);
		}
		}
		
		playVideo("https://www.youtube.com/watch?v=6TPjRoWm8Ck");
	}
		
		static void playVideo(String videoURL) {
		     try {
		          URI uri = new URI(videoURL);
		          java.awt.Desktop.getDesktop().browse(uri);
		     } catch (Exception e) {
		          e.printStackTrace();
		     }
		}
		
		
	}

