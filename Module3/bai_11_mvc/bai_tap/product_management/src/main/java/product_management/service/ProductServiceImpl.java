package product_management.service;

import product_management.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {

    List <Product > products;

    public ProductServiceImpl() {
        products = new ArrayList<>();
        products.add(new Product(1,"iphone11", 15.000));
        products.add(new Product(2,"iphone12", 17.000));
        products.add(new Product(3,"iphone13", 19.000));
        products.add(new Product(4,"iphone14", 21.000));
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void seve(Product product) {

    }

    @Override
    public int Id(String id) {
        return 0;
    }

    @Override
    public Product name(String name) {
        return null;
    }

    @Override
    public void uppdate(int id, Product product) {

    }

    @Override
    public void delete(int id) {

    }
}
