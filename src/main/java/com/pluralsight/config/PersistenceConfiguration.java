package com.pluralsight.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {

    @Bean
    public DataSource dataSource() {
        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.url("jdbc:postgresql://10.80.112.72:5432/conference_app");
        builder.username("postgres");
        builder.password("docker");
        System.out.println("My Custom Datasource has been set and initialized");
        return builder.build();
    }

}
