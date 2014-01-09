package item;

import annot.Item;
import annot.TypeItem;

@Item(nom = "Poison automatique", type = TypeItem.Poison)

public class PoisonAuto {
	int Pdv;
	public PoisonAuto() {
		// TODO Auto-generated constructor stub
		this.Pdv = -20;
	}
	public int enlevePv(){
		return this.Pdv;
	}
	
}
