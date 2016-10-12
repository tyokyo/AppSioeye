package one.hardware.Testcase;
/*
 * Burst模式下，将Up改为Auto
 *            将Down改为Auto
 *切换的时候响应的模式被勾选
 */
import com.android.uiautomator.core.UiCollection;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiSelector;
import com.ckt.demo.UiAutomatorHelper;

import android.view.KeyEvent;
import one.hardware.Action.CameraAction;
import one.hardware.Util.Base;

public class BurstDownUpToAuto extends Base{
	int flag1;
	int flag2;
	public void testBurstDownUpToAuto() throws Exception{
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
			//Up To Auto
			common.clickViewByText("Up/Down/Auto");
			common.clickViewByText("Auto");
			common.clickViewByText("Up/Down/Auto");
			
			UiCollection pic = new UiCollection(new UiSelector().className("android.widget.ListView"));
			UiObject ui = pic.getChildByInstance(new UiSelector().className("android.widget.RelativeLayout"), 2);
			UiObject uo = ui.getChild(new UiSelector().className("android.widget.TextView"));
			UiObject gx = ui.getChild(new UiSelector().className("android.widget.ImageView"));
			String text = uo.getText();
			if (ui.exists() && uo.exists() && "Auto".equals(text) && gx.exists()){
				//common.passcase();
				//使相机回到初始状态Up
				flag1 = 1;
				common.infoLog("flag1 pass = "+flag1);
				common.clickViewByText("Up");
			}else{
				flag1 = 0;
				common.infoLog("flag1 failed = "+flag1);
				common.failcase(text);
			}
					
			//Down To Auto
			common.clickViewByText("Up/Down/Auto");
			common.clickViewByText("Down");
			common.clickViewByText("Up/Down/Auto");
			common.clickViewByText("Auto");
			common.clickViewByText("Up/Down/Auto");
			
			UiCollection pic1 = new UiCollection(new UiSelector().className("android.widget.ListView"));
			UiObject ui1 = pic1.getChildByInstance(new UiSelector().className("android.widget.RelativeLayout"), 2);
			UiObject uo1 = ui1.getChild(new UiSelector().className("android.widget.TextView"));
			UiObject gx1 = ui1.getChild(new UiSelector().className("android.widget.ImageView"));
			String text1 = uo.getText();
			if (ui1.exists() && uo1.exists() && "Auto".equals(text1) && gx1.exists()){
				//使相机回到初始状态Up
				flag2 = 1;
				common.infoLog("flag2 pass = "+ flag2);
				common.clickViewByText("Up");
			}else{
				flag2 = 0;
				common.infoLog("flag2 failed = " +flag2);				
				common.failcase(text1);
			}		
			if (flag1 == 1 && flag2 == 1){
				common.passcase();
			}else{
				common.failcase(runcase);
			}		
		} catch (Exception e) {
			// TODO: handle exception
			common.handleException(e.getMessage());
		}
	}
	public static void main(String[] args){
		new UiAutomatorHelper("AppSioeye", "one.hardware.Testcase.BurstDownUpToAuto", "testBurstDownUpToAuto", "10");
	}
}
