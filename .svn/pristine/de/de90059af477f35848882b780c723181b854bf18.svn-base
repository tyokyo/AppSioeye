package one.hardware.Testcase;
/*
 * Burst模式下，将Up改为Down模式，且被勾选
 */
import com.android.uiautomator.core.UiCollection;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiSelector;
import com.ckt.demo.UiAutomatorHelper;
//Down To Up UP模式被选中，且被打钩标识
import android.view.KeyEvent;
import one.hardware.Action.CameraAction;
import one.hardware.Util.Base;

public class BurstUpToDown extends Base{
	int flag1;
	public void testBurstUpToDown() throws Exception{
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
			common.clickViewByText("Up/Down/Auto");
			common.clickViewByText("Down");
			common.clickViewByText("Up/Down/Auto");
			//获取relative
			UiCollection pic = new UiCollection(new UiSelector().className("android.widget.ListView"));
			//int count = pic.getChildCount(new UiSelector().className("android.widget.RelativeLayout"));
			//for (int i=0;i<count;i++){
				UiObject ui = pic.getChildByInstance(new UiSelector().className("android.widget.RelativeLayout"), 1);
				UiObject uo = ui.getChild(new UiSelector().className("android.widget.TextView"));
				UiObject gx = ui.getChild(new UiSelector().className("android.widget.ImageView"));
				String text = uo.getText();
				if (ui.exists() && uo.exists() && "Down".equals(text) && gx.exists()){
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
		new UiAutomatorHelper("AppSioeye", "one.hardware.Testcase.BurstUpToDown", "testBurstUpToDown", "10");
	}
}
