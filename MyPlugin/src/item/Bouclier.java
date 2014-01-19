package item;

import annot.Item;
import annot.TypeItem;


@Item(nom = "Bouclier", type = TypeItem.Armure, classe="Guerrier")
public class Bouclier {

	int defense;
	
	public Bouclier(){
		this.defense = 5;
	}
	
	public int getDefense() {
		return defense;
	}
}
