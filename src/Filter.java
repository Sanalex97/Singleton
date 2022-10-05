import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    protected int f;

    public Filter(int f) {
        this.f = f;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result;
        result = source.stream()
                .filter(x -> {
                    if (x > f) {
                        logger.log("Элемент " + x + " проходит");
                        return true;
                    } else {
                        logger.log("Элемент " + x + " не проходит");
                        return false;
                    }
                })
                .collect(Collectors.toList());

        logger.log("Прошло фильтр " + result.size() + " элемента из " + source.size());

        return result;
    }
}
