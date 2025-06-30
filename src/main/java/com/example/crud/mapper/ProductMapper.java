package com.example.crud.mapper;
import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.example.crud.dto.ProductDto;
import com.example.crud.entity.Product;

@Mapper(componentModel = "spring", uses = { CategoryMapper.class })
public interface ProductMapper {

    @Mappings({
        @Mapping(target = "id", expression = "java(product.getId().longValue())"),
        @Mapping(target = "rating", expression = "java(product.getRating() != null ? product.getRating() : 0f)")
    })
   ProductDto toDto(Product product);

    List<ProductDto> toDtoList(List<Product> products);
}
