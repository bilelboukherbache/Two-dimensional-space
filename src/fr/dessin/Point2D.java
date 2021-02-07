package fr.dessin;

public class Point2D {
	
	private int x;
	private int y;
	private static int compteur;
	
	
	
	public Point2D() {
		super();
		Point2D.compteur++;
	}
	
	
	public Point2D(int vX, int vY) {
		super();
		this.x = vX;
		this.y = vY;
		Point2D.compteur++;
	}


	public int getX() {
		return x;
	}
	public void setX(int valx) {
		this.x = valx;
	}
	public int getY() {
		return y;
	}
	public void setY(int valy) {
		this.y = valy;
	}
	
	public void afficher() {
		System.out.println("Point2D [" + this.x + ", " + this.y + "]");
	}
	
	public void translater(int dX,int dY) {
		x= x+dX;
		y= y+dY;		
	}
	public static final int getCompteur() {
		return Point2D.compteur;
	}

}
