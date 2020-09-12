package program2;

import algs31.*;
import stdlib.*;
import stdlib.StdAudio;


public class PlaySimpleSong {

	public static void main(String[] args) {
		// build and read symbol table for note names and frequency 
		BinarySearchST<String, Double> notes = new BinarySearchST <String, Double>();
		StdIn.fromFile("data/notes_frequencies.txt");

		while(!StdIn.isEmpty())
		{
			String line = StdIn.readLine();
			String[] temp = line.split("\t");
			notes.put(temp[0].trim(),Double.parseDouble(temp[1]));

		}
		// read in song file 

		//StdIn.fromFile("data/sample_simple_song.txt");
		StdIn.fromFile("data/lotr.txt");

		for (int i = 0; !StdIn.isEmpty(); i++) {
			String line = StdIn.readLine();
			String[] music = line.split(" ");
			String note = music[0];
			Double duration = Double.parseDouble(music[1]);
			playTone(notes.get(note), duration);
		}
	}
	public static void playTone(double frequency, double duration) {
		final int sliceCount = (int) (StdAudio.SAMPLE_RATE * duration);
		final double[] slices = new double[sliceCount+1];
		for (int i = 0; i <= sliceCount; i++) {
			slices[i] = Math.sin(2 * Math.PI * i * frequency / StdAudio.SAMPLE_RATE);
		}
		StdAudio.play(slices);
	}

}