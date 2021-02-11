package com.pluralsight.conferencedemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {

    // This is just to show that you could load the database configuration by returning the DataSource using a singleton bean
//    @Value("${USER}")
//    private String user;
//
//    @Value("${PASSWORD}")
//    private String password;
//
//    @Bean
//    public DataSource dataSource(){
//        DataSourceBuilder builder = DataSourceBuilder.create();
//        builder.url("jdbc:postgresql://localhost:5432/conference_app");
//        builder.username(user);
//        builder.password(password);
//        System.out.println(("My custom datasource bean has been initialized and set"));
//        return builder.build();
//    }
}
