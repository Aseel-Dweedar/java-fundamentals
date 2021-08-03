package inheritance;

public class Shop extends PriceCategoryPlace {

    private String descriptions;
    public Shop (String name  , String descriptions) {
        super(name);
        this.descriptions = descriptions;
    }

    public String getDescriptions() {
        return descriptions;
    }
    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    @Override
    public String toString() {
        if (getReview().isEmpty()) {
            return "Shop name: " + getName() + ", Total Rate: " + getStars() + ", price category: " + getPrice() +  ", Descriptions: " + getDescriptions() + ", Review: No review added.";
        } else {
            return "Shop name: " + getName() + ", Total Rate: " + getStars() + ", price category: " + getPrice() +  ", Descriptions: " + getDescriptions() + ", Review: " + getReview();
        }
    }

}
