package entities.concretes;

import entities.abstracts.Entity;

public class Sale extends Entity {
    private double unitPrice;
    private double discountedPrice;

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    private double discount;

    public Sale() {
        super();
    }

    public Sale(int id, String gameName, double unitPrice,double discount) {
        super(id,gameName);
        this.unitPrice = unitPrice;
        this.discount = discount;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscountedPrice() {
        return unitPrice - (unitPrice*discount/100);
    }
}
