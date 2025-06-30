package com.example.crud.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.crud.dto.ProductDto;
import com.example.crud.entity.Category;
import com.example.crud.entity.Product;
import com.example.crud.mapper.ProductMapper;
import com.example.crud.repository.CategoryRepository;
import com.example.crud.repository.ProductRepository;
import com.example.crud.service.ProductService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
	private final ProductRepository productRepo;
	private final CategoryRepository categoryRepo;
	private final ProductMapper productMapper;


	@Override
	public List<ProductDto> getAll() {
		List<Product> products = productRepo.findAll();
		return productMapper.toDtoList(products);
	}

//	@Override
//	public ProductDto create(ProductDto dto) {
//		
//	}

}
