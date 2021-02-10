package kmitl.esd.exercise1.strategy.model;

// derived class, Company is the super class
// ForeignCompany inherits Company
// superclass is not an interface -> behavioral inheritance
public class ForeignCompany extends Company {
    // -> behavioral inheritance

    public CompanyType getCompanyType() {
        return CompanyType.FOREIGN;
    }

    public String getName() {
        return "Foreign Comp." + name;
    }
}
