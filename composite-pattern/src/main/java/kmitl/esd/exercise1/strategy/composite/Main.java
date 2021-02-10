package kmitl.esd.exercise1.strategy.composite;

import kmitl.esd.excercise1.simple.SingletonDemo;

import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(SingletonDemo.class.getName());

    public static void main(String[] args) {
        Department accountingDepartment = new Department("Accounting Department", 100);
        accountingDepartment.addBusinessUnit(new Team("Team1", 10));
        accountingDepartment.addBusinessUnit(new Team("Team2", 90));
        accountingDepartment.showDetail();
    }
}
