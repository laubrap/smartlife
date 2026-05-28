package ar.edu.utn.ba.ddsi.sales_service.entities.product;

import ar.edu.utn.ba.ddsi.sales_service.entities.Tax;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Collections;
import java.util.List;

@Getter
@AllArgsConstructor
public class ProductType {
    private String name;
    private List<Tax> taxes;

    public double getTaxesPrice(Product product){
        return taxes.stream().mapToDouble(t -> t.calculateTax(product))
                .sum();
    }

    public void addTax(Tax...newTaxes){ //... -> parametros variables 0 a +inf
        Collections.addAll(this.taxes,newTaxes);
    }
}
