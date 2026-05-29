package ar.edu.utn.ba.ddsi.sales_service.entities.tax;

import ar.edu.utn.ba.ddsi.sales_service.entities.product.Product;
import lombok.Getter;
import lombok.Setter;

public class EO implements Tax {
    @Getter
    @Setter
    static private double taxableIncome = 4;

    @Getter
    @Setter
    static private double basePricecoefficient = 0.5;

    @Getter
    @Setter
    static private double taxableCoefficient = 4;

    @Override
    public double calculateTax(Product product) {
        return product.getBasePrice()* basePricecoefficient + taxableCoefficient*taxableIncome;
    }
}
