package product_management.service;

import jdk.dynalink.linker.LinkerServices;
import product_management.model.Product;

import java.util.List;

public interface ProductService {
    List <Product> findAll();
    void  seve (Product product);
    int Id(String id);
    Product name (String name);
    void uppdate(int id, Product product);
    void delete(int id);


}
