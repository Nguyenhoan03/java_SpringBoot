package com.example.crud.dto;

import java.math.BigDecimal;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class ProductDto {

    private Long id;

    @NotBlank(message = "Tên sản phẩm không được để trống")
    @Size(max = 200, message = "Tên sản phẩm tối đa 200 ký tự")
    private String name;

    private String slug;

    @Size(max = 10000, message = "Mô tả không vượt quá 1000 ký tự")
    private String description;

    @NotNull(message = "Giá không được để trống")
    @DecimalMin(value = "0.0", inclusive = false, message = "Giá phải lớn hơn 0")
    private BigDecimal price;

    @DecimalMin(value = "0.0", message = "Giá khuyến mãi không hợp lệ")
    private BigDecimal salePrice;

    @Min(value = 0, message = "Đánh giá tối thiểu là 0")
    @Max(value = 5, message = "Đánh giá tối đa là 5")
    private Float rating;

    @Size(max = 100, message = "Tên thương hiệu tối đa 100 ký tự")
    private String brand;

    @Size(max = 255, message = "URL ảnh đại diện tối đa 255 ký tự")
    private String thumbnail;

    @NotNull(message = "Danh mục không được để trống")
    private Long categoryId;
    
    private CategoryDto category;

   


    
}
