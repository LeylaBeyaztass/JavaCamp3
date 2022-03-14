package entities.concretes;

import entities.abstracts.Entity;

public class Campaign extends Entity {

    private String campaignCode;
    private double discount;
    public Campaign() {
        super();
    }

    public Campaign(int id, String gameName, String campaignCode, double discount) {
        super(id,gameName);
        this.campaignCode = campaignCode;
        this.discount = discount;
    }

    public String getCampaignCode() {
        return campaignCode;
    }

    public void setCampaignCode(String campaignCode) {
        this.campaignCode = campaignCode;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}


