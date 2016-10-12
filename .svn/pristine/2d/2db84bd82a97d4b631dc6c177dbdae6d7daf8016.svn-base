package one.hardware.Testcase;
/**
 * 睡眠时间设置15s 60s 10min Never
 * */
import com.ckt.demo.UiAutomatorHelper;
import android.view.KeyEvent;
import one.hardware.Action.CameraAction;
import one.hardware.Util.Base;
public class Video_Slo_Mo_Powerkey  extends Base{
	public void test()throws Exception{
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run  + runcase +  *****");
			common.initDevice();
			common.startCamera();
			CameraAction.navconfig(one.hardware.Page.Camera.nav_menu[4]);
			common.cameraKey();
			device.pressKeyCode(KeyEvent.KEYCODE_POWER);
			if (device.isScreenOn() == false && common.findViewById("com.hicam:id/recording_time2").exists() == true)
			{
				common.infoLog("灭屏成功");
				device.pressKeyCode(KeyEvent.KEYCODE_POWER);
				common.waitTime(3);
				if(device.isScreenOn() == true && common.findViewById("com.hicam:id/recording_time2").exists() == true)
				{
					System.out.println("灭屏成功");
					common.cameraKey();
					common.infoLog("成功点亮");
					common.passcase();
				}
				else
				{
					common.failcase(runcase);
				}
			}
			else
			{
				common.failcase(runcase);
			}
		} catch (Exception e) {
			common.handleException(e.getMessage());
			// TODO: handle exception
		}
		finally {
			if(!device.isScreenOn()){
				common.device.wakeUp();
				common.infoLog("点击POWER使屏幕点亮");
			}
			common.startLog("*****End to run " + runcase + " *****");
		}
	}
	public static void main(String args[]){
		new UiAutomatorHelper("AppSioeye", "one.hardware.Testcase.Video_Slo_Mo_Powerkey", "test", "3");
	}

}
