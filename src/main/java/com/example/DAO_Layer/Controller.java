package com.example.DAO_Layer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class Controller {
    private final CustomersRepository repository;

    public Controller(CustomersRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/products/fetch-product")
    public List<String> getListProductName(@RequestParam ("name")  String name) throws IOException {
        return repository.getProductName(name);
    }
}
