package kmitl.esd.excercise1.registration;

/**
 * The public keyword is removed to make this class public only in this package
 */
class CompanyManager implements ICompanyManager{
    public void doSthInstance() {
        System.out.println("Sth with the instance");
    }

    public static void doSth() {
        System.out.println("Sth");
    }

    /**
     * Implements the method that exists in the ICompanyManager
     */
    @Override
    public void printSomething() {
        System.out.println("Something");
    }
}
