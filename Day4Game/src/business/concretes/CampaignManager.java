package business.concretes;

import business.abstracts.CampaignService;
import entities.concretes.Campaign;


public class CampaignManager implements CampaignService {

    @Override
    public void add(Campaign campaign) {
        System.out.println(campaign.getCampaignCode() + "numaralı kampanya kodunu kullandınız. Tebrikler");
    }
}
