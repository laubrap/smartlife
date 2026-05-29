package ar.edu.utn.ba.ddsi.sales_service.entities.sale;

import lombok.Getter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
public class Sale {
    private final long id;
    private LocalDate date;
    private List<SaleItem> items;

    public Sale(long id) {
        this.id = id;
        this.date = LocalDate.now();
        this.items = new ArrayList<>();
    }


    public double getPriceWithTaxes(){
        return items.stream().mapToDouble(i -> i.getSaleItemPriceWithTaxes())
                .sum();
    }

    public double getPriceWithOutTAxes(){
        return items.stream().mapToDouble(i -> i.getSaleItemPriceWithoutTaxes())
                .sum();
    }

    public void addSaleItem(SaleItem... newSaleItems){
        Collections.addAll(items,newSaleItems);
    }
}
