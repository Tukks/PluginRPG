package perso;

import annot.Attaque;
import annot.Classe;

@Classe(nom = "Archer")
public class Archer {

	private int pdv;
	private int force;
	private int defense;
	
	public Archer() {
		this.pdv = 1000;
		this.defense = 10;
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

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}
	
}
