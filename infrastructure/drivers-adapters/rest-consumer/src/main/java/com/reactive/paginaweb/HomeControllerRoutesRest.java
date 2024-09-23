package com.reactive.paginaweb;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RequestPredicates.DELETE;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class HomeControllerRoutesRest {

/*
    @Bean
    public RouterFunction<ServerResponse> routesAliadosEstrategicos(AliadosEstrategicosService aliadosEstrategicosService) {
        return route(GET("/apiContactCenter/v1/aliadosEstrategicos/flag/{flagName}/{flagValue}/entity/{idEntity}/coincidence/{valueCoincidence}"),
                req -> aliadosEstrategicosService.findAll(req.pathVariable("flagName"),
                        req.pathVariable("flagValue"),
                        req.pathVariable("idEntity"),
                        req.pathVariable("valueCoincidence")))
                .andRoute(POST("/apiContactCenter/v1/aliadosEstrategicos"),req -> req.bodyToMono(ValorDominioRequest.class).flatMap(aliadosEstrategicosService::create))
                .andRoute(PATCH("/apiContactCenter/v1/aliadosEstrategicos"),req -> req.bodyToMono(ValorDominioRequest.class).flatMap(aliadosEstrategicosService::update))
                .andRoute(DELETE("/apiContactCenter/v1/aliadosEstrategicos/flag/{flagName}/{flagValue}/entity/{idEntity}"),
                        req -> aliadosEstrategicosService.delete(req.pathVariable("flagName"),req.pathVariable("flagValue"),req.pathVariable("idEntity")));
    }*/

}
