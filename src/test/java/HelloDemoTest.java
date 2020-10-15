import junit.framework.TestCase;

public class HelloDemoTest extends TestCase {
    public int add(int a , int b) {
        HelloDemoTest demotest = new HelloDemoTest();
        int expected = 10;
        int Actual = demotest.add(10,20);
        assertEquals( expected,Actual);


        return expected;
    }


}