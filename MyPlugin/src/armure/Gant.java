package armure;

import annot.Item;
import annot.TypeItem;


@Item(nom = "Gant", type = TypeItem.Armure, classe="Archer")
public class Gant {

	int defense;
	
	public Gant(){
		this.defense = 5;
	}
	
	public int getDefense() {
		return defense;
	}
}
