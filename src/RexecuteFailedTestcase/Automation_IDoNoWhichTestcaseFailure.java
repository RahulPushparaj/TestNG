package RexecuteFailedTestcase;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.seleniumhq.jetty9.server.Authentication.Failed;
import org.testng.annotations.ITestAnnotation;

public class Automation_IDoNoWhichTestcaseFailure
{
	public void transform(ITestAnnotation arg0, Class arg1,Constructor arg2,Method arg3)
	{
		arg0.setRetryAnalyzer(Failed.class);
	}

}


/*
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Suite">
	
	<listeners>
		<listener class-name="RexecuteFailedTestcase.Automation_IDoNoWhichTestcaseFailure"/>
	</listeners>
	
	<test name="Test">
		<classes>
			<class name="RexecuteFailedTestcase.Automation_IDoKnowWhichTestcaseFailure_Program" />
		</classes>
	</test> <!-- Test -->
</suite> <!-- Suite -->
*/