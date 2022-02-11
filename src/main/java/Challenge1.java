public class Challenge1 {
    /**
     * Return the index of the restaurant with the greatest average portion size.
     *
     * @param restaurants A 2D array such that each element of the outer array is
     *                      an array representing the portion sizes of a restaurant's entrees (in grams).
     * @return the index of the array with greatest average portion size.
     */
    public static int largestPortions(int[][] restaurants) {
		int maxAverage = 0;
		int maxIndex = 0;
		for(int row = 0; row < restaurants.length; row++){
			int average = 0;
			for(int col = 0; col < restaurants[row].length; col++){
				average = average + restaurants[row][col];
			}
			average = average / restaurants[row].length;
			if(average > maxAverage){
				maxAverage = average;
				maxIndex = row;
			}
		}
		return maxIndex;
	}
}
