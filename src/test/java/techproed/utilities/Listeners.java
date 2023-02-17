package techproed.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Listeners implements ITestListener {

    @Override
    public void onStart(ITestContext context) {
        System.out.println("onStart-Tum testlerden once bir kere cagrilir : " + context.getName()); //getName method isimlerini getiri bize.
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("onFinish-Tum testlerden sonra tek bir kere cagrilir : " + context.getName());

    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart-Her bir @Test'den once tek bir kere cagrilir : " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess-Sadece PASS olan testlerden SONRA tek bir kez cagrilir : " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure-Sadece FAIL olan testlerden SONRA tek bir kez cagrilir : " + result.getName());
        try {
            ReusableMethods.getScreenshot("Test Case-Fail : "+result.getName()); //test case fail olduğunda ekran görüntüsü aldırdık
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped-Sadece skip edilen (atlanan) testlerden SONRA tek bir kez cagrilir : " + result.getName());
    }
}