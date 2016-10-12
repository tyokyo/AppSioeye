package one.hardware.Testcase;
/*
 * 1.修改视频质量为720@60FPS
 * 2.修改视角为Wide
 * 3.修改上下颠倒为auto
 * 4.切换到延时录像模式后再切换为普通录像
 * 所有设置项都修改成功，更改的设置项都没有改变
 */
import com.ckt.demo.UiAutomatorHelper;

import android.view.KeyEvent;
import one.hardware.Action.CameraAction;
import one.hardware.Util.Base;

public class VideoSettings extends Base{
	String quality = one.hardware.Page.Camera.video_quality[4];
	String angle =one.hardware.Page.Camera.video_Angle[1];	
	int flag1 = 0;
	int flag2 = 0;
	public void testVideoSettings() throws Exception{
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			if(!device.isScreenOn()){
				device.pressKeyCode(KeyEvent.KEYCODE_POWER);
				common.infoLog("点击POWER使屏幕点亮");
			}
			common.initDevice();
			common.startCamera();
			CameraAction.configVideoQuality(quality);
			//Super wide与wide不会被区分所以，有个bug。			
			CameraAction.configVideoAngle(angle);					
			//将Up改为Auto
			CameraAction.cameraSetting();
			common.ScrollViewByText("Up/Down/Auto");
			common.clickViewByText("Auto");
			common.device.pressBack();
			//切换到延时录像再切换到普通录像
			CameraAction.navconfig(one.hardware.Page.Camera.nav_menu[5]);
			if(common.findViewByText2("3s").exists() && common.findViewByText2("2H09M").exists()){
				//通过检查当前页面是否有3s和2H09M存在，若存在，则正确，并记录flag1=1即true
				flag1 = 1;
			}else{
				flag1 = 0;
				common.failcase("切换到延时录像失败");
			}
			CameraAction.navconfig(one.hardware.Page.Camera.nav_menu[1]);			
			if(common.findViewByText2("720@60FPS").exists() && common.findViewByText2("0H40M").exists()){
				flag2 = 1;
			}else{
				flag2 = 0;
				common.failcase("切换到普通录像失败");
			}
			common.infoLog("flag2="+flag2);			
			if(flag1==1 && flag2 ==1){
				common.passcase();
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
		new UiAutomatorHelper("AppSioeye", "one.hardware.Testcase.VideoSettings", "testVideoSettings", "11");
	}
}
