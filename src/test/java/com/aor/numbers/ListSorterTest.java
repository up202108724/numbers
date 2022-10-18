package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static com.aor.numbers.BeforeEach.lista;

public class ListSorterTest {

    @Test
    public void sort() {

        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        ListSorter sorter = new ListSorter();
        List<Integer> sorted = sorter.sort(lista);

        Assertions.assertEquals(expected, sorted);
    }

    @Test
    public void bug_sort_8726(){
        ListSorter sorter = new ListSorter();
        List<Integer> sorted= sorter.sort(Arrays.asList(1,2,4,2));
        Assertions.assertEquals(Arrays.asList(1,2,2,4),sorted);

    }


}
