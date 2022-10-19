package com.aor.numbers;

import java.util.ArrayList;
import java.util.List;

public class ListFilterer {

    private GenericListFilterer filter;
    public void ListFilter(GenericListFilterer f){
        this.filter=f;
    }
    public List<Integer> filter(List<Integer> list){
        List<Integer> newlist= new ArrayList<>();
        for (Integer i: list){
            if (filter.accept(i)){
                newlist.add(i);
            }
        }
    return newlist;
    }

}
