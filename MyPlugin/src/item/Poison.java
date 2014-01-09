package item;

import annot.Item;
import annot.TypeItem;

@Item(nom = "Poison", type = TypeItem.Poison)

public class Poison {
	int Pdv;
	public Poison() {
		// TODO Auto-generated constructor stub
		this.Pdv = -30;
	}
	public int enlevePv(){
		return this.Pdv;
	}
}
