package one.hardware.Testcase;
/*
 * case:普通录像中，单击power键，熄屏，正常录制；
 * 		再次点击power键，亮屏，正常录制
 */
import java.io.File;
import java.util.HashSet;
import com.ckt.demo.UiAutomatorHelper;
import android.view.KeyEvent;
import one.hardware.Action.CameraAction;
import one.hardware.Action.FileManagerAction;
import one.hardware.Util.Base;
import one.hardware.Util.Common;

public class VideoClickPower extends Base{
	public static int WaitTime = 10;
	public void testVideoClickPower() throws Exception{
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			if(!device.isScreenOn()){
				device.pressKeyCode(KeyEvent.KEYCODE_POWER);
				common.infoLog("点击POWER使屏幕点亮");
			}
			common.initDevice();
			common.startCamera();
			HashSet<String> beforeTakeVideoList = common.FileList("/sdcard/video");
			common.infoLog("亮屏录制"+WaitTime+"秒");
			common.cameraKey();
			
			CameraAction.cameraRecordTime();
			Common.waitTime(WaitTime);
			
			common.infoLog("灭屏录制"+WaitTime+"秒");
			device.pressKeyCode(KeyEvent.KEYCODE_POWER);
			Common.waitTime(WaitTime);
			
			common.infoLog("再次亮屏录制"+WaitTime+"秒");
			device.pressKeyCode(KeyEvent.KEYCODE_POWER);
			Common.waitTime(WaitTime);
					
			CameraAction.cameraRecordTime();
			common.cameraKey();
			
			common.infoLog("总共录制"+3*WaitTime+"秒");			
			sleep(3000);			
			HashSet<String> afterTakeVideoList = common.FileList("/sdcard/Video");
			HashSet<String> resultHashSet = common.result(afterTakeVideoList, beforeTakeVideoList);
			
			if (resultHashSet.size()==1) {
				String videopath = resultHashSet.iterator().next();
				common.infoLog("new file:"+videopath);
				String videoName = new File(videopath).getName();
				common.VideoInfo(videopath);
				FileManagerAction.playVideoByFileManager(videoName);

				if (common.findViewByText2("^Can't play this video.*").exists()) {
					common.infoLog(videoName+" 播放失败" + "-Can't play this video");
					common.findViewById2("android:id/button1").clickAndWaitForNewWindow();
					common.failcase(runcase);
					throw new Exception("FindObject" + "Can't play this video");
				}else {
					common.infoLog(videoName+" 播放成功");
					common.passcase();
				}
			}else {
				common.failcase(runcase);
			
			}		
			common.startLog( "*****End to run " + runcase + " *****");
		} catch (Exception e) {
			// TODO: handle exception
			common.handleException(e.getMessage());
		}
	}
	public static void main(String[] args){
		new UiAutomatorHelper("AppSioeye", "one.hardware.Testcase.VideoClickPower", "testVideoClickPower", "11");
	}
}
