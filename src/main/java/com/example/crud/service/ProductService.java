package com.example.crud.service;

import java.util.List;
import dto.ProductDto;

public interface ProductService {
    List<ProductDto> getAll();
    ProductDto create(ProductDto dto);
}