package ar.edu.utn.ba.ddsi.sales_service.entities;

import lombok.Getter;

@Getter
public class SaleItem {
    private Product product;
    private int quantity;

    public double getSaleItemPriceWithTaxes(){
        return quantity * product.finalPrice();
    }

    public double getSaleItemPriceWithoutTaxes(){
        return quantity * product.getBasePrice();
    }
}

