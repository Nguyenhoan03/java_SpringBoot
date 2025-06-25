package com.example.crud.service.impl;

import com.example.crud.entity.Product;
import com.example.crud.entity.Category;
import com.example.crud.repository.CategoryRepository;
import com.example.crud.repository.ProductRepository;
import com.example.crud.service.ProductService;
import dto.ProductDto;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepo;
    
    public ProductServiceImpl (ProductRepository productRepo) {
       this.productRepo = productRepo;	
    }

    @Override
    public List<ProductDto> getAll() {
        List<Product> products = productRepo.findAll();

        return products.stream().map(product -> {
            ProductDto dto = new ProductDto();
            dto.setId(product.getId());
            dto.setName(product.getName());
            dto.setSlug(product.getSlug());
            return dto;
        }).toList();
    }

    @Override
    public ProductDto create(ProductDto dto) {
        Product product = new Product();
        product.setName(dto.getName());
        product.setSlug(dto.getSlug());

        Product savedProduct = productRepo.save(product);

        ProductDto result = new ProductDto();
        result.setId(savedProduct.getId());
        result.setName(savedProduct.getName());
        result.setSlug(savedProduct.getSlug());

        return result;
    }
}

