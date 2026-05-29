package ar.edu.utn.ba.ddsi.sales_service.entities.product;

import ar.edu.utn.ba.ddsi.sales_service.entities.tax.Tax;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
public class ProductType {
    private final String name;
    private final List<Tax> taxes;

    public ProductType(String name) {
        this.name = name;
        this.taxes = new ArrayList<>();
    }


    public double getTaxesPrice(Product product){
        return taxes.stream().mapToDouble(t -> t.calculateTax(product))
                .sum();
    }

    public void addTax(Tax...newTaxes){ //... -> parametros variables 0 a +inf
        Collections.addAll(this.taxes,newTaxes);
    }
}
