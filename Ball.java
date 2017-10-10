import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Ball {
	public int x;
	public int y;
	public int vx;
	public int vy;
	public int size;
	public Color color;
	double minx , miny , maxx , maxy;

	public Ball(int X , int Y , int VX , int VY , int Size , double Minx , double Miny,
			double Maxx , double Maxy , Color c){
		x=X;
		y=Y;
		vx=VX;
		vy=VY;
		minx = Minx;
		miny = Miny;
		maxx = Maxx;
		maxy = Maxy;
		size = Size;
		color = c;
	}
	public void new_pos(){
		wall_colision();
		x = x+vx;
		y = y+vy;
	}
	public void wall_colision(){


		if(x+size >=maxx){
			vx = -vx;
		}
		if(x-size <= minx){
			vx = -vx;
		}
		if(y+size >= maxy){
			vy = -vy;
		}
		if(y-size <= miny){
			vy = -vy;
		}
	}
	public double distance (Ball other){
		int dx = other.x - x;
		int dy = other.y - y;
		return Math.sqrt((dx*dx) + (dy*dy));
	}
	
	public void draw(Graphics g){
		g.drawOval(x-size,y-size,size*4,size*4);
		g.fillOval(x-size,y-size,size*4,size*4);
		Random test = new Random();


		g.setColor(color);


		}
	
	public boolean collision(Ball other){
		if (((int)distance(other) <= (size+ other.size))){
			return true;
		}
		else{
			return false;
		}
		
	}
}



