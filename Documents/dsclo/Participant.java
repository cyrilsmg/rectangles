public abstract class Participant{
        private String adresse;
        private String num_tel;
        
        public abstract int inscription(Sejour x) throws FullException, AgeException;
};
