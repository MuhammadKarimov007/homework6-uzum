import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Homework6_2TestMyOwn {

    @Test
    public void testLongestMonotonicSubarrayNoArray() {
        Homework6_2 homework = new Homework6_2();
        int[] nums = {};
        assertEquals(0, homework.longestMonotonicSubarray(nums));
    }

    @Test
    public void testLongestMonotonicSubarrayOneElement() {
        Homework6_2 homework = new Homework6_2();
        int[] nums = {5};
        assertEquals(1, homework.longestMonotonicSubarray(nums));
    }

    @Test
    public void testLongestMonotonicSubarrayPlusArray() {
        Homework6_2 homework = new Homework6_2();
        int[] nums = {1, 2, 3, 4, 5};
        assertEquals(5, homework.longestMonotonicSubarray(nums));
    }

    @Test
    public void testLongestMonotonicSubarrayMinusArray() {
        Homework6_2 homework = new Homework6_2();
        int[] nums = {5, 4, 3, 2, 1};
        assertEquals(5, homework.longestMonotonicSubarray(nums));
    }

    @Test
    public void testLongestMonotonicSubarrayDynamicArray() {
        Homework6_2 homework = new Homework6_2();
        int[] nums = {1, 2, 1, 2, 1, 2, 1};
        assertEquals(2, homework.longestMonotonicSubarray(nums));
    }

    @Test
    public void testLongestMonotonicSubarrayNotDynamicArray() {
        Homework6_2 homework = new Homework6_2();
        int[] nums = {3, 3, 3, 3, 3};
        assertEquals(1, homework.longestMonotonicSubarray(nums));
    }
}
