/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

public class Library {
    public static void main(String[] args) {

        /*  Adding a new Restaurant*/
        Restaurant addRestaurant = new Restaurant("InDoor");
        addRestaurant.setStars(3);
        addRestaurant.setPrice(4);
        addRestaurant.addReview("Amazing Restaurant" , "Hana", 5);
        addRestaurant.addReview("Not Good" , "Aseel", 1);
        addRestaurant.addReview("Not Good" , "Aseel", 1); // Try duplication
        addRestaurant.addReview("Normal" , "Ahmed", 2);
        System.out.println(addRestaurant);

        /*  Adding a new Shop*/
        Shop addShop = new Shop("Shoneze" , "Nice place");
        addShop.setStars(3);
        addShop.setPrice(4);
        addShop.addReview("Amazing Shop" , "Hana", 5);
        addShop.addReview("Not Good" , "Aseel", 1);
        addShop.addReview("Normal" , "Ahmed", 3);
        System.out.println(addShop);

        /*  Adding a new Theater WITHOUT movies review*/
        Theater addTheater = new Theater("Grand cinema");
        addTheater.setStars(3);
        addTheater.addMovie("Thor");
        addTheater.addMovie("Star wars");
        addTheater.addMovie("Star wars");   // Try duplication
        addTheater.removeMovie("Thor");
        addTheater.addMovie("Gladiator");
        addTheater.addMovieWithReview("WOW" , "Hana", 5 , "Star wars");
        addTheater.addMovieWithReview("WOW" , "Hana", 5 , "Star wars"); // Try duplication
        addTheater.addReview("Not Good" , "Aseel", 2);
        addTheater.addMovieWithReview("Normal" , "Ahmed", 3, "Thor");
        System.out.println(addTheater);
    }
}