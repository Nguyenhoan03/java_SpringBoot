package com.example.crud.mapper;
import org.mapstruct.Mapper;

import com.example.crud.dto.CategoryDto;
import com.example.crud.entity.Category;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    CategoryDto toDto(Category category);
}
