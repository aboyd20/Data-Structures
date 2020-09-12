package program1;

import algs31.*;
import stdlib.*;

public class ComputeGPA {

	public static void main(String[] args) {

		// create a Binary Search Symbol Table
		
		BinarySearchST<String, Double> GPA = new BinarySearchST <String, Double>();

		//manual input of symbol table 

		GPA.put("A+", 4.33);
		GPA.put("A",  4.00);
		GPA.put("A-", 3.67);
		GPA.put("B+", 3.33);
		GPA.put("B",  3.00);
		GPA.put("B-", 2.67);
		GPA.put("C+", 2.33);
		GPA.put("C",  2.00);
		GPA.put("C-", 1.67);
		GPA.put("D",  1.00);
		GPA.put("F",  0.00);

		//read in file 

		StdIn.fromFile("data/a1grades.txt");

		//initialize variables

		double GPAsum  = 0.0;
		int counter = 0;
		int credit_unit = 4;
		double final_gpa = 0.0;

		while (StdIn.hasNextLine()) {
			String letter = StdIn.readLine();
			double point = GPA.get(letter) * credit_unit;
			GPAsum = point + GPAsum;
			counter += 1; 
		}
		// computing GPA
		// Added additional if statement in case reading an empty file

		if (counter != 0 && credit_unit != 0) {
			final_gpa = GPAsum / (counter * credit_unit);
		}
		else {
			final_gpa = 0.0;
		}
		StdOut.println("The Final GPA is: " + final_gpa);



	}

}
