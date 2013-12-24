package item;

import annot.Item;
import annot.TypeItem;

@Item(nom = "Elixir", type = TypeItem.Potion)
public class Elixir {
	
	int pdv;
	
	public Elixir(){
		pdv = 10;
	}
	
	public int soigne(){
		return pdv += 10;
	}
	
	public int getPdv() {
		return pdv;
	}	

}
