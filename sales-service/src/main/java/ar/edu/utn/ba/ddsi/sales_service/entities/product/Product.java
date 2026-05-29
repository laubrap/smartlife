package ar.edu.utn.ba.ddsi.sales_service.entities.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
public class Product {
    private final long id;
    private String name;
    private String description;
    private double basePrice;
    private ProductType productType;

    public double finalPrice(){
        return this.basePrice - this.getTaxes();
    }

    public double getTaxes(){
        return this.productType.getTaxesPrice(this);
    }
}
