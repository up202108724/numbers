package com.aor.numbers;

public class PositiveFilter  implements GenericListFilterer{
    @Override
    public boolean accept(Integer i){
            if (i>0)
                return true;
            else
                return false;
        }
}
