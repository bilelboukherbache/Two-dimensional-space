package fr;

import fr.dessin.Point2D;
import fr.dessin.Point3D;

public class Runbis {

	public static void main(String[] args) {

		Point2D p1 = new Point2D();
		
		System.out.println("Par defaut :");
		p1.afficher();
		
		p1.translater(6, 9);
		System.out.println("Apres translation :");
		p1.afficher();
		
		p1.setX(20);
		System.out.println("Apres modification de sa valeur en x :");
		p1.afficher();
		
		Point2D p3 = new Point2D(45,21);
		Point2D p4 = new Point2D(122, 145);
		
		System.out.println("mes construteurs :");
		p3.afficher();
		p4.afficher();
		p4.translater(100, 100);
		p4.afficher();
		Point2D.getCompteur();
		System.out.println(Point2D.getCompteur());
		
		
		
		Point3D m2 = new Point3D(45, 21, 78);
		System.out.println(Point3D.getCompteur());
		m2.afficher();
		m2.translater(5, 7, 9);
		m2.afficher();
		
		
		
		
	
	}

}
