package kmitl.esd.excercise1.simple;

import java.util.logging.Logger;

/**
 * This is a class which implements Singleton Pattern
 */
public class CompanyManager {
    /**
     * private field instantiated since can't be instantiated outside.
     */
    private static final CompanyManager INSTANCE = new CompanyManager();
    private static final Logger LOGGER = Logger.getLogger(SingletonDemo.class.getName());


    private CompanyManager() {
        //...
    }

    public void doSthInstance() {
        LOGGER.info("Sth with the instance");
    }

    public static void doSth() {
        LOGGER.info("Sth");
    }

    /**
     * returns the instance of CompanyManager
     * @return the single object or the field declared above (INSTANCE)
     */
    public static CompanyManager getInstance() {
        return INSTANCE;
    }

}
