package kmitl.esd.excercise1.simple;

public class SingletonDemo {

    public static void main(String []args) {
        CompanyManager companyManager = CompanyManager.getInstance();
        companyManager.doSthInstance();
    }
}
