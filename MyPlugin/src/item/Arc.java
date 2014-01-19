package item;

import annot.Item;
import annot.TypeItem;

@Item(nom = "Arc", type = TypeItem.Arme, classe="Archer")
public class Arc {

	int force;
	String def = "Lance fléches";
	public Arc(){
		
		this.force = 15;
	}
	
	public int getForce() {
		return force;
	}	

}
