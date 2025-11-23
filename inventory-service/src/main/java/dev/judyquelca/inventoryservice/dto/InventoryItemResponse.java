package dev.judyquelca.inventoryservice.dto;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;

public record InventoryItemResponse(

         Long id,
         Long productId,
         String productName,
         Integer availableStock,
         Integer reservedStock,
         Integer totalStock,
         Instant createdAt,
         Instant updatedAt
) {
}
