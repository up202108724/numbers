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

    /*@Test
    public void distinct() {

        List<Integer> error = Arrays.asList(1,2,4,2);
        ListAggregator aggregator = new ListAggregator();
        int distinct = aggregator.distinct(error);

        Assertions.assertEquals(3, distinct);
    }*/
    @Test
    public void max_bug_7263(){
        List<Integer> error = Arrays.asList(-1,-4,-5);
        ListAggregator aggregator = new ListAggregator();
        int max = aggregator.max(error);

        Assertions.assertEquals(-1, max);
    }
    @Test
    public void distinct_bug(){
        List<Integer> list = Arrays.asList(1,2,4,2);
        class StubListDeduplicator implements GenericListDeduplicator {
            @Override
            public List<Integer> deduplicate(List<Integer> list) {
                return Arrays.asList(1, 2, 4);
            }
        }
        ListAggregator aggregator= new ListAggregator();
        StubListDeduplicator stub= new StubListDeduplicator();
        int dedup= aggregator.distinct(list, stub);
        Assertions.assertEquals(3,dedup);
        }

    }

