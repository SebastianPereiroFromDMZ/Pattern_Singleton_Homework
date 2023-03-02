import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getLogger();
        return source.stream()
                .peek(item -> {
                            if (item > treshold) {
                                logger.log("Элемент  проходит : " + item);
                            } else {
                                logger.log("Элемент не проходит : " + item);
                            }
                        }
                )
                .filter(item -> item > treshold)
                .collect(Collectors.toList());
    }
}
