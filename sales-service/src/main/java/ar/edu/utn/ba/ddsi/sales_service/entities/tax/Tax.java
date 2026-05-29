package ar.edu.utn.ba.ddsi.sales_service.entities.tax;

import ar.edu.utn.ba.ddsi.sales_service.entities.product.Product;

public interface Tax {
    public double calculateTax(Product product);
}
