package kmitl.esd.exercise1.strategy.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForeignCompanyTest {

    ForeignCompany foreignCompany = new ForeignCompany();
    @Test
    void getCompanyType() {
        assertEquals(CompanyType.FOREIGN, foreignCompany.getCompanyType());
    }

    @Test
    void getName() {
    }
}