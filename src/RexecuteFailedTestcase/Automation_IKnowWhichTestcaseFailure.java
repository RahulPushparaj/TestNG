package RexecuteFailedTestcase;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Automation_IKnowWhichTestcaseFailure implements IRetryAnalyzer
{
	int min =1;
	int max =10;
	@Override
	public boolean retry(ITestResult arg0)
	{
		if (min<=max)
		{
			min++;
			return true;
		}
		return false;
	}
}
