package com.example.library.dao;

import com.example.library.entity.Record;
import org.springframework.data.repository.CrudRepository;

// 第一個參數為訪問的實體，第二參數是這個Entity ID的資料型態
public interface RecordDao extends CrudRepository<Record, Integer> {

}