package arme;

import annot.Item;
import annot.TypeItem;

@Item(nom = "Epee", type = TypeItem.Arme, classe="All")
public class Epee {
	
	int force;
	String def = "Coup d'épée";
	public Epee(){
		
		this.force = 15;
	}
	
	public int getForce() {
		return force;
	}	
}
