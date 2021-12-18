package tudelft.discount;

public class DiscountApplier {

    private ProductDao dao;

    public DiscountApplier (ProductDao dao) {
        this.dao = dao;
    }

    public void setNewPrices() {

        for(Product product : dao.all()) {
            if(product.getCategory().equals("BUSINESS")) {
                product.setPrice(product.getPrice() * 1.1);     // changed from * 0.9 to * 1.1
            }
            if(product.getCategory().equals("HOME")) {
                product.setPrice(product.getPrice() * 0.9);     // changed from * 1.1 to * 0.9
            }
        }

    }
}
