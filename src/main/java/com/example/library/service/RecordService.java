package com.example.library.service;
import com.example.library.dao.RecordDao;
import com.example.library.entity.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class RecordService {
    @Autowired
    RecordDao recordDao; // 取得Dao物件

    public Iterable<Record> getRecords () {
        return recordDao.findAll();
    }
}