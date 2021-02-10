package kmitl.esd.excercise1.registration;

/**
 * This class implements the registration pattern
 */
public class CompanyManagerRegistry {


    /**
     * Theses two fields are singleton.
     */
    private ICompanyManager companyManager = null;
    private static CompanyManagerRegistry INSTANCE = new CompanyManagerRegistry();

    /**
     * Create a company manager if companyManager is not registered yet.
     * @return a new ICompanyManager
     */
    public ICompanyManager create() {
        if (companyManager != null) {
            System.out.println("Please unregister first");
            return null;
        } else {
            return new CompanyManager();
        }
    }

    private CompanyManagerRegistry() {}

    /**
     * Register a new company manager if companyManager = null and return true, else return false
     * @param newCompanyManager a new company manager to register
     * @return true if success and false otherwise
     */
    public boolean register(ICompanyManager newCompanyManager) {
        if (companyManager != null) {
            System.out.println("Company Manager already exists, please unregister first");
            return false;
        }
        this.companyManager = newCompanyManager;
        return true;
    }

    /**
     * unregister company manager if exists and return true, return false otherwise
     * @return true if companyManager exists, false otherwise
     */
    public boolean unRegister() {
        if (companyManager != null) {
            companyManager = null;
            return true;
        } else {
            System.out.println("There's no company manager to unregister!");
            return false;
        }
    }

    /**
     * return the singleton object
     * @return CompanyManager Registry
     */
    public static CompanyManagerRegistry getInstance() {
        return INSTANCE;
    }

    public ICompanyManager getCompanyManager() {
        return companyManager;
    }


}
