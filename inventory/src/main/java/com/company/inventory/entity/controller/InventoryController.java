package com.company.inventory.entity.controller;

import com.company.inventory.entity.dto.InventoryResponse;
import com.company.inventory.entity.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventory")
@RequiredArgsConstructor
public class InventoryController {
    private final InventoryService inventoryService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> isInSkuCode(@RequestParam List<String> skuCode){
        return inventoryService.isInSkuCode(skuCode);
    }

}
