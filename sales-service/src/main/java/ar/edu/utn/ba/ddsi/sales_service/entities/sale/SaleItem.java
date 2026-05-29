package ar.edu.utn.ba.ddsi.sales_service.entities.sale;

import ar.edu.utn.ba.ddsi.sales_service.entities.product.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class SaleItem {
    private Product product;
    private int quantity;

    public SaleItem(Product product, int quantity) {

        if (quantity<0){
            throw new IllegalArgumentException("quantity must be higher than 0");
        }

        this.product = product;
        this.quantity = quantity;
    }


    public double getSaleItemPriceWithTaxes(){
        return quantity * product.finalPrice();
    }

    public double getSaleItemPriceWithoutTaxes(){
        return quantity * product.getBasePrice();
    }
}

