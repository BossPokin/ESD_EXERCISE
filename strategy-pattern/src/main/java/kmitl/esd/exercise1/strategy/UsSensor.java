package kmitl.esd.exercise1.strategy;

public class UsSensor {
    public int[] val;
    private Average average; // the average strategy that will be injected

    /**
     * set all the initial values
     * @param val values to be used in average calculation
     * @param average the strategy used for calculating average
     */
    public UsSensor(int[] val, Average average) {
        this.val = val;
        this.average = average;
    }

    /**
     * delegate the job to average field
     * @return average
     */
    public float getAverage() {
        return average.getAverage(this.val);
    }

    public int[] getVal() {
        return val;
    }

    public void setVal(int[] val) {
        this.val = val;
    }

    public void setAverage(Average average) {
        this.average = average;
    }
}
