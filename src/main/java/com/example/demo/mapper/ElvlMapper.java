package com.example.demo.mapper;

import com.example.demo.model.Elvl;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ElvlMapper implements RowMapper<Elvl> {

    public Elvl mapRow(ResultSet resultSet, int i) throws SQLException {

        Elvl elvl = new Elvl();
        elvl.setId(resultSet.getLong("id"));
        elvl.setElvl(resultSet.getBigDecimal("elvl"));
        elvl.setIsin(resultSet.getString("isin"));
        return elvl;
    }
}
