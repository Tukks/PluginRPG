package plugin;

import annot.Item;
import annot.TypeItem;

@Item(nom = "Epee", type = TypeItem.Arme)
public class MyPlugin {
 //Class pour test, a export en .Jar :)
	
	int force;
	
	public MyPlugin(){
		this.force = 15;
	}
	
	public int getForce() {
		return force;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hi, I'm MyPlugin");
	}
	
}
