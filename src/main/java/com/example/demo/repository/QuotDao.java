package com.example.demo.repository;

import com.example.demo.model.Elvl;
import com.example.demo.model.Quot;

import java.math.BigDecimal;
import java.util.List;

public interface QuotDao {


    boolean createQuot (Quot quot);
    List<Elvl> getAllElvl();
    Elvl getElvlByIsin(String isin);

}
