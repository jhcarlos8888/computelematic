package com.reactive.computelematic.infrastructure.configurations.persistence;


import io.r2dbc.postgresql.PostgresqlConnectionConfiguration;
import io.r2dbc.postgresql.PostgresqlConnectionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersistenceConfig {

    @Bean
    public PostgresqlConnectionFactory connectionFactories(@Value("${database.host}") String host,
                                                           @Value("${database.port}") int port,
                                                           @Value("${database.name}") String databaseName,
                                                           @Value("${database.username}") String username,
                                                           @Value("${database.password}") String password){
        System.out.println("Connecting to database");

        return new PostgresqlConnectionFactory(PostgresqlConnectionConfiguration.builder()
                .host(host)
                .port(port)
                .database(databaseName)
                .username(username)
                .password(password)
                .build());
    }

}
