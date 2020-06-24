package com.example.springreactive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;

@RestController
public class StringFilterController {

    @Autowired
    StringFilter stringFilter;

    @GetMapping
    public Mono<Map<String, Integer>> getFilteredList(@RequestParam("list") List<String> list){

        return stringFilter.filterStringList(list);
    }
}
