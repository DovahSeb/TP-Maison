import java.util.Vector;


public class Affiche extends Thread {
	Fenetre fenetre;
	public Affiche(Fenetre f){
		fenetre = f;
	}
	public void run() {
		try {
			while(true){
				fenetre.repaint();
			
				sleep(1);
		}}

		catch (InterruptedException e) {}
	}
}	


