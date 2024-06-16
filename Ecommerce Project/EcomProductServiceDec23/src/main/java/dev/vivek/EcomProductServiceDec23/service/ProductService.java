package dev.vivek.EcomProductServiceDec23.service;

import dev.vivek.EcomProductServiceDec23.dto.FakeStoreProductResponseDTO;
import dev.vivek.EcomProductServiceDec23.entity.Product;

import java.util.List;

public interface ProductService {
    List<FakeStoreProductResponseDTO> getAllProducts();
    Product getProduct(int productId);
    Product createProduct(Product product);
    Product updateProduct(Product updatedProduct, int productId);
    boolean deleteProduct(int productId);

}
