package week01;



/**
 * This is a skeleton file for your homework. Edit the sections marked TODO. You
 * may also edit the function "main" to test your code.
 *
 * You must not change the declaration of any method. This will be true of every
 * skeleton file I give you.
 *
 * For example, you will get zero points if you change the line
 * <pre>
 *     public static double minValue (double[] list) {
 * </pre>
 * to something like
 * <pre>
 *     public static void minValue (double[] list) {
 * </pre>
 * or
 * <pre>
 *     public static double minValue (double[] list, int i) {
 * </pre>
 * 
 * Each of the functions below (minValue, minPosition, distanceBetweenMinAndMax) 
 * is meant to be SELF CONTAINED. This means that you should use no other functions
 * or classes. You should not use any HashSets or ArrayLists, 
 * or anything else! In addition, each of your functions should go
 * through the argument array at most once. The only exception to this
 * removeDuplicates, which is allowed to call numUnique and then go through the
 * array once after that.
 */

public class Homework1 {

	/**
	 * minValue returns the minimum value in an array of doubles. You can assume
	 * the array is nonempty and has no duplicates. Your solution must go
	 * through the array exactly once. Your solution must not call any other
	 * functions. Here are some examples (using "==" informally):
	 *
	 * <pre>
	 *   -7  == minValue (new double[] { 1, -4, -7, 7, 8, 11 })
	 * </pre>
	 */
	public static double minValue (double[] list) { 

		double min = list[0];
		
		for( int i = 1; i < list.length; i++){
			if (list[i] < min) min = list[i];

		}
		return min;
	}

	/**
	 * minPosition returns the position of the minimum value in an array of
	 * doubles. The first position in an array is 0 and the last is the
	 * array.length-1.
	 *
	 * You can assume the array is nonempty and has no duplicates. Your solution
	 * must go through the array exactly once. Your solution must not call any
	 * other functions. Here are some examples (using "==" informally):
	 *
	 * <pre>
	 *   0 == minPosition(new double[] { -13, -4, -7, 7, 8, 11 })
	 * </pre>
	 */
	public static int minPosition (double[] list) { 

		int indexofmin = 0;
		double min = list[0];
		
		for( int i = 1; i < list.length; i++){
			if (list[i] < min) {
				min = list[i];
				indexofmin = i;
			}

		}
		return indexofmin;
	}

	/**
	 * distanceBetweenMinAndMax returns difference between the minPosition and
	 * the maxPosition in an array of doubles.
	 *
	 * You can assume the array is nonempty and has no duplicates. Your solution
	 * must go through the array exactly once. Your solution must not call any
	 * other functions. Here are some examples (using "==" informally):
	 *
	 * <pre>
	 *   1 == distanceBetweenMinAndMax(new double[] { 1, -4, -7, 7, 8, 11, -9 }) // -9,11
	 * </pre>
	 */
	public static int distanceBetweenMinAndMax (double[] list) {
		
		
		int indexofmin = 0;
		int indexofmax = 0;
		double min = list[0];
		double max = list[0];
		
		int distance;
		
		for( int i = 1; i < list.length; i++){
			if (list[i] < min) {
				min = list[i];
				indexofmin = i;
			}
			if (list[i] > max){
				max = list[i];
				indexofmax = i;
			}
		}
		distance = Math.abs(indexofmax-indexofmin);
		
		return distance;
	}

	/**
	 * The following tests below should pass if your methods above are correct.
	 * It is required for you to write 5 more tests for each method to ensure your 
	 * methods above are written correctly.
	 */
	public static void main(String[] args) {
		
		// minValue Test sample
		double minValue = minValue (new double[] { 1, -4, -7, 7, 8, 11 });
		if (minValue == -7) {
			System.out.println("The minValue test was successful.");
		} else {
			System.out.println("The minValue test was not successful.");
		}
		
		// minPosition Test sample
		double minPosition = minPosition(new double[] { -13, -4, -7, 7, 8, 11 });
		if (minPosition == 0) {
			System.out.println("The minPosition test was successful.");
		} else {
			System.out.println("The minPosition test was not successful.");
		}

		// distanceBetweenMinAndMax Test sample
		double distance = distanceBetweenMinAndMax(new double[] { 1, -4, -7, 7, 8, 11, -9 });
		if (distance == 1) {
			System.out.println("The distanceBetweenMinAndMax test was successful.");
		} else {
			System.out.println("The distanceBetweenMinAndMax test was not successful.");
		}
		
		/** 
		 * Below are my test samples 
		 */
		
		//  first for minValue Test sample
		double minValue1 = minValue (new double[] { 1, -13, -7, 7, 8, 11 });
		if (minValue1 == -13) {
			System.out.println("The minValue test was successful.");
		} else {
			System.out.println("The minValue test was not successful.");
		}
	
		//  second for minValue Test sample
		double minValue2 = minValue (new double[] { 8934,-12, -10, 3, 45, 7, -99, 12, 34 });
		if (minValue2 == -99) {
			System.out.println("The minValue test was successful.");
		} else {
			System.out.println("The minValue test was not successful.");
		}
		
	    //  third for minValue Test sample
		double minValue3 = minValue (new double[] { 124, 13, 87, 12, 81, 111 });
		if (minValue3 == 12) {
			System.out.println("The minValue test was successful.");
		} else {
			System.out.println("The minValue test was not successful.");
		}
		
        //  fourth for minValue Test sample
		double minValue4 = minValue (new double[] { 51, 23, 89, 45, 12, -13, -34, 7, -8, 11 });
		if (minValue4 == -34) {
			System.out.println("The minValue test was successful.");
		} else {
			System.out.println("The minValue test was not successful.");
		}
	   
		//  fifth for minValue Test sample
		double minValue5 = minValue (new double[] { 8, 90, 7, -131, 3 });
		if (minValue5 == -131) {
			System.out.println("The minValue test was successful.");
		} else {
				System.out.println("The minValue test was not successful.");
			}	
		//  First minPosition Test sample
		double minPosition1 = minPosition(new double[] { 13, -4, -7, 7, 8, 11 });
		if (minPosition1 == 2) {
			System.out.println("The minPosition test was successful.");
		} else {
			System.out.println("The minPosition test was not successful.");
		}	
		// Second minPosition Test sample
		double minPosition2 = minPosition(new double[] { -13, -4, -7, 7, -18, 11 });
		if (minPosition2 == 4) {
			System.out.println("The minPosition test was successful.");
		} else {
			System.out.println("The minPosition test was not successful.");
		}
		// Third minPosition Test sample
		double minPosition3 = minPosition(new double[] { 13, -4, -7, 8, 11, -89, 45, -87 });
		if (minPosition3 == 5) {
			System.out.println("The minPosition test was successful.");
		} else {
			System.out.println("The minPosition test was not successful.");
		}
		// Fourth minPosition Test sample
		double minPosition4 = minPosition(new double[] { 13, 4, -7, 7, 8, 11, 1, -6 });
		if (minPosition4 == 2) {
			System.out.println("The minPosition test was successful.");
		} else {
			System.out.println("The minPosition test was not successful.");
		}
		// minPosition Test sample
		double minPosition5 = minPosition(new double[] { 13, -4, 17, 7, 8, 11 });
		if (minPosition5 == 1) {
			System.out.println("The minPosition test was successful.");
		} else {
			System.out.println("The minPosition test was not successful.");
		}
		
		// First distanceBetweenMinAndMax Test sample
		double distance1 = distanceBetweenMinAndMax(new double[] { 1, -4, -7, 7, 8, 11, 9 });
		if (distance1 == 3) {
			System.out.println("The distanceBetweenMinAndMax test was successful.");
		} else {
			System.out.println("The distanceBetweenMinAndMax test was not successful.");
		}
		
		// Second distanceBetweenMinAndMax Test sample
		double distance2 = distanceBetweenMinAndMax(new double[] { 13, -4, -7, 7, 8, 11, -9 });
		if (distance2 == 6) {
			System.out.println("The distanceBetweenMinAndMax test was successful.");
		} else {
			System.out.println("The distanceBetweenMinAndMax test was not successful.");
		}
		// Third distanceBetweenMinAndMax Test sample
		double distance3 = distanceBetweenMinAndMax(new double[] { 1, -14, -7, 7, 8, 11, -9 });
		if (distance3 == 4) {
			System.out.println("The distanceBetweenMinAndMax test was successful.");
		} else {
			System.out.println("The distanceBetweenMinAndMax test was not successful.");
		}
		// Fourth distanceBetweenMinAndMax Test sample
		double distance4 = distanceBetweenMinAndMax(new double[] { 1, -4, -37, 7, 58, 11, -9 });
		if (distance4 == 2) {
			System.out.println("The distanceBetweenMinAndMax test was successful.");
		} else {
			System.out.println("The distanceBetweenMinAndMax test was not successful.");
		}
		// Fifth distanceBetweenMinAndMax Test sample
		double distance5 = distanceBetweenMinAndMax(new double[] { -21, -4, -7, 27, 8, 11 });
		if (distance5 == 3) {
			System.out.println("The distanceBetweenMinAndMax test was successful.");
		} else {
			System.out.println("The distanceBetweenMinAndMax test was not successful.");
		}
		
	}

	}



