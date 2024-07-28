package examples;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "testData")
    public Object[][] createTestData() {
        return new Object[][] {
                {"us", "90210", "Beverly Hills"},
                {"us", "12345", "Schenectady"},
                {"ca", "B2R", "Waverley"}
        };
    }
}
