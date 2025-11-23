package dev.judyquelca.inventoryservice.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record InventoryItemRequest (

    @NotNull(message = "{inventory.product.notblank}")
    Long productId,

    @NotBlank(message = "{inventory.product.name}")
    String productName,

    @NotNull(message = "{inventory.stock.notblank}")
    @Min(value = 0, message = "{inventory.stock.positive}")
    Integer initialStock
){
}

/*
    // Constructor vacío
    public InventoryItemRequest() {
    }

 /*   // Constructor completo
    public InventoryItemRequest(Long productId, String productName, Integer initialStock) {
        this.productId = productId;
        this.productName = productName;
        this.initialStock = initialStock;
    }

    // Getters y Setters

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getInitialStock() {
        return initialStock;
    }

    public void setInitialStock(Integer initialStock) {
        this.initialStock = initialStock;
    }

    @Override
    public String toString() {
        return "InventoryItemRequest{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", initialStock=" + initialStock +
                '}';
    }
}*/
