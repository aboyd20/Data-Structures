package lecture2;

/**
 * This is a skeleton file for your homework. Edit the sections marked TODO. You
 * may also edit the function "main" to test your code.
 *
 * You must not change the declaration of any method. This will be true of every
 * skeleton file I give you.
 *
 * For example, you will get zero points if you change the line
 * <pre>
 *     public static int numUnique (double[] list) {
 * </pre>
 * to something like
 * <pre>
 *     public static void numUnique (double[] list) {
 * </pre>
 * or
 * <pre>
 *     public static int numUnique (double[] list, int i) {
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

public class Homework2 {
    
    /**
     * numUnique returns the number of unique values in an array of doubles.
     * Unlike the previous questions, the array may be empty and it may contain
     * duplicate values. Also unlike the previous questions, you can assume the
     * array is sorted.
     *
     * Your solution must go through the array exactly once. Your solution must
     * not call any other functions. Here are some examples (using "=="
     * informally):
     *
     * <pre>
     *
     *   8 == numUnique(new double[] { 11, 11, 11, 11, 22, 33, 44, 44, 44, 44, 44, 55, 55, 66, 77, 88, 88 })
     *
     * </pre>
     */
	public static int numUnique (double[] list) {
		int uniquenum = 0;

		for (int i = 1; i < list.length; i++){
			if (i != list.length -1){
				if(list[i] != list[i+1]){
					uniquenum++;
				}
			} else {
				uniquenum++;
			}
		}
		return uniquenum;
	}

    /**
     * removeDuplicates returns a new array containing the unique values in the
     * array. There should not be any extra space in the array --- there should
     * be exactly one space for each unique element (Hint: numUnique tells you
     * how big the array should be). You may assume that the list is sorted, as
     * you did for numUnique.
     *
     * Your solution may call numUnique, but should not call any other
     * functions. After the call to numUnique, you must go through the array
     * exactly one more time. Here are some examples (using "==" informally):
     *
     * <pre>
     *
     * double noDuplicates[] = removeDuplicates (new double[] { 11, 11, 11, 11, 22, 33, 44, 44, 44, 44, 44, 55, 55, 66, 77, 88, 88 });
     *
     * </pre>
     */
    
	public static double[] removeDuplicates (double[] list) {
		int lengthofunique = numUnique(list); //takes the number of unique numbers in the list and store in length of unique
		double[] uniquelist = new double[lengthofunique]; //creating a double array structure with called uniqueList

		int indexUniqueList = 1;
		uniquelist[0] = list[0];

		for (int indexList = 1; indexList < list.length-1; indexList++){
			if (list[indexList] == list[indexList - 1]){
			}
			else{
				uniquelist[indexUniqueList] = list[indexList];
				indexUniqueList++;
			}
		}
		return uniquelist; 
	}
    

	/**
	 * The following tests below should pass if your methods above are correct.
	 * It is required for you to write 5 more tests for each method to ensure your 
	 * methods above are written correctly.
	 */
	public static void main(String[] args) {
		
        // minPosition Test sample
        double uniqueNumbers = numUnique(new double[] { 11, 11, 11, 11, 22, 33, 44, 44, 44, 44, 44, 55, 55, 66, 77, 88, 88 });
        if (uniqueNumbers == 8) {
            System.out.println("The uniqueNumbers test was successful.");
        } else {
            System.out.println("The uniqueNumbers test was not successful.");
        }

        // removeDuplicates Test sample
		double noDuplicates[] = removeDuplicates (new double[] { 11, 11, 11, 11, 22, 33, 44, 44, 44, 44, 44, 55, 55, 66, 77, 88, 88 });
		if (noDuplicates.length > 0) {
			System.out.println("The removeDuplicates test was successful.");
			for (double duplicate : noDuplicates) {
				System.out.println("Value ["+duplicate+"]");
			}
		} else {
			System.out.println("The removeDuplicates test was not successful.");
		}

	}

}
