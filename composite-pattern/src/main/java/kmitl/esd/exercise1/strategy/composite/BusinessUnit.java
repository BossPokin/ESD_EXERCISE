package kmitl.esd.exercise1.strategy.composite;

import kmitl.esd.excercise1.simple.SingletonDemo;

import java.util.logging.Logger;

/**
 * Department class is a class that implements the composite pattern
 */
public abstract class BusinessUnit {
    /**
     * There are three private fields. The first one is for the name of the business unit.
     * The second one is for the amount of employee in the business unit.
     */
    protected String name;
    protected int employee_amount;
    protected static final Logger LOGGER = Logger.getLogger(SingletonDemo.class.getName());


    public BusinessUnit(String name, int employee_amount) {
        this.name = name;
        this.employee_amount = employee_amount;
    }
    /**
     * Returns some of the information about the department
     * @return the information about the department
     */

    public abstract void showDetail();
}

