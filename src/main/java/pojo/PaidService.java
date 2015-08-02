package pojo;

/**
 * Created by Still on 02.08.2015.
 */
public abstract class PaidService {

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

    public void setCosts(int costs) {
        this.costs = costs;
    }

    String id;
    String name;
    double costs;

    abstract double calculateAvarageMonthlyCosts(double costs);
}
