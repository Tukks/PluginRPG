package item;


import annot.Item;
import annot.TypeItem;

@Item(nom = "Elixir auto", type = TypeItem.Potion, classe="All")
public class ElixirAuto {
	
	int pdv;
	
	public ElixirAuto(){
		pdv = 10;
	}
	
	public int soigne(){
		return pdv += 10;
	}
	
	public int getPdv() {
		return pdv;
	}	

}
