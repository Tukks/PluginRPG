package perso;

import annot.Attaque;
import annot.Classe;

@Classe(nom = "Guerrier")
public class Guerrier {

	private int pdv;
	private int force;
	private double defense;

	public Guerrier() {
		this.pdv = 120;
		this.defense = 15;
		this.force = 60;
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

	public double getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

}
