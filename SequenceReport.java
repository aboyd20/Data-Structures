package bioinformatics;

import java.util.ArrayList;

import stdlib.StdIn;
import stdlib.StdOut;
public class SequenceReport {

	public static void main(String[] args) {
		//read in file 
		StdIn.fromFile("data/sequences.txt");

		ArrayList<DNASequence> dna = new  ArrayList<DNASequence>();
		
		while(!StdIn.isEmpty())
		{
			String line = StdIn.readLine();
			String[] temp = line.split("\t");
			DNASequence theSTRAIN = new DNASequence(temp[0], temp[1]);
			dna.add(theSTRAIN);
			
		}
		for(DNASequence anotherStrain: dna ) {
			System.out.println("The name of the species is: " + anotherStrain.getSpecies());
			System.out.println("The number of bases in the sequence is: " + anotherStrain.size());
			System.out.println("The number of codons in the sequence: " + anotherStrain.size()/3);
			System.out.printf( "The percentage of the occurence for base A: %.2f%%\n", anotherStrain.getPercentA());
			System.out.printf( "The percentage of the occurence for base C: %.2f%%\n", anotherStrain.getPercentC());			
			System.out.printf( "The percentage of the occurence for base G: %.2f%%\n", anotherStrain.getPercentG());
			System.out.printf( "The percentage of the occurence for base T: %.2f%%\n", anotherStrain.getPercentT());
			
			for (int pos:anotherStrain.subsequencePositions("CCAAT")) {
				if(pos>0) {
					System.out.print("The position in the sequence where the subsequence CCAAT occurs at: " + pos + "\n");
				}
			}
			System.out.println("\nThe first tweleve amino acids with their short name are the following: ");
			
			for (String ishort :anotherStrain.aminoAcidSequenceShortName(0, 35)) {
					System.out.print("\n" + ishort);
				}
			System.out.println("\nThe full names for the Amino Acid are: ");
			for (String ilong :anotherStrain.aminoAcidSequenceFullName(0, 35)) {
				System.out.print("\n" + ilong);
			}
			System.out.println("\nNumber of Occurences of phenylalanine: " + anotherStrain.occuranceAminoAcids("K"));
			System.out.println("Number of Occurences of histidine: " + anotherStrain.occuranceAminoAcids("F"));
			System.out.println("\n");
				}
			}
				
		}
				

	
	
