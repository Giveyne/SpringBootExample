package com.example.demo.mapper;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.demo.model.Elvl;
import com.example.demo.model.Quot;
import org.springframework.jdbc.core.RowMapper;

public class QuotMapper implements RowMapper<Quot> {

    public Quot mapRow(ResultSet resultSet, int i) throws SQLException {

        Quot qout = new Quot();
        qout.setId(resultSet.getLong("id"));
        qout.setISIN(resultSet.getString("isin"));
        qout.setBid(resultSet.getBigDecimal("bid"));
        qout.setAsk(resultSet.getBigDecimal("ask"));
        qout.setAskSize(resultSet.getBigDecimal("asksize"));
        qout.setBidSize(resultSet.getBigDecimal("bidsize"));

        return qout;
    }

}