import com.geekbrains.Task1;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestTask1 {
    private Task1 task1;

    @Before
    public void startTest() {
        task1 = new Task1();
    }

    @Test
    public void testTask1() {
        int[] arrIn = new int[]{0, 3, 7, 5, 0, 0, 3, 2};
        int[] arrOut = new int[]{};
        Assert.assertArrayEquals(arrOut, Task1.process(arrIn));
    }

    @Test
    public void test2Task1() {
        int[] arrIn = new int[]{0, 4, 7, 5, 0, 0, 3, 2};
        int[] arrOut = new int[]{7, 5, 0, 0, 3, 2};
        Assert.assertArrayEquals(arrOut, Task1.process(arrIn));
    }

    @Test
    public void test3Task1() {
        int[] arrIn = new int[]{0, 3, 7, 5, 4, 0, 3, 2};
        int[] arrOut = new int[]{0, 3, 2};
        Assert.assertArrayEquals(arrOut, Task1.process(arrIn));
    }

    @Test
    public void test4Task1() {
        int[] arrIn = new int[]{0, 3, 7, 5, 0, 4, 3, 2};
        int[] arrOut = new int[]{3, 2};
        Assert.assertArrayEquals(arrOut, Task1.process(arrIn));
    }

    @Test(expected = RuntimeException.class)
    public void test5Task1() {
        int[] arr = new int[]{2, 3, 5, 6, 8, 9, 5};
        Task1.process(arr);
    }

}
