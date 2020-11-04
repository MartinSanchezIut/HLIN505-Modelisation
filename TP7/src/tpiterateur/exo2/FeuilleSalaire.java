package tpiterateur.exo2;

import java.util.Iterator;

public class FeuilleSalaire implements Iterable<Object> {

	private String employeur, salarie;
	private Integer nombreHeures;
	private Double montantNet;
	
 	public FeuilleSalaire(String employeur, String salarie, Integer nombreHeures, Double montantNet) {
		super();
		this.employeur = employeur;
		this.salarie = salarie;
		this.nombreHeures = nombreHeures;
		this.montantNet = montantNet;
	}

	public String getEmployeur() {
		return employeur;
	}

	public void setEmployeur(String employeur) {
		this.employeur = employeur;
	}

	public String getSalarie() {
		return salarie;
	}

	public void setSalarie(String salarie) {
		this.salarie = salarie;
	}

	public Integer getNombreHeures() {
		return nombreHeures;
	}

	public void setNombreHeures(Integer nombreHeures) {
		this.nombreHeures = nombreHeures;
	}

	public Double getMontantNet() {
		return montantNet;
	}

	public void setMontantNet(Double montantNet) {
		this.montantNet = montantNet;
	}

	@Override
	public Iterator<Object> iterator() {
		return new FeuilleSalaireIterator(this);
	}
	
	
	@Override
	public String toString() {
		return "[Employeur: "+employeur+" / Salarié: "+salarie+" / NbHeures: "+nombreHeures+" / MontantNet: "+montantNet+"]";
	}

}