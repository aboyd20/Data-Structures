package program4;

import java.util.*;


import stdlib.*;

public class CompareBSTandAVL {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		Program4AVLTree<String, Long> x = new Program4AVLTree<String, Long>();
		Program4BST<String, Long> y = new Program4BST<String, Long>();

		StdIn.fromFile("data/tale.txt");
		String text = StdIn.readAll();
		String[] words = text.toLowerCase().split(" ");
		for (String word: words) {
			if(x.get(word) == null) {
				// A null entry in an ST means that no value is stored for that key.
				x.put(word, (long) 1);
			} else {
				x.put(word, x.get(word) + 1 );
			}
			if(y.get(word) == null) {
				// A null entry in an ST means that no value is stored for that key.
				y.put(word, (long) 1);
			} else {
				y.put(word, y.get(word) + 1);
			}
		}
		System.out.println("The number of compares in a AVL for the tale.txt file: " + x.getCount());
		System.out.println("The number of compares in a BST for the tale.txt file: " + y.getCount());

		Program4AVLTree<Integer, Boolean> a = new Program4AVLTree<Integer, Boolean>();
		Program4BST<Integer, Boolean> b = new Program4BST<Integer, Boolean>();

		ArrayList<Integer> mylist = new ArrayList<>();

		String filePath = "data/8kints.txt";
		StdIn.fromFile(filePath);
		while (StdIn.hasNextLine()) {
			String fileintegers = StdIn.readLine();
			String[] lineArrays = fileintegers.split("\n");
			mylist.add(Integer.parseInt(lineArrays[0].trim()));
		}
			for (Integer j: mylist) {
				if(j < 0) {
					a.put(j, false); 
					b.put(j, false);
				}
				else
				{
					a.put(j, true); 
					b.put(j, true);
				}
			}
		System.out.println("The number of compares from unsorted AVL: " + a.getCount());
		System.out.println("The number of compares from unsorted BST: " + b.getCount());	
		//
		Collections.sort(mylist); 
		Program4AVLTree<Integer, Boolean> c = new Program4AVLTree<Integer, Boolean>();
		Program4BST<Integer, Boolean> d = new Program4BST<Integer, Boolean>();
		for (Integer r: mylist) {
			if(r < 0) {
				c.put(r, false); 
				d.put(r, false);
			}
			else
			{
				c.put(r, true); 
				d.put(r, true);
			}
		}
		System.out.println("The number of compares from sorted AVL: " + c.getCount());
		System.out.println("The number of compares from sorted BST: " + d.getCount());	
	} 
}