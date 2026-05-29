package ar.edu.utn.ba.ddsi.sales_service.entities.tax;

import ar.edu.utn.ba.ddsi.sales_service.entities.product.Product;
import lombok.Getter;
import lombok.Setter;

public class EI implements Tax {

    @Getter
    @Setter
    static private double taxableIncome = 3.5;

    @Getter
    @Setter
    static private double basePricecoefficient = 4;

    @Getter
    @Setter
    static private double taxableCoefficient = 0.3;
    @Override

    public double calculateTax(Product product) {
        return product.getBasePrice()/basePricecoefficient + taxableCoefficient* taxableIncome;
    }

}
