package org.prototype;

import org.prototype.prototype.PriceList;
import org.prototype.prototype.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        PriceList priceList = new PriceList("Lista Normal");
        List<Product> productList = List.of(new Product("PS5", 500),
                                            new Product("Xbox Series S", 250),
                                            new Product("PC Gamer", 700),
                                            new Product("Monitor 144hz", 400),
                                            new Product("Teclado", 80));

        priceList.setProductList(productList);

        System.out.println(priceList);

        //Lista de precios con descuento

        PriceList priceList2 = (PriceList) priceList.deepClone();
        priceList2.setName("Lista Preferencial");

        for (Product product : priceList2.getProductList()){
            product.setPrice(product.getPrice() * 0.9);
        }

        System.out.println(priceList2);


    }
}