package com.company.inventory.entity.service;

import com.company.inventory.entity.dto.InventoryResponse;
import com.company.inventory.entity.repository.InventoryRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class InventoryService {

    private final InventoryRepo inventoryRepo;

    public List<InventoryResponse> isInSkuCode(List<String> skuCode) {
       return inventoryRepo.findBySkuCodeIn(skuCode).stream()
               .map(inventory ->
                   InventoryResponse.builder()
                           .skuCode(inventory.getSkuCode())
                           .isInStock(inventory.getQuantity()>0)
                           .build()

               ).toList();

    }
}
