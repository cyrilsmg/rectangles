import java.awt.geom.*;
import java.io.*;
import java.util.*;
import java.lang.*;

public class TestRectangle {
	static Rectangle creerRectangle() {
	    System.out.printf("entrer les coordonnees des deux points (appuyer sur enter a chaque nouvelle coordonne\n");
	    Scanner in = new Scanner(System.in);
	    double x1 = in.nextDouble();
	    double y1 = in.nextDouble();
	    double x2 = in.nextDouble();
	    double y2 = in.nextDouble();
	    Rectangle r;
	    r = new Rectangle(x1,y1,x2,y2);
	    return r;
	}
	
	
	static Rectangle max(Rectangle[] r) {
	    double max = r[0].surface();
	    int airmax=0;
	    for(int i=1; i<r.length; i++){
	        if(r[i].surface() > max){
	            max = r[i].surface();
	            airmax = i;
	        }
	    }
    return r[airmax];
	}
	        
	
	public static void main (String[] args){
	    System.out.printf("taille du tableau de rectangles\n");
	    Scanner in = new Scanner(System.in);
	    int taille = in.nextInt();
	    
	    Rectangle[] rec;
	    rec = new Rectangle[taille];
	    for(int i=0; i<taille; i++){
	        rec[i]=creerRectangle();
	        }
	    
	    /*Double x1 = Double.parseDouble(args[0]);
	    Double y1 = Double.parseDouble(args[1]);
	    Double x2 = Double.parseDouble(args[2]);
	    Double y2 = Double.parseDouble(args[3]);
	    rec = new Rectangle(x1,y1,x2,y2);*/
	    
	    for(int i=0; i<taille; i++){
	        System.out.print(rec[i]+"\n");
	        }
        
        System.out.printf("\nrectangle d'aire max : "+max(rec)+"\n");

        /*System.out.printf("largeur = %f\n",rec.largeur());
        System.out.printf("longueur = %f\n",rec.longueur());
        System.out.printf("perimetre = %f\n",rec.perimetre());
        System.out.printf("surface = %f\n",rec.surface());*/
   }
}



