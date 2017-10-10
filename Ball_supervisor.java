import java.util.Vector;


public class Ball_supervisor extends Thread {
	Fenetre fenetre;
	public Ball_supervisor(Fenetre f){
		fenetre = f;
	}
	public void run() {
		try {
			while(true){
				if(fenetre.stop == false){
				for(int i=0;i<fenetre.dessins.size();i++){
					fenetre.dessins.get(i).new_pos();
			}
				for(int i=0;i<fenetre.dessins.size();i++){
					for(int j=0;j<fenetre.dessins.size();j++){
						if(i !=j){
							if(fenetre.dessins.get(i).collision(fenetre.dessins.get(j))){
								fenetre.dessins.remove(j);
								fenetre.dessins.remove(i);
								fenetre.score_value +=1 ;
							}
						}
				}			}
				sleep(10);
		}
				else{
					sleep(10);
				}
				}}

		catch (InterruptedException e) {}
	}
}	

