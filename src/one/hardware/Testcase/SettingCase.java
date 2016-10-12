package one.hardware.Testcase;
import java.io.File;
import java.util.HashSet;

import com.android.uiautomator.core.UiObject;
import com.ckt.demo.UiAutomatorHelper;

import one.hardware.Action.CameraAction;
import one.hardware.Action.FileManagerAction;
import one.hardware.Util.Base;

public class SettingCase extends Base{
	
	public void testSetDisplayTimeNever() throws Exception{
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			common.initDevice();
			
			device.pressHome();
			device.pressMenu();
			
			device.waitForWindowUpdate("com.android.settings", 5000);
			common.clickViewByText("Device");
			common.ScrollViewByText("Display");
			common.clickViewByText("Display");
			common.clickViewByText("Sleep");
			common.ScrollViewByText("Never");
			common.clickViewByText("Never");
			
			device.pressHome();
			device.pressMenu();
			common.clickViewByText("Connection");
			common.clickViewByText("Wi-Fi");
			sleep(3000);
			UiObject addNewNetWork = common.findViewByText2("Add new network...");
			if (addNewNetWork.exists()) {
				common.clickViewById("android:id/switchWidget");
				addNewNetWork.waitUntilGone(10000);
			}
			common.ScrollViewByText("CKT");
			common.clickViewByText("CKT");
			UiObject passwd = common.findViewById2("com.android.settings:id/password");
			if (passwd!=null&&passwd.exists()) {
				passwd.setText("cktchengdu8080");
			}else {
				
			}
			if (common.findViewByText2("Connect").exists()) {
				common.clickViewByText("Connect");
			}
			common.passcase();
			common.startLog( "*****End to run " + runcase + " *****");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			common.handleException(e.getMessage());
		}
	}
	public static void main(String args[]){
		new UiAutomatorHelper("AppSioeye", " one.hardware.Testcase.SettingCase", "", "3");
	}
}
