package bioinformatics;

import java.util.ArrayList;

import algs34.LinearProbingHashST;

public class DNASequence {
	private static final String[] CODONS = {"AAA","AAC","AAG","AAT","ACA","ACC","ACG","ACT","AGA","AGC","AGG","AGT","ATA","ATC","ATG","ATT","CAA","CAC","CAG","CAT","CCA","CCC","CCG","CCT","CGA","CGC","CGG","CGT","CTA","CTC","CTG","CTT","GAA","GAC","GAG","GAT","GCA","GCC","GCG","GCT","GGA","GGC","GGG","GGT","GTA","GTC","GTG","GTT","TAA","TAC","TAG","TAT","TCA","TCC","TCG","TCT","TGA","TGC","TGG","TGT","TTA","TTC","TTG","TTT"};
	private static final String[] ONE_LETTER = {"K", "N", "K", "N", "T", "T", "T", "T", "R", "S", "R", "S", "I", "I", "M", "I", "Q", "H", "Q", "H", "P", "P", "P", "P", "R", "R", "R", "R", "L", "L", "L", "L", "E", "D", "E", "D", "A", "A", "A", "A", "G", "G", "G", "G", "V", "V", "V", "V", "X", "Y", "X", "Y", "S", "S", "S", "S", "X", "C", "W", "C", "L", "F", "L", "F"};
	private LinearProbingHashST<String, String> mySymbolTable = lphST();
	private String species;
	private String sequence;
	private Double percentA = 0.0;
	private Double percentC = 0.0;
	private Double percentG = 0.0;
	private Double percentT = 0.0;

	
	public String getSequence() {
		return sequence;
	}
	
	public String getSpecies() {
		return species;
	}

	public Double getPercentA() {
		return percentA;
	}

	public Double getPercentC() {
		return percentC;
	}

	public Double getPercentG() {
		return percentG;
	}

	public Double getPercentT() {
		return percentT;
	}

	public DNASequence(String species, String sequence) {
		//this is our constructor 
		this.species  = species;
		this.sequence = sequence;
		percentbase();
	}

	private int countAmino(char s) {
		int count = 0;
		for (int i = 0; i < sequence.length(); i++ ){
			if( sequence.charAt(i) == s) {
				count += 1;
			}
		}
		return count;
	}
	public int countA() {
		//counts the number of A's in the sequence
		return countAmino('A');
	}
	public int countC() {
		//counts the number of C's in the sequence
		return countAmino('C');
	}
	public int countG() {
		//counts the number of G's in the sequence

		return countAmino('G');
	}		
	public int countT() {
		//counts the number of T's in the sequence
		return countAmino('T');
	}	

	public int size() {
		return sequence.length();
	}

	static LinearProbingHashST<String, String> lphST()
	{
		LinearProbingHashST<String, String> mySymbolTable = new LinearProbingHashST<>(); 

		for (int i = 0; i < ONE_LETTER.length; i++) 
		{
			mySymbolTable.put(CODONS[i], ONE_LETTER[i]);
		}
		return mySymbolTable;
	}
	public Iterable<String>aminoAcidSequenceFullName(int start, int end){
		ArrayList<String> aminoFullNameCollection = new ArrayList<String>(size());
		for (int i = start; i <=end; i+=3) {
			String codon = sequence.substring(i, i+3);
			aminoFullNameCollection.add(AminoAcid.fullName(mySymbolTable.get(codon)));
		}
		return aminoFullNameCollection;		
	}


	public Iterable<String>aminoAcidSequenceShortName(int start, int end){
		ArrayList<String> aminoShortNameCollection = new ArrayList<String>(size());
		for (int i = start; i <=end; i+=3) {
			String codon = sequence.substring(i, i+3);
			aminoShortNameCollection.add(AminoAcid.shortName(mySymbolTable.get(codon)));
		}
		return aminoShortNameCollection;		
	}

	public Iterable<Integer> subsequencePositions(String subsequence){
		// we will start at index = 0 for the first occurrence 
		ArrayList<Integer> subposition = new ArrayList<Integer>(size());
		
		int ssposition = 0;
		
		while(ssposition !=-1) {
			
			ssposition = getSequence().indexOf(subsequence,ssposition);
			if(ssposition != -1) {
				subposition.add(ssposition);
				ssposition += subsequence.length();
			}
			
		}
		return subposition;		

}
	public void percentbase() {
		
		percentA = (countA()/(double) size()) * 100;
		percentC = (countC()/(double) size()) * 100;
		percentG = (countG()/(double) size()) * 100;
		percentT = (countT()/(double) size()) * 100;
	}
	
	public Integer occuranceAminoAcids(String letter){
		int counter = 0;
		for(int i = 0; i <= sequence.length()-1; i+=3 ) {
			String codon = sequence.substring(i, i+3);
			if(mySymbolTable.get(codon).equals(letter)) {
				counter++;
			}
		}
		return counter;
	}
	}






