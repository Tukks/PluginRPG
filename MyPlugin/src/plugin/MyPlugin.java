package plugin;

import annot.MyItem;

@Item
public class MyPlugin {
 //Class pour test, a export en .Jar :)
	int x;
	public MyPlugin(){
		super();
	}
	
	@MyItem(icon = "test", nom = "test", type = "test")
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hi, I'm MyPlugin");
	}
	
}
