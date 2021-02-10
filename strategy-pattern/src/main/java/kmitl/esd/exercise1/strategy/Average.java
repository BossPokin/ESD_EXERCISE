package kmitl.esd.exercise1.strategy;

/**
 * An interface for other average strategies to implement
 * structural inheritance
 */
public interface Average {
    /**
     * every strategy classes must implement this method
     * @param val the values that are involved in calculating average
     * @return average
     */
    float getAverage(int[] val);
}
