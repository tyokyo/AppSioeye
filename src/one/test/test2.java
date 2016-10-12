package one.test;


import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiSelector;
import com.ckt.demo.UiAutomatorHelper;

import one.hardware.Action.FileManagerAction;
import one.hardware.Util.Base;


public class test2 extends Base{
	public static void main(String args[]){
		new UiAutomatorHelper("AppSioeye", " one.test.test2", "", "3");
		//new UiAutomatorHelper("AppSioeye", " one.test.ImageTestCase", "", "3");
	}
	public void testA() throws Exception{
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			//common.initDevice();
			
			UiObject tObject = new UiObject(new UiSelector().className("android.widget.RelativeLayout").index(1));
			tObject.click();
			
			//common.clickViewByText("Wide");
			
			common.startLog( "*****End to run " + runcase + " *****");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			common.handleException(e.getMessage());
		}
		
	}
}
