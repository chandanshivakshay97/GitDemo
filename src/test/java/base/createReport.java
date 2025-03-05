package base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.util.Objects;

public class createReport {

    public static ExtentReports extentsReports;
    public static ExtentTest extentTest;

    public ExtentSparkReporter initiateReport() {
        ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter("./extents.html");
        extentSparkReporter.config().setReportName("API test cases");
        extentSparkReporter.config().setDocumentTitle("API Tests");
        return extentSparkReporter;
    }

    public void createReport() {
        if (Objects.isNull(extentsReports)) {
            extentsReports = new ExtentReports();
            extentsReports.attachReporter(initiateReport());
        }
    }

    public void flushReporter() {
        extentsReports.flush();
    }
}


