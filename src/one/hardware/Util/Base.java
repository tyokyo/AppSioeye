package one.hardware.Util;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class Base extends UiAutomatorTestCase {
	public UiDevice device = UiDevice.getInstance();
	public String runcase = this.getClass().getName().replace("one.hardware.Testcase.", "");
	public static Common common;
	
	public void initUIAutomator(String testmethod) {
		runcase = runcase + "-"+testmethod;
		common = new Common(device, runcase);
	}
}
