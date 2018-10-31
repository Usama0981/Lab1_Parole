package parole.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Parole {
	private ArrayList<String> elenco;
	
	public Parole() {
		elenco= new ArrayList<String>();
	}
	
	/**
	 * Aggiunge una parola alla volta nell'elenco
	 * @param p Parola da aggiungere
	 */
	public void addParola(String p) {
		elenco.add(p);
	}
	
	public ArrayList<String> getElenco() {
		//Collections è una classe che permette di ordinare elenchi
		Collections.sort(elenco);
		return elenco;
	}
	
	/**
	 * Cancella l'elenco
	 */
	public void reset() {
		elenco.clear();
	}
	
	/**
	 * Trasforna l'elenco in una stringa
	 * @return L'elenco sotto forma di stringa
	 */
	public String getConvertedList() {
		ArrayList<String> elenco=getElenco();
		String testo="";
		for(int i=0; i<elenco.size();i++)
			testo+=elenco.get(i)+"\n";
		return testo;
	}
	
	/**
	 * Cancella dall'elenco la parola selezionata
	 * @param p Parola da cancellare
	 */
	public void Cancella(String p) {
		int index=elenco.indexOf(p);
		if(index!=-1) 
			elenco.remove(index);
	}	
}
