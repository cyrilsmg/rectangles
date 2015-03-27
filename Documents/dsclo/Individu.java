public class Individu extends Participant{
        private String nom;
        private int age;

        public int getAge(){return age;} 
        public int inscription(Sejour x) throws FullException, AgeException{
                if(x.getPlacesRestantes() == 0){
                        throw new FullException();
                }
                else {
                        if(x.getAgeRequis() > age) { 
                                throw new AgeException();
                        } 
                        else {
                                (x.getListePart()).add((Participant)this); 
                                return x.getPrix();
                        }
                }
        }
};
