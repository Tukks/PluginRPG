package item;

import annot.Item;
import annot.TypeItem;


@Item(nom = "Epee", type = TypeItem.Armure)
public class Bouclier {

	int defense;
	
	public Bouclier(){
		this.defense = 5;
	}
	
	public int getForce() {
		return defense;
	}

	public void run() {
			System.out.println("Hi, I'm Bouclier");
	}
}
