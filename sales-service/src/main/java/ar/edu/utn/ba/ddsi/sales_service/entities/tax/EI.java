package ar.edu.utn.ba.ddsi.sales_service.entities.tax;

import ar.edu.utn.ba.ddsi.sales_service.entities.product.Product;

public class EI implements Tax {


    static private double taxableIncome = 3.5;

    static private double basePricecoefficient = 4;

    static private double taxableCoefficient = 0.3;
    @Override

    public double calculateTax(Product product) {
        return product.getBasePrice()/basePricecoefficient + taxableCoefficient* taxableIncome;
    }

}
