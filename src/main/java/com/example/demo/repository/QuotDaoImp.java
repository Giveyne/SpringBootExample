package com.example.demo.repository;


import com.example.demo.mapper.ElvlMapper;
import com.example.demo.mapper.QuotMapper;
import com.example.demo.model.Elvl;
import com.example.demo.model.Quot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.List;

@Service
public class QuotDaoImp implements QuotDao{

    @Autowired
    QuotDao quotDao;

    JdbcTemplate jdbcTemplate;
    private final String SQL_CREATE_QUOT = "insert into QUOTATION_BASE(ISIN, BID, ASK, ASKSIZE, BIDSIZE) values(?,?,?,?,?)";
    private final String SQL_GET_ALL_ELVL = "select * from ENERGY_LVL";
    private final String SQL_ELVL_BY_ISIN = "select * from ENERGY_LVL where ISIN = ?";

    @Autowired
    public QuotDaoImp(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public boolean createQuot(Quot quot) {
        return jdbcTemplate.update(SQL_CREATE_QUOT, quot.getISIN(), quot.getBid(), quot.getAsk(), quot.getAskSize(),
                quot.getBidSize()) > 0;
    }

    @Override
    public List<Elvl> getAllElvl() {
        return jdbcTemplate.query(SQL_GET_ALL_ELVL, new ElvlMapper());
    }

    @Override
    public Elvl getElvlByIsin(String isin) {
        return jdbcTemplate.queryForObject(SQL_ELVL_BY_ISIN, new Object[]{isin}, new ElvlMapper());
    }
}
