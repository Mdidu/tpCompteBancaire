package persistance.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import persistance.dao.CompteDaoImpl;

@Entity
@Table(name = "COMPTE", schema = "AFPA")
public class Compte {
	private int numCompte;
	private float solde;
	private String proprietaire;

//	private CompteDaoImpl compteDaoImpl = new CompteDaoImpl();
	
	public Compte() {
//		find(numCompte);
	}
	
	@Id
	@Column(name = "IDCOMPTE", unique = true, nullable = false)
	public int getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}

	@Column(name = "SOLDE")
	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

	@Column(name = "PROPRIETAIRE")
	public String getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(String proprietaire) {
		this.proprietaire = proprietaire;
	}
	
//	public void find(int numCompte) {
//
//		solde = compteDaoImpl.findById(numCompte).getSolde();
////		proprietaire = compteDaoImpl.findById(numCompte).getProprietaire();
//	}

}
