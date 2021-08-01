package inheritance;

import static org.apache.commons.math3.util.Precision.round;

public class Restaurant {

    private String name;
    private double stars;
    private String price;
    private String review;

    public Restaurant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String getPrice() {
        return price;
    }
    public double getStars() {
        return stars;
    }
    public String getReview() {
        return review;
    }

    /* Calculate Price */
    public void setPrice(int price) {
        if (price >= 0 && price <=5){
        String setPrice = "";
            for (int i = 0; i < price; i++) {
                setPrice = setPrice + "$";
            }
            this.price = setPrice;
        } else {
            this.price = "Price Not Available";
        }
    }

    /* Calculate Stars */
    private int starsCounter = 0;
    private int starsTotal = 0;
    public void setStars(int stars) {
        if (stars >= 0 && stars <=5){
            starsCounter++;
            starsTotal = starsTotal + stars;
            this.stars = round((double) starsTotal/starsCounter , 2);
//            this.stars = (double) starsTotal/starsCounter;
        } else {
            System.out.println("Please enter a valid number");
        }
    }

    /* addReview and change the Stars */
    public void addReview(String body, String author ,int numberOfStars){
        if (this.review != null) {
            System.out.println("Already added");
        } else {
            Review newReview = new Review( body ,  author,  numberOfStars);
            this.setStars(numberOfStars);
            this.review = newReview.toString();
        }
    }

    @Override
    public String toString() {
        if (this.review == null) {
            return "Name: " + name + ", Total Rate: " + stars + ", price category: " + price + ", Review: No review added.";
        } else {
            return "Name: " + name + ", Total Rate: " + stars + ", price category: " + price + ", Review: " + this.review;
        }
    }
}
