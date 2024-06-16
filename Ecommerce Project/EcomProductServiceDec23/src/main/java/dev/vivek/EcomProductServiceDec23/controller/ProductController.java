package dev.vivek.EcomProductServiceDec23.controller;

import dev.vivek.EcomProductServiceDec23.dto.FakeStoreProductResponseDTO;
import dev.vivek.EcomProductServiceDec23.entity.Product;
import dev.vivek.EcomProductServiceDec23.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;  // field injection other than this constructor injection and getter setter injection

    @GetMapping("/product")
    public ResponseEntity getAllProducts() {
        List<FakeStoreProductResponseDTO> products = productService.getAllProducts();
        // we cannot directly pass all the products to UI we should use dto.
        // here we create ProductResponseDTO and ProductEntityDTOMappper class
        return ResponseEntity.ok(products);
        // should you return the product itself to the UI. we should return the DTO

    }
}
