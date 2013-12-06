package plugin;

import annot.Item;
import annot.TypeItem;

@Item(nom = "Epee", type = TypeItem.Arme)
public class Epee {
 //Class pour test, a export en .Jar :)
	
	int force;
	
	public Epee(){
		this.force = 15;
	}
	
	public int getForce() {
		return force;
	}

	public void run() {
			System.out.println("Hi, I'm Epee");
	}
	
}
