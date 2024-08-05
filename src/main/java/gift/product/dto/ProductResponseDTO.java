package gift.product.dto;

import gift.product.model.Category;
import gift.product.model.Product;

public class ProductResponseDTO {
    private Long id;
    private String name;
    private int price;
    private String imageUrl;
    private Category category;

    public ProductResponseDTO(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.price = product.getPrice();
        this.imageUrl = product.getImageUrl();
        this.category = product.getCategory();
    }
}
