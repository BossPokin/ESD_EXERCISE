package kmitl.esd.exercise1.strategy.model;

public class CompanyManager {

    public static final CompanyManager INSTANCE = new CompanyManager();

    protected CompanyManager() {
        //...
    }

    public void doSthInstance() {
        System.out.println("Sth with the instance");
    }

    public static void doSth() {
        System.out.println("Sth");
    }

}
