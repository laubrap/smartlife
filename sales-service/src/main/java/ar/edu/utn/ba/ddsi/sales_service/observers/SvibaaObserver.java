package ar.edu.utn.ba.ddsi.sales_service.observers;

import ar.edu.utn.ba.ddsi.sales_service.entities.sale.Sale;
import lombok.Getter;

@Getter
public class SvibaaObserver implements SaleObserver{
    private long amountCalls = 0;

    @Override
    public void beNotified(Sale sale){
        //Aca me deberia acoplar api rest
        amountCalls++;
    }

}
