package one.hardware.Testcase;
/*
 * Burst模式下，将Down切换为Up，Up被打钩
 */
import com.android.uiautomator.core.UiCollection;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiSelector;
import com.ckt.demo.UiAutomatorHelper;

import android.view.KeyEvent;
import one.hardware.Action.CameraAction;
import one.hardware.Util.Base;

public class BurstDownToUp extends Base{
	public void testBurstDownToUp() throws Exception{
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			if(!device.isScreenOn()){
				device.pressKeyCode(KeyEvent.KEYCODE_POWER);
				common.infoLog("点击POWER使屏幕点亮");
			}
			common.initDevice();
			common.startCamera();
			CameraAction.navconfig(one.hardware.Page.Camera.nav_menu[3]);
			CameraAction.cameraSetting();
			//先切换到Down，再测试Down到Up
			common.clickViewByText("Up/Down/Auto");
			common.clickViewByText("Down");
			common.clickViewByText("Up/Down/Auto");
			common.clickViewByText("Up");
			common.clickViewByText("Up/Down/Auto");
			
			UiCollection pic = new UiCollection(new UiSelector().className("android.widget.ListView"));
			UiObject ui = pic.getChildByInstance(new UiSelector().className("android.widget.RelativeLayout"), 0);
			UiObject uo = ui.getChild(new UiSelector().className("android.widget.TextView"));
			UiObject gx = ui.getChild(new UiSelector().className("android.widget.ImageView"));
			String text = uo.getText();
			if (ui.exists() && uo.exists() && "Up".equals(text) && gx.exists()){
				common.passcase();
				//使相机回到初始状态Up
				common.clickViewByText("Up");
			}else{
				common.failcase(runcase);
			}	
			common.startLog( "*****End to run " + runcase + " *****");
		} catch (Exception e) {
			// TODO: handle exception
			common.handleException(e.getMessage());
		}
	}
	public static void main(String[] args){
		new UiAutomatorHelper("AppSioeye", "one.hardware.Testcase.BurstDownToUp", "testBurstDownToUp", "10");
	}
}
