package pojo;

/**
 * Created by Still on 02.08.2015.
 */
public abstract class PaidService {

    private String id;
    private String name;
    private double costs;

    PaidService(String id, String name, double costs) {
        this.name = name;
        this.id = id;
        this.costs = costs;
    }



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

    public double getCosts() {
        return costs;
    }

    public void setCosts(int costs) {
        this.costs = costs;
    }

    abstract public double calculateAvarageMonthlyCosts();
}