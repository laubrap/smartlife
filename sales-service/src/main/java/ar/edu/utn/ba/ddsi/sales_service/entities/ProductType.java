package ar.edu.utn.ba.ddsi.sales_service.entities;

import java.util.List;

public class ProductType {
    private String name;
    private List<Tax> taxes;

    public double getTaxesPrice(Product product){
        return taxes.stream().mapToDouble(t -> t.calculateTax(product))
                .sum();
    }
}
