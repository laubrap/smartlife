package ar.edu.utn.ba.ddsi.sales_service.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Product {
    private long id;
    private String name;
    private String description;
    private double basePrice;
    private ProductType productType;

    public double finalPrice(){
        return basePrice - this.getTaxes();
    }

    public double getTaxes(){
        return productType.getTaxesPrice(this);
    }
}
