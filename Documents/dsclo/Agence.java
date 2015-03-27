import java.util.*;
import java.io.*;

public class Agence{
        private List<Sejour> sejours = new ArrayList<Sejour>();
        
        public void affiche_sejours(){
                int i=1;
                for(Sejour x : sejours){
                System.out.println("numero: " + i + " date: " + x.getDate() + " destination: " + x.getDestination() + " places restantes: " + x.getPlacesRestantes());
                i++;
                }
        }
        
        public void inscription(int numSejour, Participant part){
        try{part.inscription(sejours.get(numSejour));}
        catch(FullException fex) { System.out.println("mise en attente");}
        catch(AgeException aex) {System.out.println("age minimum requis");}
        }
};
