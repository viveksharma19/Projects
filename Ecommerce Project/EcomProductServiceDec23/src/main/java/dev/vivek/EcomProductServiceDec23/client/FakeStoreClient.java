package dev.vivek.EcomProductServiceDec23.client;

import dev.vivek.EcomProductServiceDec23.dto.FakeStoreProductResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component  // because this is not a controller, service and repo class that's why spring doesnot create an object for this class if we want object of this class then we put @Coponent annotation
public class FakeStoreClient {
    @Autowired
    private RestTemplateBuilder restTemplateBuilder;
    @Value("${fakestore.api.base.url}")  // this annotation will, fetch the value from app properties and inject that value to this variable
    private String fakeStoreAPIBaseUrl;
    @Value("${fakestore.api.product.path}")
    private String fakeStoreAPIProductPath;
    @Value("${fakestore.api.category.path}")
    private String fakeStoreAPICategoryPath;


    public List<FakeStoreProductResponseDTO> getAllProducts() { // should this method get List<Product> from fakestore?  Noooo because if fakestore changes his response type this is tight coupled so we use fakestoreResponsedto
        //        seralisation - obj to json string;
        //        deserialisation - json to obj
        String fakeStoreGetAllProductURL = fakeStoreAPIBaseUrl.concat(fakeStoreAPIProductPath);
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductResponseDTO[]> productResponseList =
                restTemplate.getForEntity(fakeStoreGetAllProductURL, FakeStoreProductResponseDTO[].class);
        return List.of(productResponseList.getBody());
    }
}


/*
    restTemplate.getForEntity(fakeStoreGetAllProductURL, FakeStoreProductResponseDTO[].class);
    restTemplate.getForEntity(urlForAPI, the object in which you want response)
 */