package ar.edu.utn.ba.ddsi.sales_service.observers;

import ar.edu.utn.ba.ddsi.sales_service.entities.sale.Sale;

public interface SaleObserver {
    void beNotified(Sale sale);
}
