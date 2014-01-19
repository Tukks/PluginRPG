package armure;

import annot.Item;
import annot.TypeItem;


@Item(nom = "Botte", type = TypeItem.Armure, classe="Voleur")
public class Botte {

	int defense;
	
	public Botte(){
		this.defense = 10;
	}
	
	public int getDefense() {
		return defense;
	}
}
