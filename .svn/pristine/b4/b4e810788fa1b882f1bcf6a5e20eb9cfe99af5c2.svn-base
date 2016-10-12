package one.hardware.Testcase;

/**
 * 延时录像过程中，多次灭亮屏对屏幕无影响（试验6次）
 * */
import java.util.HashSet;

import android.view.KeyEvent;

import com.android.uiautomator.core.UiDevice;
import com.ckt.demo.UiAutomatorHelper;

import one.hardware.Action.CameraAction;
import one.hardware.Action.VideoNode;
import one.hardware.Util.Base;
import one.hardware.Action.FileManagerAction;

import java.io.File;


public class Lapse_on_off_Screen extends Base {
	public void testLapseLapse_on_off_Screen() throws Exception {
		try{
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			common.initDevice();         			
			common.startCamera();		  
			CameraAction.navconfig(one.hardware.Page.Camera.nav_menu[5]);  
			
			HashSet<String> beforeTakeVideoList = common.FileList("/sdcard/video");   	
			common.cameraKey();               																									
			sleep(1000);	
						
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
						
			common.cameraKey();
			sleep(20000);
			HashSet<String> afterTakeVideoList = common.FileList("/sdcard/Video");   				 
			HashSet<String> resultHashSet = common.result(afterTakeVideoList, beforeTakeVideoList); 
			
			if (resultHashSet.size()==1) {  						 
				String videopath = resultHashSet.iterator().next();  
				common.infoLog("new file:"+videopath);       		 
				String videoName = new File(videopath).getName();   
				VideoNode videoNode = common.VideoInfo(videopath);   
				FileManagerAction.playVideoByFileManager(videoName); 
				if(videoNode.getDuration()<120){                    
					fail("max duration is 120 seconds");
				}
			}else {
				common.failcase(runcase);
			}
			
			common.backToHome();
					
		} catch (Exception e) {
		common.handleException(e.getMessage());
		}
	}
	public static void main(String[] args) {
		new UiAutomatorHelper("AppSioeye", "one.hardware.Testcase.Lapse_on_off_Screen", "testLapseLapse_on_off_Screen", "7");		
	}
}
