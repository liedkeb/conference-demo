package com.pluralsight.conferencedemo.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * TODO: Describe this class (The first line - until the first dot - will interpret as the brief description).
 */
@Configuration
public class PersistenceConfiguration {
//    @Bean
//    public DataSource dataSource() {
//        DataSourceBuilder<?> builder = DataSourceBuilder.create();
//        builder.url("jdbc:postgresql://localhost:5432/conference_app");
//        System.out.println("My custom datasource done.");
//        return builder.build();
//    }
}
