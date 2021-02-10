package kmitl.esd.excercise1.registration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyManagerRegistryTest {

    private CompanyManagerRegistry registry;

    @BeforeEach
    void setUp() {
        registry = CompanyManagerRegistry.getInstance();
    }

    @Test
    @DisplayName("Creating CompanyManager")
    void create() {
        ICompanyManager companyManager =registry.create();
        assertNotNull(companyManager);
    }

    @Test
    @DisplayName("creating company manager and register the company manager to the registry")
    void register() {
        assertTrue(registry.register(registry.create()));
    }

    @Test
    @DisplayName("unregister the existing company manager")
    void unRegister() {
        assertFalse(registry.unRegister());
    }

    @Test
    @DisplayName("get the instance of CompanyManagerRegistry")
    void getInstance() {
        assertTrue(CompanyManagerRegistry.getInstance() instanceof CompanyManagerRegistry);
    }

    @Test
    @DisplayName("getting the existing company manager in the registry")
    void getCompanyManager() {
        registry.register(registry.create());
        ICompanyManager companyManager = registry.getCompanyManager();
        assertNotNull(companyManager);
    }
}