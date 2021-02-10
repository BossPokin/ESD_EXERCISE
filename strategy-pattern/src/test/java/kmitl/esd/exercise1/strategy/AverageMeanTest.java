package kmitl.esd.exercise1.strategy;

import static org.junit.jupiter.api.Assertions.*;

class AverageMeanTest {

    private AverageMean averageMean = new AverageMean();

    @org.junit.jupiter.api.Test
    void getAverage() {
        assertEquals( 25.5f, averageMean.getAverage( new int[]{1, 2}) );
    }
}