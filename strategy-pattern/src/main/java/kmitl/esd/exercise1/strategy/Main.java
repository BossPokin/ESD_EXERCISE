package kmitl.esd.exercise1.strategy;

/**
 * Main application for testing the strategy pattern
 * outputs are shown on the console
 */
public class Main {

    public static void main(String[] args) {
//        Company company1 = Company.create(CompanyType.LOCAL, "Local", "1");
//        Company company2 = Company.create(CompanyType.LOCAL, "Foreign", "2");
//
//        System.out.println(company1.getName());
//        System.out.println(company2.getName());
//        System.out.println("Testing");

        UsSensor sensor = new UsSensor(new int[]{1, 2, 3, 4, 5}, new AverageMedian());
        System.out.println(sensor.getAverage());
        sensor.setAverage(new AverageMean());
        System.out.println(sensor.getAverage());
    }
}
