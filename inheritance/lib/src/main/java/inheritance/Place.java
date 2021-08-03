package inheritance;

import java.util.ArrayList;

import static org.apache.commons.math3.util.Precision.round;

public abstract class Place {

    private String name;
    private double stars;
    private ArrayList<String> review = new ArrayList<>();

    public Place(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public double getStars() {
        return stars;
    }
    public ArrayList getReview() {
        return review;
    }

    /* Calculate Stars */
    private int starsCounter = 0;
    private int starsTotal = 0;
    public void setStars(int stars) {
        if (stars >= 0 && stars <=5){
            starsCounter++;
            starsTotal = starsTotal + stars;
            this.stars = round((double) starsTotal/starsCounter , 2);
        } else {
            System.out.println("Please enter a valid number");
        }
    }

    /* addReview and change the Stars */
    public void addReview(String body, String author ,int numberOfStars) {
        if (review.isEmpty()) {
            Review newReview = new Review( body ,  author,  numberOfStars);
            setStars(numberOfStars);
            review.add(newReview.toString());
        } else {
            boolean NotExist = true;
            for (int i = 0; i < review.size(); i++) {
                if (review.get(i).contains(author)){
                    System.out.println("You have already added");
                    NotExist = false;
                    break;
                }
            }
            if (NotExist) {
                Review newReview = new Review( body ,  author,  numberOfStars);
                setStars(numberOfStars);
                review.add(newReview.toString());
            }
        }
    }
}
