package com.bridgelabz.selenium.driver;

import com.bridgelabz.selenium.utilities.Screenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners extends Screenshot implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test starts "+result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Name of pass test case "+result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Name of the failed test case "+result.getName());
        takescreenshot(result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("Name of the test case failed with success percentage is"+result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("name of the test case is skipped "+result.getName());
    }

    @Override
    public void onStart(ITestContext context) {
        ITestListener.super.onStart(context);
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Test Complete:"+context.getName());
    }
}
