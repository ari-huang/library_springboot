package com.example.library.controller;
import com.example.library.entity.Record;
import com.example.library.service.RecordService ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api")
public class RecordController {
    @Autowired
    RecordService recordservice;//取得Service物件

    @GetMapping("/records")
    public Iterable<Record> getMemberList () {
        Iterable<Record> recordList = recordservice.getRecords();
        return recordList;
    }
}
