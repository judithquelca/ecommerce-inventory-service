package dev.judyquelca.inventoryservice.mapper;

import dev.judyquelca.inventoryservice.dto.InventoryItemRequest;
import dev.judyquelca.inventoryservice.dto.InventoryItemResponse;
import dev.judyquelca.inventoryservice.model.InventoryItem;

public final class InventoryMapper {

    private InventoryMapper() {
        throw new AssertionError("Utility class, no debe instanciarse");
    }

    public static InventoryItemResponse toResponse(InventoryItem inventoryItem) {

        return new InventoryItemResponse(
                inventoryItem.getId(),
                inventoryItem.getProductId(),
                inventoryItem.getProductName(),
                inventoryItem.getAvailableStock(),
                inventoryItem.getReservedStock(),
                inventoryItem.getTotalStock(),
                inventoryItem.getCreatedAt(),
                inventoryItem.getUpdatedAt()
        );
    }

    public static void updateEntity(InventoryItemRequest request, InventoryItem entity) {

        entity.setProductId(request.productId());
        entity.setProductName(request.productName());
        entity.setAvailableStock(request.initialStock());

    }
}
