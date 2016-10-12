package one.hardware.Testcase;
/**
 * 睡眠时间设置15s 60s 10min Never
 * */
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiSelector;
import com.ckt.demo.UiAutomatorHelper;
import one.hardware.Util.Base;

public class Sleeptime_setting extends Base {

	public void findsetting()throws Exception{
		int i,j,k;
		System.out.println("苦逼寻找setting中");
		outer:
			for (k=1;k>0;k++)
			{
				if (k%2 == 0)
				{
					for (i=k;i>0;i--)
					{
						UiObject sObject = new UiObject(new UiSelector().className("android.widget.FrameLayout"));
						sObject.swipeLeft(10);
						System.out.println("Orz..");
						if (common.findViewByText2("Settings").exists() == true)
						{
							System.out.println("o(∩_∩)o 找到了");
							break outer;
						}	
					}
				}
				else{
					for (j=k;j>0;j--)
					{
						UiObject sObject = new UiObject(new UiSelector().className("android.widget.FrameLayout"));
						sObject.swipeRight(10);
						System.out.println("Orz.");
						if (common.findViewByText2("Settings").exists() == true)
						{
							System.out.println("o(∩_∩)o 找到了");
							break outer;
						}				
					}		
				}
			}
	}
	//在任意界面寻找setting界面
	public void test15Seconds() throws Exception{
		try {
			initUIAutomator(this.getName());

			common.startLog("*****Start to run " + runcase + " *****");
			common.initDevice();
			findsetting();
			common.findViewByText("Settings").click();
			common.findViewByText("Device").click();
			common.findViewByText("Display").click();
			common.findViewByText("Sleep").click();
			common.findViewByText("15 seconds").click();
			common.infoLog("等待15s");
			common.waitTime(16);
			if (common.device.isScreenOn() == false)
			{
				common.passcase();
			}
			else {
				common.failcase(runcase);
			}
		} catch (Exception e) {
			// TODO: Auto-generated catch block
			common.handleException(e.getMessage());
		}
		finally {
			common.device.wakeUp();
			common.findViewByText("Never").click();
			common.startLog( "*****End to run " + runcase + " *****");
		}
	}
	//15s设置
	public void test60Seconds() throws Exception{
		try {
			initUIAutomator(this.getName());

			common.startLog("*****Start to run " + runcase + " *****");
			common.initDevice();
			findsetting();
			common.findViewByText("Settings").click();
			common.findViewByText("Device").click();
			common.findViewByText("Display").click();
			common.findViewByText("Sleep").click();
			common.findViewByText("60 seconds").click();
			common.infoLog("等待60s");
			common.waitTime(61);
			if (common.device.isScreenOn() == false)
			{
				common.passcase();
			}
			else {
				common.failcase(runcase);
			}
		} catch (Exception e) {
			// TODO: Auto-generated catch block
			common.handleException(e.getMessage());
		}
		finally {
			common.device.wakeUp();
			common.findViewByText("Never").click();
			common.startLog( "*****End to run " + runcase + " *****");
		}
	}
	//60s设置
	public void test10minutes() throws Exception{
		try {
			initUIAutomator(this.getName());

			common.startLog("*****Start to run " + runcase + " *****");
			common.initDevice();
			findsetting();
			common.findViewByText("Settings").click();
			common.findViewByText("Device").click();
			common.findViewByText("Display").click();
			common.findViewByText("Sleep").click();
			common.findViewByText("10 minutes").click();
			common.infoLog("等待10min");
			common.waitTime(601);
			if (common.device.isScreenOn() == false)
			{
				common.passcase();
			}
			else {
				common.failcase(runcase);
			}
		} catch (Exception e) {
			// TODO: Auto-generated catch block
			common.handleException(e.getMessage());
		}
		finally {
			common.device.wakeUp();
			common.findViewByText("Never").click();
			common.startLog( "*****End to run " + runcase + " *****");
		}
	}
	//10m设置
	public void testNever() throws Exception{
		try {
			initUIAutomator(this.getName());

			common.startLog("*****Start to run " + runcase + " *****");
			common.initDevice();
			findsetting();
			common.findViewByText("Settings").click();
			common.findViewByText("Device").click();
			common.findViewByText("Display").click();
			common.findViewByText("Sleep").click();
			common.findViewByText("Never").click();
			common.infoLog("等待10min");
			common.waitTime(601);
			if (common.device.isScreenOn() == false)
			{
				common.passcase();
			}
			else {
				common.failcase(runcase);
			}
		} catch (Exception e) {
			// TODO: Auto-generated catch block
			common.handleException(e.getMessage());
		}
		finally {
			common.device.wakeUp();
			common.findViewByText("Never").click();
			common.startLog( "*****End to run " + runcase + " *****");
		}
	}
	//never设置
	public static void main(String args[]){
		new UiAutomatorHelper("one.hardware.Testcase", "one.hardware.Testcase.Sleeptime_setting", "test15Seconds", "3");
	}

}
