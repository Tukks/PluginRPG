package armure;

import annot.Item;
import annot.TypeItem;


@Item(nom = "Bouclier", type = TypeItem.Armure, classe="Guerrier")
public class Bouclier {

	int defense;
	
	public Bouclier(){
		this.defense = 15;
	}
	
	public int getDefense() {
		return defense;
	}
}
