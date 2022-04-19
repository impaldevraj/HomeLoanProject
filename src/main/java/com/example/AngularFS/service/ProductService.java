package com.example.AngularFS.service;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AngularFS.entity.Product;
import com.example.AngularFS.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    public List<Product> saveProducts(List<Product> products) {
        return repository.saveAll(products);
    }

    public List<Product> getProducts() {
        return repository.findAll();
    }

    public Product getProductById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Product getProductByName(String name) {
        return repository.findByName(name);
    }

    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "product removed !! " + id;
    }

    public Product updateProduct(Product product) {
        Product existingProduct = repository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setMobileno(product.getMobileno());
        existingProduct.setEmailid(product.getEmailid());
        existingProduct.setAge(product.getAge());
        existingProduct.setCity(product.getCity());
        existingProduct.setPancard(product.getPancard());
        existingProduct.setCibilscore(product.getCibilscore());
        existingProduct.setLoantype(product.getLoantype());
        existingProduct.setLoanamount(product.getLoanamount());
        existingProduct.setNetmonthlyincome(product.getNetmonthlyincome());
        existingProduct.setOccupation(product.getOccupation());
        existingProduct.setCompanyname(product.getCompanyname());
        existingProduct.setCurrentemi(product.getCurrentemi());
       
        return repository.save(existingProduct);
    }


}