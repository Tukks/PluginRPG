package plugin;

import objet.Item;
import personnage.Personnage;
import annot.MyItem;

public class Epee {

	int force;

	public Epee(int force) {
		super();
		this.force = force;
	}

	@MyItem(icon = "test", nom = "test", type = "test")
	public void equipe(Personnage perso, Item item) {
		// TODO Auto-generated method stub
		System.out.println("Hi, I'm MyPlugin");
	}
}
