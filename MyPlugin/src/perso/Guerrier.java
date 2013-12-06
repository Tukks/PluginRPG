package perso;

import annot.Attaque;
import annot.Classe;

@Classe(nom = "Guerrier")
public class Guerrier {

	private int pdv;
	private int force;
	private double def;

	public Guerrier() {
		this.pdv = 120;
		this.def = 0.9;
		this.force = 60;
	}

	@Attaque
	public int attaquer(){
		return getForce();
	}

	public int getPtDeVie() {
		return pdv;
	}

	public void setPtDeVie(int ptDeVie) {
		this.pdv = ptDeVie;
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
