package dev.vivek.EcomProductServiceDec23.service;

import dev.vivek.EcomProductServiceDec23.client.FakeStoreClient;
import dev.vivek.EcomProductServiceDec23.dto.FakeStoreProductResponseDTO;
import dev.vivek.EcomProductServiceDec23.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// This is 3rd party service class which will call the client
@Service
public class FakeStoreProductServiceImpl  implements  ProductService{

    @Autowired
    private FakeStoreClient fakeStoreClient;

    @Override
    public List<FakeStoreProductResponseDTO> getAllProducts() {
        List<FakeStoreProductResponseDTO> fakeStoreProducts = fakeStoreClient.getAllProducts();
        return fakeStoreProducts;
    }

    @Override
    public Product getProduct(int productId) {
        return null;
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public Product updateProduct(Product updatedProduct, int productId) {
        return null;
    }

    @Override
    public boolean deleteProduct(int productId) {
        return false;
    }
}
