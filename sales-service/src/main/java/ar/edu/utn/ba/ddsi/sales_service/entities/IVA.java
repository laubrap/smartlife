package ar.edu.utn.ba.ddsi.sales_service.entities;

public class IVA implements Tax{

    @Override
    public double calculateTax(Product product) {
        double percentage = 0.21;
        return product.getBasePrice()*percentage;
    }
}
