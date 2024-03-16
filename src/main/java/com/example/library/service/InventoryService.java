package com.example.library.service;
import com.example.library.dao.InventoryDao;
import com.example.library.entity.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class InventoryService {
    @Autowired
    InventoryDao inventoryDao; // 取得Dao物件

    public Iterable<Inventory> getInventories () {
        return inventoryDao.findAll();
    }
}