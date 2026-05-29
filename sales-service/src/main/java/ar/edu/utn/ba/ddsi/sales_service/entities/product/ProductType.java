package ar.edu.utn.ba.ddsi.sales_service.entities.product;

import ar.edu.utn.ba.ddsi.sales_service.entities.tax.Tax;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
public class ProductType {
    final private String name;
    final private List<Tax> taxes;

    public ProductType(String name, List<Tax> taxes) {
        this.name = name;
        this.taxes = new ArrayList<>(taxes);
    }


    public double getTaxesPrice(Product product){
        return taxes.stream().mapToDouble(t -> t.calculateTax(product))
                .sum();
    }

    public void addTax(Tax...newTaxes){ //... -> parametros variables 0 a +inf
        Collections.addAll(this.taxes,newTaxes);
    }
}
