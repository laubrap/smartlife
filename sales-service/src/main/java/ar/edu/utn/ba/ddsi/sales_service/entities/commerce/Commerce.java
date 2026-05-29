package ar.edu.utn.ba.ddsi.sales_service.entities.commerce;

import ar.edu.utn.ba.ddsi.sales_service.entities.sale.Sale;
import ar.edu.utn.ba.ddsi.sales_service.entities.product.Product;
import ar.edu.utn.ba.ddsi.sales_service.observers.SaleObserver;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Getter
public class Commerce {
    private final long id;
    private final List<Sale> sales;
    private final List<Product> products;
    private final List<SaleObserver> observers;

    public Commerce(long id) {
        this.id = id;
        this.sales = new ArrayList<>();
        this.products = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    public void addProducts(Product... newProducts){
        Collections.addAll(products,newProducts);
    }

    public void addObservers(SaleObserver...newObservers){
        Collections.addAll(observers, newObservers);
    }

    public void addSale(Sale newSale){
        sales.add(newSale);
        observers.forEach(o->o.beNotified(newSale));
    }
}
