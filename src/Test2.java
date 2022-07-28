import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Test2 {
    @Test
    void test()
    {
        System.out.println("Hello");
    }

    @Test
    void test1()
    {
        System.out.println("Hi");
    }

   @Test(dependsOnMethods = {"test"},alwaysRun = true)
    void test2()
    {
        System.out.println("Hey");
    }

    @DataProvider
    public Object[][] message(){
        return new Object [][]{{"Mihir" , 145632}, {"Kumar", 28242}};
    }
    
    @Test (dataProvider="message")
    public void PrintMsg(String name, Integer id){
        System.out.println("Names are: "+name+" "+id);
    }
    }
