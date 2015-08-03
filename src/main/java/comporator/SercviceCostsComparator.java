package comporator;

import pojo.PaidService;

import java.text.Collator;
import java.util.Comparator;

/**
 * Created by Still on 02.08.2015.
 */
public class SercviceCostsComparator implements Comparator<PaidService> {

    private final Collator collator = Collator.getInstance();

    @Override
    public int compare(PaidService o1, PaidService o2) {

        if (o2.calculateAvarageMonthlyCosts() == o1.calculateAvarageMonthlyCosts()) {
            return collator.compare(o1.getName(), o2.getName());
        }

        return (int) (o2.calculateAvarageMonthlyCosts() - o1.calculateAvarageMonthlyCosts());
    }
}



