package perso;

import annot.Attaque;
import annot.Classe;

@Classe(nom = "Archer")
public class Archer {

	private int pdv;
	private int force;
	private double def;
	
	public Archer() {
		this.pdv = 90;
		this.def = 0.6;
		this.force = 90;
	}
	
	@Attaque
	public int attaquer(){
		return getForce();
	}

	public int getPdv() {
		return pdv;
	}

	public void setPdv(int pdv) {
		this.pdv = pdv;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public double getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}
	
}
