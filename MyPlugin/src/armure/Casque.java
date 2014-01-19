package armure;

import annot.Item;
import annot.TypeItem;


@Item(nom = "Casque", type = TypeItem.Armure, classe="All")
public class Casque {

	int defense;
	
	public Casque(){
		this.defense = 8;
	}
	
	public int getDefense() {
		return defense;
	}
}
