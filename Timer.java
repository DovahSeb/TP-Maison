public class Timer extends Thread {
	Fenetre fenetre;
	public Timer(Fenetre f){
		fenetre = f;
	}
	public void run() {
		try {
			while(true){
				if(fenetre.pause == false){
					fenetre.time +=1;
					sleep(1000);
				}
				else{
					sleep(1000);

				}
			
		}}

		catch (InterruptedException e) {}
	}
}	