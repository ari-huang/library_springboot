package com.example.library.controller;
import com.example.library.entity.Inventory;
import com.example.library.service.InventoryService ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api")
public class InventoryController {
    @Autowired
    InventoryService inventoryservice;//取得Service物件

    @GetMapping("/inventory")
    public Iterable<Inventory> getInventoryList () {
        Iterable<Inventory> inventoryList = inventoryservice.getInventories();
        return inventoryList;
    }
}
