package one.hardware.Testcase;
/*
 * case:直播模式下,更改上下颠倒设置，UP改为down,更改成功，取景界面有相应变化
 */
import com.ckt.demo.UiAutomatorHelper;

import android.view.KeyEvent;
import one.hardware.Action.CameraAction;
import one.hardware.Util.Base;

public class LiveUpDown extends Base{
	public void testLiveUpDown() throws Exception{
		try{
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			if(!device.isScreenOn()){
				device.pressKeyCode(KeyEvent.KEYCODE_POWER);
				common.infoLog("点击POWER使屏幕点亮");
			}
			common.initDevice();
			common.startCamera();
			CameraAction.cameraLive();
			int jd1 = device.getDisplayRotation();
			if(jd1 == 1){
				CameraAction.cameraSetting();
				common.ScrollViewByText("Up/Down/Auto");
				common.clickViewByText("Up/Down/Auto");
				common.clickViewByText("Down");
				int jd2 = device.getDisplayRotation();
				if(jd2 == 3){
					common.infoLog("Up设置为Down成功");
					common.passcase();
					//更改某些不能够初始化的操纵后,应该还原，以便用例继续执行，以下是还原刚才的步骤
					common.clickViewByText("Up/Down/Auto");
					common.clickViewByText("Up");
					int jd3 = device.getDisplayRotation();
					if(jd3 == 1){
						common.infoLog("操纵还原成功且用例执行成功");
					}else{
						common.infoLog("操纵还原失败");
					}			
				}else{
					common.infoLog("Up设置为Down失败");
					common.failcase(runcase);
				}
			}else{
				common.infoLog("初始条件不为Up");
				common.failcase(runcase);
			}
			common.startLog( "*****End to run " + runcase + " *****");
		} catch (Exception e) {
				// TODO: handle exception
				common.handleException(e.getMessage());
		}
	}
	public static void main(String[] args){
		new UiAutomatorHelper("AppSioeye", "one.hardware.Testcase.LiveUpDown", "testLiveUpDown", "11");
	}
}
