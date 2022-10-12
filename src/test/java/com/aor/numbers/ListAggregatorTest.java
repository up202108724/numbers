package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static com.aor.numbers.BeforeEach.list;

public class ListAggregatorTest {
    @BeforeEach

    @Test
    public void sum() {


        ListAggregator aggregator = new ListAggregator();
        int sum = aggregator.sum(list);

        Assertions.assertEquals(14, sum);
    }

    @Test
    public void max(){

        ListAggregator aggregator = new ListAggregator();
        int max = aggregator.max(list);

        Assertions.assertEquals(5, max);
    }

    @Test
    public void min() {


        ListAggregator aggregator = new ListAggregator();
        int min = aggregator.min(list);

        Assertions.assertEquals(1, min);
    }

    @Test
    public void distinct() {


        ListAggregator aggregator = new ListAggregator();
        int distinct = aggregator.distinct(list);

        Assertions.assertEquals(4, distinct);
    }
    @Test
    public void max_bug_7263(){
        List<Integer> error = Arrays.asList(-1,-4,-5);
        ListAggregator aggregator = new ListAggregator();
        int max = aggregator.max(error);

        Assertions.assertEquals(-1, max);
    }
}
