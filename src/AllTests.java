import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
// test suite
@RunWith(Suite.class)
@SuiteClasses({ TestBalance.class, TestFunctions.class })
public class AllTests {

}
