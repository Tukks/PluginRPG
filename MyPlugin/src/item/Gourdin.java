package item;

import annot.Item;
import annot.TypeItem;

@Item(nom = "Gourdin", type = TypeItem.Arme)
public class Gourdin {
	int force;
	String def = "Coup de gourdin";
	public Gourdin(){
		this.force = 12;
	}
	
	public int getForce() {
		return force;
	}	
}
