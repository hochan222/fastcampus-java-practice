import java.util.Arrays;
import java.util.List;
import logic.BubbleSort;
import logic.JavaSort;
import service.StringSortService;

public class Main {

    public static void main(String[] args) {
        StringSortService service = new StringSortService(new JavaSort<>());

//        세터 주입
//        StringSortService service = new StringSortService();
//        service.setSort(new JavaSort<>());
//        service.setSort(null);

        List<String> list =  service.doSort(Arrays.asList(args));
        System.out.println("result" + list);
    }
}
