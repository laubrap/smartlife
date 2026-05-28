package ar.edu.utn.ba.ddsi.sales_service.entities;

import lombok.Getter;

import java.util.List;


@Getter
public class Commerce {
    private long id;
    private Sale sales;
    private List<Product> products;
}
