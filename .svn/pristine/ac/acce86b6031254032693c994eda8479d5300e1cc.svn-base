package one.hardware.Testcase;

import com.android.uiautomator.core.UiCollection;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiSelector;
import com.ckt.demo.UiAutomatorHelper;


import one.hardware.Util.Base;


public class Wifi_address extends Base {
	public void test() throws Exception{
		try {
		initUIAutomator(this.getName());
		common.startLog("*****Start to run " + runcase + " *****");
		common.initDevice();
		common.startSettings();
		



		common.findViewByText("System").click();
		UiObject sObject = new UiObject(new UiSelector().className("android.widget.LinearLayout"));
		sObject.swipeUp(50);
		
		common.findViewByText("About Iris4G Blink").click();
		common.findViewByText("Status").click();
		/*System.out.println("ssssssssssssssssssssssssss");
		UiCollection videos = new UiCollection(new UiSelector().className("android.widget.ListView"));//定位到ListView
		int count = videos.getChildCount(new UiSelector().className("android.widget.RelativeLayout"));//计数
System.out.println(count);
		for (int instance = 0; instance < count; instance++) {
			UiObject uiObject = videos.getChildByInstance(new UiSelector().className("android.widget.LinearLayout"),0);//定位到LinearLayout
			UiObject Rl = uiObject.getChild(new UiSelector().className("android.widget.RelativeLayout"));
			UiObject IBNS = Rl.getChild(new UiSelector().className("android:id/summary"));
			UiObject sObject = uiObject.getChild(new UiSelector().className("android.widget.TextView").index(0));
			String text = sObject.getText();
			UiObject s2Object = uiObject.getChild(new UiSelector().className("android.widget.TextView").index(-1));
			String text2 = s2Object.getText();
			System.out.println("0000000000000000000000000");
			System.out.println(text);
			System.out.println(text2);
		}*/

		} catch (Exception e) {
		common.handleException(e.getMessage());
		// TODO: handle exception
	}
	}
	public static void main(String args[]){
		new UiAutomatorHelper("one.hardware.Testcase", "one.hardware.Testcase.Wifi_address", "test", "3");
	}

}
