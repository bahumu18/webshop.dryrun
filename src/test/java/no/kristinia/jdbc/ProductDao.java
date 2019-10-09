package no.kristinia.jdbc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductDao {

private List<String> products = new ArrayList<String>();

public void insertPrroduct(String productName) {
    products.add(productName);

}

    public List<String> listAll(){
        return products; 

    }
}
