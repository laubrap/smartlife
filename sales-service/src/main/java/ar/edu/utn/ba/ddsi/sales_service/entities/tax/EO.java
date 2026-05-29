package ar.edu.utn.ba.ddsi.sales_service.entities.tax;

import ar.edu.utn.ba.ddsi.sales_service.entities.product.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EO implements Tax {

    static private double taxableIncome = 4;

    static private double basePricecoefficient = 0.5;

    static private double taxableCoefficient = 4;

    @Override
    public double calculateTax(Product product) {
        return product.getBasePrice()* basePricecoefficient + taxableCoefficient*taxableIncome;
    }
}
