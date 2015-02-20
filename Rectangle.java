import java.awt.geom.*;

class Rectangle {
	Point2D.Double origin, corner;
	Rectangle(double x1, double y1, double x2, double y2) {
		origin = new Point2D.Double(x1,y1);
		corner = new Point2D.Double(x2,y2);
		}

    public String toString(){return origin.toString() + " " + corner.toString();}
	double largeur(){return -origin.getX() + corner.getX();}
	double longueur(){return -origin.getY() + corner.getY();}
	double perimetre(){return 2*(largeur() + longueur());}
	double surface(){return largeur() * longueur();}
}


