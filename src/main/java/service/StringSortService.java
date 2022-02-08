package service;

import java.util.List;
import logic.BubbleSort;
import logic.Sort;

public class StringSortService {

    private final Sort<String> sort;

//    세터 주입
//    public void setSort(Sort<String> sort) {
//        this.sort = sort;
//    }

    public StringSortService(Sort<String> sort) {
        this.sort = sort;
    }

    public List<String> doSort(List<String> input) {
        return sort.sort(input);
    }
}
`