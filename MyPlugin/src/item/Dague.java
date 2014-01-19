package item;

import annot.Item;
import annot.TypeItem;

@Item(nom = "Dague", type = TypeItem.Arme, classe="Voleur,Guerrier")
public class Dague {
	int force;
	String def = "Coup de gourdin";
	public Dague(){
		this.force = 12;
	}
	
	public int getForce() {
		return force;
	}	
}
