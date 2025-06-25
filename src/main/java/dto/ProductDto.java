package dto;

import java.math.BigDecimal;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {

	private Long id;

	@NotBlank(message = "Tên sản phẩm không được để trống")
	@Size(max = 200, message = "Tên sản phẩm tối đa 200 ký tự")
	private String name;

	private String slug; // tạo tự động từ name, nên không bắt buộc nhập

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(BigDecimal salePrice) {
		this.salePrice = salePrice;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	// Getters and setters (nếu không dùng Lombok)
	// hoặc thêm @Getter @Setter nếu dùng Lombok
	
	
}
