package comporator;

import pojo.*;

import java.util.Comparator;

/**
 * Created by Still on 02.08.2015.
 */
public class SercviceCostsComparator implements Comparator<PaidService> {

    @Override
    public int compare(PaidService o1, PaidService o2) {
        return (int) (o2.getCosts() - o1.getCosts());
    }
}
