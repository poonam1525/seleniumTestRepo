import org.testng.annotations.Test;

public class TestNGGroupDemo {

    @Test(groups = {"sanity","poonam1"})
    public void test1(){
        System.out.println(" This is test 1");
    }
    @Test(groups = {"sanity","smoke","poonam2"})
    public void test2(){
        System.out.println(" This is test 2");
    }
    @Test(groups = {"sanity","regrassion"})
    public void test3(){
        System.out.println(" This is test 3");
    }
    @Test
    public void test4(){
        System.out.println(" This is test 4");
    }
}
