package pojo;

/**
 * Created by Still on 02.08.2015.
 */
public class FixedHourlyCostPaidService extends PaidService {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCosts() {
        return (int) costs;
    }

    public void setCosts(double costs) {
        this.costs = costs;
    }

    String id;
    String name;
    double costs;

    public FixedHourlyCostPaidService(String id, String name, double costs){

        this.id = id;
        this.name = name;
        this.costs = calculateAvarageMonthlyCosts(costs);

    }

    @Override
    public double calculateAvarageMonthlyCosts(double value) {

        double ame = 30*24*value;
        return (int) ame;
    }

    @Override
    public String toString() {
        return
                " " + this.id + "/" +
                " " + this.name + "/" +
                " " + (int)this.costs;
    }
}
