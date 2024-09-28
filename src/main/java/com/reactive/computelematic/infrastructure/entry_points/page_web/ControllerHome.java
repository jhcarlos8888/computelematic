package com.reactive.computelematic.infrastructure.entry_points.page_web;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;



@Configuration
public class ControllerHome {


    @Bean
    public RouterFunction<ServerResponse> routeHome() {
        return route(RequestPredicates.GET("/").or(RequestPredicates.GET("/index")).or(RequestPredicates.GET("/home")),
                request -> ServerResponse.ok().render("index"));
    }


    @Bean
    public RouterFunction<ServerResponse> routeResponseSuscOfert() {
        return route(RequestPredicates.GET("/responseSuscOfert"),
                request -> ServerResponse.ok().render("pages/responseSuscOfert"));
    }

}
