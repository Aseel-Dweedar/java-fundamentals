package inheritance;

public class Restaurant extends PriceCategoryPlace{
    public Restaurant(String name) {
        super(name);
    }
    @Override
    public String toString() {
        if (getReview().isEmpty()) {
            return "Restaurant name: " + getName() + ", Total Rate: " + getStars() + ", price category: " + getPrice() + ", Review: No review added.";
        } else {
            return "Restaurant name: " + getName() + ", Total Rate: " + getStars() + ", price category: " + getPrice() + ", Review: " + getReview();
        }
    }
}
