import com.bridglabz.Demo;
import jdk.jfr.StackTrace;
import org.junit.Assert;
import org.junit.Test;

public class TestDemo {
    @Test
    public void test(){
        Demo obj = new Demo();
        int result = obj.add(10,20);
        Assert.assertEquals(20,result);
    }
}
