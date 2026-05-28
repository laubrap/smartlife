package ar.edu.utn.ba.ddsi.sales_service.entities;

import lombok.Getter;

@Getter
public class EO implements Tax{
    final private double taxableIncome = 4;

    @Override
    public double calculateTax(Product product) {
        return product.getBasePrice()*0.5 + 4*taxableIncome;
    }
}
