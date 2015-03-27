import java.util.*;

public class Sejour{

        private String destination;
        private int date;
        private int nbr_max;
        private int age_requis;
        private int prix;
        private List<Participant> participants=new ArrayList<Participant>();
        
        public int getDate(){return date;}
        public String getDestination(){return destination;}
        public int getPlacesRestantes(){
                int cpt=0;
                for(Participant x : participants){
                        if(x instanceof Individu) cpt++;
                        else if(x instanceof Groupe) cpt = cpt + 1 + ((Groupe)x).getNbrMembres();
                }
                return nbr_max - cpt;
        }
        public List<Participant> getListePart(){return participants;}
        public int getPrix(){return prix;}
        public int getAgeRequis(){return age_requis;}
        
        public void setNbrMax(int nbr){nbr_max=nbr;}
                        
};
