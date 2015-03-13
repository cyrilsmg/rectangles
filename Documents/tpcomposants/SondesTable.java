import java.util.*;

public class SondesTable{

	protected Map<LazySonde,Interrupteur> sondesToInterrupteurs = new HashMap<LazySonde,Interrupteur>();
	protected Map<Interrupteur,LazySonde> interrupteursToSondes = new HashMap<Interrupteur,LazySonde>();
	
	public Interrupteur getInterrupteur(LazySonde sonde){
		return sondesToInterrupteurs.get(sonde);
	}
	
	public LazySonde getSonde(Interrupteur interrupteur, Composant cible, String entree) {
		if(!interrupteursToSondes.containsValue(interrupteur)){
			LazySonde tmp = new LazySonde(interrupteur,entree);
			cible.setIn(tmp);
			sondesToInterrupteurs.put(tmp,interrupteur);
			interrupteursToSondes.put(interrupteur,tmp);	
		}
		return interrupteursToSondes.get(interrupteur);
	}
	
	public void resetSondes(){
		//sondesToInterrupteurs.keySet().reset();
		//interrupteursToSondes.values().reset();
	}
	
	public void clear(){
		sondesToInterrupteurs.clear();
		interrupteursToSondes.clear();
	}

}
