import java.util.*;

public class Groupe extends Participant{
        private Individu responsable;
        private List<Individu> membres = new ArrayList<Individu>();
        
        public int getNbrMembres(){return membres.size();}
        
        public int ageSuffisant(Sejour x){
                int tmp = 1;
                for(Individu y : membres){
                        if(y.getAge() < x.getAgeRequis()) tmp =0;
                }
                return tmp;
        }
        
        public int inscription(Sejour x) throws FullException, AgeException{
                int tmp = x.getPlacesRestantes()-1;
                tmp = tmp - this.getNbrMembres();
                if(tmp < 0){ 
                        throw new FullException();
                }
                else{
                        if(this.ageSuffisant(x) == 0) {
                                throw new AgeException();
                        }
                        else{
                                (x.getListePart()).add((Participant)this);
                                return (int)((double)((1 + this.getNbrMembres()) * x.getPrix()) * 0.9);
                        }
                }
                        
        }
};
