package kmitl.esd.exercise1.strategy.composite;

/**
 * This is class is a leaf in composite pattern
 */
public class Team extends BusinessUnit {
    public Team(String name, int employee_amount) {
        super(name, employee_amount);
    }

    /**
     * Implements the abstract method of the BusinessUnit
     */
    @Override
    public void showDetail() {
        LOGGER.info("Team: " + this.name + ", Number of people: " + this.employee_amount);
    }
}
