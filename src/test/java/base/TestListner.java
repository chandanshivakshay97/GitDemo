package base;

import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;




    public class TestListner extends createReport implements ITestListener {

        @Override
        public void onFinish(ITestContext testContext) {
            flushReporter();
        }

        @Override
        public void onStart(ITestContext testContext) {
            initiateReport();
            createReport();
        }

        @Override
        public void onTestFailure(ITestResult result) {
            extentTest.log(Status.FAIL, "Test case failed");
        }

        @Override
        public void onTestStart(ITestResult result) {
            extentTest.log(Status.PASS, "Test case started");
        }

        @Override
        public void onTestSuccess(ITestResult result) {
            extentTest.pass(result.getName()+ " Test case passed");
        }
    }

