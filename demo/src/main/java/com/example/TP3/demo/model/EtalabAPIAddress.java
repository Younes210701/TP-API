package com.example.TP3.demo.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EtalabAPIAddress {
    public String type;
    public String version;

    public List<Map<String, Object>> features = new ArrayList<>();
    public String attribution;
    public String licence;
    public String query;
    public int limit = 1;

    //toString
    @Override
    public String toString() {
        return "EtalabAPIAddress{" +
                "features=" + features +
                ", query='" + query + '\'' +
                '}';
    }
}
