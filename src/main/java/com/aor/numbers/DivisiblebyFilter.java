package com.aor.numbers;

public class DivisiblebyFilter implements GenericListFilterer{
    private int l;
    public DivisiblebyFilter(int l_){
        this.l= l_;
    }
    @Override
    public boolean accept(Integer i){
        if (i%l==0){
            return true;
        }
        return false;
    }

}
