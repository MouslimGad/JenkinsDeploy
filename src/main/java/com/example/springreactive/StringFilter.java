package com.example.springreactive;

import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class StringFilter {

    /**Returns hashmap with filtered elements
     * @param list
     * @return
     */
    public Mono<Map<String, Integer>> filterStringList(List<String> list){

        Map<String,Integer> map = new HashMap<>();

        Flux<String> flux = Flux.fromIterable(list)
                .filter(x->!x.equals(""))
                .map(String::toUpperCase)
                .map(x->x.concat("!"));

        //flux.subscribe(x -> map.put(x, x.length()));
        return flux.collectMap(x-> x, String::length);
    }
}
