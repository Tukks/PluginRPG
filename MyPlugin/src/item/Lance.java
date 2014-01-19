package item;

import annot.Item;
import annot.TypeItem;

@Item(nom = "Lance", type = TypeItem.Arme, classe="Guerrier")
public class Lance {
	int force;
	String def = "Envoie de lance";
	public Lance(){
		this.force = 14;
	}
	
	public int getForce() {
		return force;
	}	
}
