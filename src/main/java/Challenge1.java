public class Challenge1 {
    /**
     * Return the index of the restaurant with the greatest average portion size.
     * In the case of a tie, return the index of the restaurant with the most entrees.
     *
     * @param restaurants A 2D array such that each element of the outer array is
     *                      an array representing the portion sizes of a restaurant's entrees (in grams).
     * @return the index of the array with greatest average portion size, or in the case of a tie,
     * with the greater number of entrees.
     */
    public static int largestPortions(int[][] restaurants) {
        double greatestAverage = 0;
        int greatestAverageIndex = 0;

        // Loop through every restaurant
        for (int i = 0, restaurantsLength = restaurants.length; i < restaurantsLength; i++) {
            int[] currentRestaurant = restaurants[i];
            double currentRestaurantAverage = getArrayAverage(currentRestaurant);

            if (currentRestaurantAverage > greatestAverage) {
                greatestAverage = currentRestaurantAverage;
                greatestAverageIndex = i;
            } else if (currentRestaurantAverage == greatestAverage) {
                if (currentRestaurant.length > restaurants[greatestAverageIndex].length) {
                    greatestAverage = currentRestaurantAverage;
                    greatestAverageIndex = i;
                }
            }
        }
        return greatestAverageIndex;
    }

    /**
     * Get the average of an array of integers.
     *
     * @param array The array to take the average of.
     * @return The average (mean) of the array.
     */
    private static double getArrayAverage(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return (double) sum / array.length;
    }
}
