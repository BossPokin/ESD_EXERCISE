package kmitl.esd.excercise1.registration;

public class RegistrationDemo {
    public static void main(String args[]) {
        CompanyManagerRegistry registry = CompanyManagerRegistry.getInstance();
        registry.register(registry.create()); // register a newly created company manager
        ICompanyManager companyManager = registry.getCompanyManager();
        companyManager.printSomething();
        registry.unRegister();
        registry.unRegister();
    }
}
