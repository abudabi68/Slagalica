package edu.milkacanic;

import java.util.ArrayList;
import java.util.Random;

public class Option implements IOoperations {
	protected int brojPokusaja;
	protected Enumeracija pokusaj;
	 Random rn=new Random();
	 ArrayList<String> listaReci=new ArrayList<String>();
		{
		listaReci.add("Autobus");
		listaReci.add("Hamburger");
		listaReci.add("Jabuka");
		listaReci.add("Racun");
		}
		int randWords=rn.nextInt(3);
		String genRec=listaReci.get(randWords);
		int brSlova=genRec.length();
		String result = genRec.substring(0, 3) + "...";
		public int getBrojPokusaja() {
			return brojPokusaja;
		}
		public void setBrojPokusaja(int brojPokusaja) {
			this.brojPokusaja = brojPokusaja;
		}
		public Enumeracija getPokusaj() {
			
			return pokusaj;
		}
		public void setPokusaj(Enumeracija pokusaj) {
			this.pokusaj = pokusaj;
		}
		
		
		public int getRandWords() {
			return randWords;
		}
		public void setRandWords(int randWords) {
			this.randWords = randWords;
		}
		public String getGenRec() {
			return genRec;
		}
		public void setGenRec(String genRec) {
			this.genRec = genRec;
		}
		public int getBrSlova() {
			return brSlova;
		}
		public void setBrSlova(int brSlova) {
			this.brSlova = brSlova;
		}
		public String getResult() {
			return result;
		}
		public void setResult(String result) {
			this.result = result;
		}
		public Option(int brojPokusaja, Enumeracija pokusaj, Random rn, ArrayList<String> listaReci, int randWords,
				String genRec, int brSlova, String result) {
			super();
			this.brojPokusaja = brojPokusaja;
			this.pokusaj = pokusaj.None;
			this.rn = rn;
			this.listaReci = listaReci;
			this.randWords = randWords;
			this.genRec = genRec;
			this.brSlova = brSlova;
			this.result = result;
		}
		public Option(){
			
		}
		
		public String GenrisanjeReci() {
			
			return genRec;
		}
		
		public int BrojSlova() {
			
			return brSlova;
		}
		
		public String pomoc() {
			
			return result;
		};
		
}
