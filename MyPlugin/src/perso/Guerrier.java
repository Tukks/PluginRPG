package perso;

import annot.Attaque;
import annot.Classe;

@Classe(nom = "Guerrier", ico="img/classe.jpg")
public class Guerrier {

	private int pdv;
	private int force;
	private int defense;

	public Guerrier() {
		this.pdv = 210;
		this.defense = 25;
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

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

}
