import com.geekbrains.Task2;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestTask2 {
    private Task2 task2;

    @Before
    public void start2Test() {
        task2 = new Task2();
    }

    @Test
    public void test1Task2() {
        Assert.assertTrue(Task2.process(new int[]{1, 1, 1, 4, 4, 1, 4, 4}));
    }

    @Test
    public void test2Task2() {
        Assert.assertTrue(Task2.process(new int[]{1, 1, 1, 1, 1}));
    }

    @Test
    public void test3Task2() {
        Assert.assertTrue(Task2.process(new int[]{4, 4, 4, 4, 4, 4}));
    }

    @Test
    public void test4Task2() {
        Assert.assertTrue(Task2.process(new int[]{1, 1, 1, 4, 4, 1, 3}));
    }


}
