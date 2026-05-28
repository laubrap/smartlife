package ar.edu.utn.ba.ddsi.sales_service.entities;

import ar.edu.utn.ba.ddsi.sales_service.entities.product.Product;

public class EI implements Tax{

    @Override
    public double calculateTax(Product product) {
        double taxableIncome = 3.5;
        return product.getBasePrice()/4 + 0.3* taxableIncome;
    }

}
