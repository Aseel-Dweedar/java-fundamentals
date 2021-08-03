package inheritance;

public abstract class PriceCategoryPlace extends Place {

    private String price;
    public PriceCategoryPlace(String name) {
        super(name);
    }

    public String getPrice() {
        return price;
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

}