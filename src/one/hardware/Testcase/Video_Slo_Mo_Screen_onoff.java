package one.hardware.Testcase;

import com.ckt.demo.UiAutomatorHelper;
import android.view.KeyEvent;
import one.hardware.Action.CameraAction;
import one.hardware.Util.Base;

public class Video_Slo_Mo_Screen_onoff extends Base {
	public void testAlo_Mo_Screen_onoff() throws Exception{
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run  + runcase +  *****");

			common.device.wakeUp();
			common.initDevice();
			common.startCamera();
			CameraAction.navconfig(one.hardware.Page.Camera.nav_menu[4]);
			common.startLog("*****慢速录像选择");

			common.cameraKey();
			sleep(3000);
			for(int i= 1;i<11;i++){
				device.pressKeyCode(KeyEvent.KEYCODE_POWER);
				sleep(3000);
			}

			common.cameraKey();

		}catch (Exception e) {
			common.handleException(e.getMessage());
		}
	}

	public static void main(String args[]){
		new UiAutomatorHelper("AppSioeye", "one.hardware.Testcase.Video_Slo_Mo_Screen_onoff", "testAlo_Mo_Screen_onoff", "4");
	}

}













