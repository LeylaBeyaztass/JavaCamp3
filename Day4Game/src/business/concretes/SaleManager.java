package business.concretes;

import business.abstracts.SaleService;
import entities.concretes.Sale;

public class SaleManager implements SaleService {
    @Override
    public void add(Sale sale) {
        System.out.println("Fiyatı " + sale.getUnitPrice() + "olan" +
                sale.getGameName()+ " oyununu , yüzde " +
                sale.getDiscount()+ " indirim oranıyla " +
                " toplam " + sale.getDiscountedPrice()+ " fiyatına aldınız. Tebrikler!");
    }
}
