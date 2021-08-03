/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    /*  Test restaurant Class - no Reviews */
    @Test void testRestaurantClass() {
        Restaurant testRestaurant = new Restaurant("Fire Fly");
        testRestaurant.setStars(5);
        testRestaurant.setPrice(5);
        String result = "Restaurant name: Fire Fly, Total Rate: 5.0, price category: $$$$$, Review: No review added.";
        assertEquals(result , testRestaurant.toString());
    }

    /*  Test Reviews Class */
    @Test void testReviewClass() {
        Review testReview = new Review( "Good one" ,  "Aseel",  5);
        String result = "{Author: Aseel, body: Good one, Rate: 5}";
        assertEquals(result , testReview.toString() );
    }

    /*  Test restaurant and Reviews Class association */
    @Test void testRestaurantWithReview() {
        Restaurant restaurantWithReview = new Restaurant("Abu Jbarah");
        restaurantWithReview.setStars(2);
        restaurantWithReview.setPrice(5);
        restaurantWithReview.addReview("Normal" , "Ahmed", 2);
        restaurantWithReview.addReview("Normal" , "Ahmed", 0);
        restaurantWithReview.addReview("Not Bad" , "Aseel", 3);
        String result = "Restaurant name: Abu Jbarah, Total Rate: 2.33, price category: $$$$$, Review: [{Author: Ahmed, body: Normal, Rate: 2}, {Author: Aseel, body: Not Bad, Rate: 3}]";
        assertEquals(result , restaurantWithReview.toString() );
    }

    /*  Test Shop Class - no Reviews */
    @Test void testShopClass() {
        Shop testShop = new Shop("Shoneze", "Nice place");
        testShop.setStars(3);
        testShop.setPrice(4);
        String result = "Shop name: Shoneze, Total Rate: 3.0, price category: $$$$, Descriptions: Nice place, Review: No review added.";
        assertEquals(result , testShop.toString());
    }

    /*  Test restaurant and Reviews Class association */
    @Test void testShopWithReview() {
        Shop testShop = new Shop("Shoneze", "Nice place");
        testShop.setStars(3);
        testShop.setPrice(4);
        testShop.addReview("Amazing Shop" , "Hana", 5);
        testShop.addReview("Not Good" , "Aseel", 1);
        testShop.addReview("Normal" , "Ahmed", 3);
        String result = "Shop name: Shoneze, Total Rate: 3.0, price category: $$$$, Descriptions: Nice place, Review: [{Author: Hana, body: Amazing Shop, Rate: 5}, {Author: Aseel, body: Not Good, Rate: 1}, {Author: Ahmed, body: Normal, Rate: 3}]";
        assertEquals(result , testShop.toString());
    }

    /*  Test Theater (add/remove movies) - no Reviews */
    @Test void testTheaterClass() {
        Theater testTheater = new Theater("Grand cinema");
        testTheater.setStars(3);
        testTheater.addMovie("Thor");
        testTheater.addMovie("Star wars");
        testTheater.addMovie("Star wars"); // Try duplication
        testTheater.removeMovie("Thor");
        testTheater.addMovie("Gladiator");
        String result = "Theater name: Grand cinema, Total Rate: 3.0, Today's Movies: [Star wars, Gladiator], Review: No review added.";
        assertEquals(result , testTheater.toString());
    }

    /*  Test Theater and Reviews Class association */
    @Test void testTheaterWithReview() {
        Theater testTheater = new Theater("Grand cinema");
        testTheater.setStars(3);
        testTheater.addMovie("Thor");
        testTheater.addMovie("Star wars");
        testTheater.addMovie("Star wars"); // Try duplication
        testTheater.removeMovie("Thor");
        testTheater.addMovie("Gladiator");
        testTheater.addReview("Not Good", "Aseel", 2);
        testTheater.addReview("Normal", "Ahmed", 3);
        String result = "Theater name: Grand cinema, Total Rate: 2.67, Today's Movies: [Star wars, Gladiator], Review: [{Author: Aseel, body: Not Good, Rate: 2}, {Author: Ahmed, body: Normal, Rate: 3}]";
        assertEquals(result , testTheater.toString());
    }

    /*  Test Theater and movies Reviews method addMovieWithReview() */
    @Test void testTheaterWithMoviesReview() {
        Theater testTheater = new Theater("Grand cinema");
        testTheater.setStars(3);
        testTheater.addMovie("Thor");
        testTheater.addMovie("Star wars");
        testTheater.addMovie("Star wars"); // Try duplication
        testTheater.removeMovie("Thor");
        testTheater.addMovie("Gladiator");
        testTheater.addMovieWithReview("WOW", "Hana", 5, "Star wars");
        testTheater.addMovieWithReview("WOW", "Hana", 5, "Star wars"); // Try duplication
        testTheater.addReview("Not Good", "Aseel", 2);
        testTheater.addMovieWithReview("Normal", "Ahmed", 3, "Thor");
    String result = "Theater name: Grand cinema, Total Rate: 3.25, Today's Movies: [Star wars, Gladiator], Review: [{Author: Hana, body: WOW, Rate: 5, Watched movie: Star wars}, {Author: Aseel, body: Not Good, Rate: 2}, {Author: Ahmed, body: Normal, Rate: 3, Watched movie: Thor}]";
        assertEquals(result , testTheater.toString());
    }
}
