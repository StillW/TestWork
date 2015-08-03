package pojo;

/**
 * Created by Still on 02.08.2015.
 */
public class FixedMonthlyCostPaidService extends PaidService {

    public FixedMonthlyCostPaidService(String id, String name, double costs){

        super(id,name,costs);
    }

    @Override
    public double calculateAvarageMonthlyCosts() {

        return getCosts();
    }

    @Override
    public String toString() {
        return
                " " + this.getId() + "/" +
                        " " + this.getName() + "/" +
                        " " + (int)this.getCosts();
    }
}
