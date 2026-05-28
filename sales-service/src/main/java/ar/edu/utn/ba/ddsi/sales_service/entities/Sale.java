package ar.edu.utn.ba.ddsi.sales_service.entities;

import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Getter
public class Sale {
    private long id;
    private LocalDate date;
    private List<SaleItem> items;

    public double getPriceWithTaxes(){
        return items.stream().mapToDouble(i -> i.getSaleItemPriceWithTaxes())
                .sum();
    }

    public double getPriceWithOutTAxes(){
        return items.stream().mapToDouble(i -> i.getSaleItemPriceWithoutTaxes())
                .sum();
    }
}
