package kmitl.esd.exercise1.strategy.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is a composite in composite pattern
 */
public class Department extends BusinessUnit {

    /**
     * List to keep track all of the composites and leafs
     */
    private List<BusinessUnit> businessUnits = new ArrayList<>();

    public Department(String name, int employee_amount) {
        super(name, employee_amount);
    }

    /**
     * Show detail of the department and other sub departments
     */
    @Override
    public void showDetail() {
        LOGGER.info("Department: " + this.name + ", Number of people: " + employee_amount);
        for(BusinessUnit b: businessUnits) {
            b.showDetail();
        }
    }

    /**
     * add a business unit to business units list.
     * @param b
     */
    public void addBusinessUnit(BusinessUnit b) {
        businessUnits.add(b);
    }

    /**
     * remove the specified business unit from the list.
     * @param b
     */
    public void removeBusinessUnit(BusinessUnit b) {
        businessUnits.remove(b);
    }

    public ArrayList<BusinessUnit> getBusinessUnits() {
        return (ArrayList<BusinessUnit>) businessUnits;
    }
}
