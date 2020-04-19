package it.polito.tdp.anagrammi.model;

import java.util.*;

import it.polito.tdp.anagrammi.db.anagrammiDAO;

public class Model {
	
	public Model() {
		
	}
	
	private Set<String> soluzione ;
	private Set<String> sbagliati;

	public Set<String> anagrammi(String parola) {
		
		List<Character> rest = new ArrayList<>();
		
		for(int i=0; i<parola.length(); i++) {
			rest.add(parola.charAt(i));
		}
		
		int livello = 0;
		
		this.soluzione = new HashSet<String>();
		this.sbagliati = new HashSet<String>();
		
		ricorsiva("", livello, rest);
		
		return this.soluzione; 
	
	}
	
	anagrammiDAO dao = new anagrammiDAO();
	
	private void ricorsiva(String parziale, int livello, List<Character> rest) {
		
		// caso terminale
		if(rest.size()==0) {
			// questa soluzione parziale è una soluzione completa
			// System.out.println(parziale) ;
			if(dao.ac(parziale)) this.soluzione.add(parziale);
			//else this.sbagliati.add(parziale);
		} else {
			//caso generale			
			for(Character c : rest) {
				// provo a mettere 'ris' nella posizione 'livello'
				// della soluzione parziale
				if(dao.prefisso(parziale+c+"%")) {
				// costruzione soluzione parziale (sottoproblema) 
				String tentativo = parziale+c;
				List<Character> rim = new ArrayList<>(rest);
				rim.remove(c);
				// chiamata ricorsiva
				ricorsiva(tentativo, livello+1, rim);
				// backtracking
				//parziale.remove(parziale.size()-1) ;
				}
			}
		}
		
		
	}

	public Set<String> getSoluzione() {
		return soluzione;
	}

	public void setSoluzione(Set<String> soluzione) {
		this.soluzione = soluzione;
	}

	public Set<String> getSbagliati() {
		return sbagliati;
	}

	public void setSbagliati(Set<String> sbagliati) {
		this.sbagliati = sbagliati;
	}
	
}
