package kmitl.esd.exercise1.model.business;

import static org.junit.jupiter.api.Assertions.*;

class LocalCompanyTest {
    private static LocalCompany localCompany;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.Test
    void getCompanyType() {
        assertEquals(localCompany.getCompanyType(), CompanyType.LOCAL);
    }

    @org.junit.jupiter.api.Test
    void getName() {
    }

    @org.junit.jupiter.api.Test
    void something() {
    }
}