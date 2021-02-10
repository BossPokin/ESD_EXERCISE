package kmitl.esd.exercise1.strategy.composite;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentTest {
    private Department department;

    @BeforeEach
    void setUp() {
        department = new Department("TestingDepartment", 2);
    }

    @Test
    void showDetail() {
    }

    @Test
    void addBusinessUnit() {
        department.addBusinessUnit(new Team("Team1", 1));
        assertEquals(1, department.getBusinessUnits().size());
    }

    @Test
    void removeBusinessUnit() {
        Team team1 = new Team("Team1", 1);
        department.addBusinessUnit(team1);
        department.removeBusinessUnit(team1);
        assertEquals(0, department.getBusinessUnits().size());

    }
}