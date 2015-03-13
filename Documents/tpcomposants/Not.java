/**
 *
 * @author Bernard.Carre@polytech-lille.fr
 */

public class Not extends Porte {
	
	protected Composant in;
	
	public void setIn(Composant comp) {
		
		in = comp;
		
	}
	
	
	public String description(){
		String info;
        	if (in != null) info = in.getId();
        	else info = "non connecte";
        	return super.description()+" in : "+info;
		}
	
	
	public boolean getEtat() throws NonConnecteException {
		
		if (in == null) {
			
			throw new NonConnecteException();
			
		} else {
			
			return !in.getEtat();
			
		}
		
}
}
