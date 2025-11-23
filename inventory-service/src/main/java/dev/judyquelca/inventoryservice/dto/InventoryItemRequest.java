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
