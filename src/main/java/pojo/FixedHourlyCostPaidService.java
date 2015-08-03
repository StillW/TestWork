package pojo;

/**
 * Created by Still on 02.08.2015.
 */
public class FixedHourlyCostPaidService extends PaidService {

    public FixedHourlyCostPaidService(String id, String name, double costs) {

        super(id, name, costs);
    }

    @Override
    public double calculateAvarageMonthlyCosts() {

        return 30 * 24 * getCosts();
    }
}
