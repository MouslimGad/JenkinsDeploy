package com.example.springreactive;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class StringFilterTest {

    private StringFilter stringFilter;


    @Before
    public void setUp(){
         stringFilter = new StringFilter();
    }

    @Test
    public void given_string_elements_returns_filtered_hashmap(){
        List<String> list = Arrays.asList("un","","exemple","très","simple","");
        Map<String,Integer> map = new HashMap<>();
        map.put("UN!",3);
        map.put("EXEMPLE!",8);
        map.put("TRÈS!",5);
        map.put("SIMPLE!",7);

        assertEquals(stringFilter.filterStringList(list),map);
    }
}
