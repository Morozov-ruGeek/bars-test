package ru.amorozov.barstest.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @author Aleksey Morozov
 * @since 26.06.2022
 */
@Component
public class DataBaseSeeder {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public DataBaseSeeder(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void insertData() {
        jdbcTemplate.execute("INSERT INTO contracts(contract_date,contract_id) VALUES('2022-01-19', 'Contract_1')");
        jdbcTemplate.execute("INSERT INTO contracts(contract_date,contract_id) VALUES('2022-05-19', 'Contract_2')");
        jdbcTemplate.execute("INSERT INTO contracts(contract_date,contract_id) VALUES('2022-04-19', 'Contract_3')");
    }
}
