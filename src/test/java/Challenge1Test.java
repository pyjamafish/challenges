import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Challenge1Test {

    @Test
    void testFirstRestaurantGreatest() {
        int[][] restaurants = {
                {555, 472, 472, 520},
                {347, 430, 396, 385, 390, 395},
                {200, 205, 210, 215, 230, 230, 240, 215}
        };
        assertEquals(0, Challenge1.largestPortions(restaurants));
    }

    @Test
    void testMiddleRestaurantGreatest() {
        int[][] restaurants = {
                {116, 127, 169, 120, 160},
                {149, 154, 171, 175, 229},
                {174, 175, 187, 200, 207},
                {102, 124, 142, 182, 195}
        };
        assertEquals(2, Challenge1.largestPortions(restaurants));
    }

    @Test
    void testSingleRestaurant() {
        int[][] restaurants = {
                {116, 127, 169, 120, 160}
        };
        assertEquals(0, Challenge1.largestPortions(restaurants));
    }

    @Test
    void testTiedRestaurants() {
        int[][] restaurants = {
                {102, 124, 142, 182, 195},
                {102, 124, 142, 182, 195, 149}
        };
        assertEquals(1, Challenge1.largestPortions(restaurants));
    }
}