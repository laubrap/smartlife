package ar.edu.utn.ba.ddsi.sales_service.entities.tax;

import ar.edu.utn.ba.ddsi.sales_service.entities.product.Product;
import lombok.Getter;
import lombok.Setter;


public class IVA implements Tax {

    @Getter
    @Setter
    private static double percentage = 0.21;

    @Override
    public double calculateTax(Product product) {

        return product.getBasePrice()*percentage;
    }
}
