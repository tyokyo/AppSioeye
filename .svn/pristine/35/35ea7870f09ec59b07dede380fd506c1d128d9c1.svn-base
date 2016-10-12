/**
* 预览界面灭屏再亮屏,预览界面无影响
* 预览界面灭屏1min，再亮屏，预览界面无影响
*/
package one.hardware.Testcase;

import com.ckt.demo.UiAutomatorHelper;
import android.view.KeyEvent;
import com.android.uiautomator.core.UiDevice;
import one.hardware.Util.Base;


public class Review_Screen_onoff extends Base{
	

	public void testReview_Screen_onoff() throws Exception  {
		try{
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");    			
			common.startCamera();		  
			
			UiDevice.getInstance().pressKeyCode(KeyEvent.KEYCODE_POWER);         //按电源键6次
			sleep(1000);
			UiDevice.getInstance().pressKeyCode(KeyEvent.KEYCODE_POWER);   
			sleep(1000);
			UiDevice.getInstance().pressKeyCode(KeyEvent.KEYCODE_POWER);   
			sleep(1000);
			UiDevice.getInstance().pressKeyCode(KeyEvent.KEYCODE_POWER);   
			sleep(1000);
			UiDevice.getInstance().pressKeyCode(KeyEvent.KEYCODE_POWER);   
			sleep(1000);
			UiDevice.getInstance().pressKeyCode(KeyEvent.KEYCODE_POWER);   
			sleep(1000);
			UiDevice.getInstance().pressKeyCode(KeyEvent.KEYCODE_POWER);   
			sleep(1000);
			UiDevice.getInstance().pressKeyCode(KeyEvent.KEYCODE_POWER);   
			sleep(1000);
			UiDevice.getInstance().pressKeyCode(KeyEvent.KEYCODE_POWER);   
			sleep(1000);
			UiDevice.getInstance().pressKeyCode(KeyEvent.KEYCODE_POWER);   
			sleep(1000);
			UiDevice.getInstance().pressKeyCode(KeyEvent.KEYCODE_POWER);   		//灭屏1分钟
			sleep(60000);
			UiDevice.getInstance().pressKeyCode(KeyEvent.KEYCODE_POWER);   
			sleep(1000);
			
			
			System.out.println("验证程序包名："+UiDevice.getInstance().getCurrentPackageName());
			
			if(UiDevice.getInstance().isScreenOn()){
				System.out.println("testReview_Screen_onoff case was passed");
			}else {
				common.failcase("testReview_Screen_onoff failed");
			};
						
			} catch (Exception e) {
				common.handleException(e.getMessage());
				}				
}	

	public static void main(String[] args) {
		new UiAutomatorHelper("AppSioeye", "one.hardware.Testcase.Review_Screen_onoff ", "testReview_Screen_onoff()", "7");		
	}

}
