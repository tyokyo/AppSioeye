package one.hardware.Testcase;

import java.util.HashSet;
import one.hardware.Action.CameraAction;
import one.hardware.Util.Base;

/**
 * 图片设置
 *   "4M(16:9)",
	  "3M(4:3)",
	  "2M(16:9)"};
 */
public class PhotoCase extends Base{
	public void testPhoto4M169() throws Exception{
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			common.initDevice();
			common.startCamera();
			common.deletePhoto();
			
			CameraAction.configImageSize("4M(16:9)");
			
			HashSet<String> beforeTakePhotoList = common.FileList("/sdcard/Photo");
			common.cameraKey();
			sleep(3000);
			HashSet<String> afterTakePhotoList = common.FileList("/sdcard/Photo");
			HashSet<String> resultHashSet = common.result(afterTakePhotoList, beforeTakePhotoList);
			
			if (resultHashSet.size()==1) {
				String photopath = resultHashSet.iterator().next();
				double hw = common.getPicHeightWidth(photopath);
				double exp= 16/9;
				if (hw==exp) {
					common.infoLog(photopath+" -拍照成功");
					common.passcase();
				}else {
					common.infoLog(photopath+" -拍照失败");
					common.failcase(runcase);
				}
			}else {
				common.failcase(runcase);
			}
			common.startLog( "*****End to run " + runcase + " *****");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			common.handleException(e.getMessage());
		}
	}
	public void testPhoto3M43() throws Exception{
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			common.initDevice();
			common.startCamera();
			common.deletePhoto();
			
			CameraAction.navconfig(one.hardware.Page.Camera.nav_menu[2]);
			CameraAction.configImageSize("3M(4:3)");
			
			HashSet<String> beforeTakePhotoList = common.FileList("/sdcard/Photo");
			common.cameraKey();
			sleep(3000);
			HashSet<String> afterTakePhotoList = common.FileList("/sdcard/Photo");
			HashSet<String> resultHashSet = common.result(afterTakePhotoList, beforeTakePhotoList);
			
			if (resultHashSet.size()==1) {
				String photopath = resultHashSet.iterator().next();
				double hw = common.getPicHeightWidth(photopath);
				double exp= 4/3;
				if (hw==exp) {
					common.infoLog(photopath+" -拍照成功");
					common.passcase();
				}else {
					common.infoLog(photopath+" -拍照失败");
					common.failcase(runcase);
				}
			}else {
				common.failcase(runcase);
			}
			common.startLog( "*****End to run " + runcase + " *****");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			common.handleException(e.getMessage());
		}
	}
	public void testPhoto2M169() throws Exception{
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			common.initDevice();
			common.startCamera();
			common.deletePhoto();
			
			CameraAction.navconfig(one.hardware.Page.Camera.nav_menu[2]);
			CameraAction.configImageSize("2M(16:9)");
			
			HashSet<String> beforeTakePhotoList = common.FileList("/sdcard/Photo");
			common.cameraKey();
			sleep(3000);
			HashSet<String> afterTakePhotoList = common.FileList("/sdcard/Photo");
			HashSet<String> resultHashSet = common.result(afterTakePhotoList, beforeTakePhotoList);
			
			if (resultHashSet.size()==1) {
				String photopath = resultHashSet.iterator().next();
				double hw = common.getPicHeightWidth(photopath);
				double exp= 16/9;
				if (hw==exp) {
					common.infoLog(photopath+" -拍照成功");
					common.passcase();
				}else {
					common.infoLog(photopath+" -拍照失败");
					common.failcase(runcase);
				}
			}else {
				common.failcase(runcase);
			}
			common.startLog( "*****End to run " + runcase + " *****");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			common.handleException(e.getMessage());
		}
	}
}
