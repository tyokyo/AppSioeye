package one.hardware.Testcase;

import java.io.File;
import java.util.HashSet;
import one.hardware.Action.CameraAction;
import one.hardware.Action.FileManagerAction;
import one.hardware.Action.VideoNode;
import one.hardware.Util.Base;

public class LiveCase extends Base{
	/*
	 * 		  "480@30FPS",
		  "480@60FPS",
		  "480@120FPS",
		  "720@30FPS",
		  "720@60FPS",
		  "1080@30FPS"};
	 * */
	private void videoQualityAngle(String quality,String angle) throws Exception{
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			common.initDevice();
			common.startCamera();
			CameraAction.configVideoQuality(quality);
			CameraAction.configVideoAngle(angle);
			CameraAction.cameraVideo();

			HashSet<String> beforeTakeVideoList = common.FileList("/sdcard/video");
			common.cameraKey();
			CameraAction.cameraRecordTime();
			sleep(10000);
			CameraAction.cameraRecordTime();
			common.cameraKey();
			sleep(5000);
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
			// TODO Auto-generated catch block
			common.handleException(e.getMessage());
		}
	}
	public void testLive() throws Exception{
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			common.initDevice();

			common.startCamera();
			CameraAction.cameraLive();
			Thread.sleep(10000);

			common.passcase();

			common.startLog( "*****End to run " + runcase + " *****");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			common.handleException(e.getMessage());
		}
	}
	public void testL48030fpsSuperWide() throws Exception{
		String quality = one.hardware.Page.Camera.video_quality[0];
		String angle =one.hardware.Page.Camera.video_Angle[0];
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			common.initDevice();
			common.startCamera();
			CameraAction.configVideoQuality(quality);
			CameraAction.configVideoAngle(angle);

			CameraAction.navconfig(one.hardware.Page.Camera.nav_menu[0]);

			HashSet<String> beforeTakeVideoList = common.FileList("/sdcard/video");
			common.cameraKey();
			CameraAction.cameraRecordTime();
			sleep(20000);
			CameraAction.cameraRecordTime();
			common.cameraKey();
			sleep(5000);
			HashSet<String> afterTakeVideoList = common.FileList("/sdcard/Video");
			HashSet<String> resultHashSet = common.result(afterTakeVideoList, beforeTakeVideoList);

			common.findViewById(one.hardware.Page.Camera.camera_setting_shortcut_id);

			if (resultHashSet.size()==1) {
				String videopath = resultHashSet.iterator().next();
				common.infoLog("new file:"+videopath);
				String videoName = new File(videopath).getName();
				VideoNode activeNode = common.VideoInfo(videopath);
				if (common.checkVideoInfo(480, activeNode)) {
					common.infoLog("video info check success-"+videopath);
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
					common.infoLog("video info check failed"+videopath);
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
	public void testL48060fpsSuperWide() throws Exception{
		String quality = one.hardware.Page.Camera.video_quality[1];
		String angle =one.hardware.Page.Camera.video_Angle[0];
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			common.initDevice();
			common.startCamera();
			CameraAction.configVideoQuality(quality);
			CameraAction.configVideoAngle(angle);

			CameraAction.navconfig(one.hardware.Page.Camera.nav_menu[0]);

			HashSet<String> beforeTakeVideoList = common.FileList("/sdcard/video");
			common.cameraKey();
			CameraAction.cameraRecordTime();
			sleep(20000);
			CameraAction.cameraRecordTime();
			common.cameraKey();
			sleep(5000);
			HashSet<String> afterTakeVideoList = common.FileList("/sdcard/Video");
			HashSet<String> resultHashSet = common.result(afterTakeVideoList, beforeTakeVideoList);

			common.findViewById(one.hardware.Page.Camera.camera_setting_shortcut_id);

			if (resultHashSet.size()==1) {
				String videopath = resultHashSet.iterator().next();
				common.infoLog("new file:"+videopath);
				String videoName = new File(videopath).getName();
				VideoNode activeNode = common.VideoInfo(videopath);
				
				if (common.checkVideoInfo(480, activeNode)) {
					common.infoLog("video info check success-"+videopath);
					
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
					common.infoLog("video info check failed"+videopath);
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
	public void testL480120fpsSuperWide() throws Exception{
		String quality = one.hardware.Page.Camera.video_quality[2];
		String angle =one.hardware.Page.Camera.video_Angle[0];
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			common.initDevice();
			common.startCamera();
			CameraAction.configVideoQuality(quality);
			CameraAction.configVideoAngle(angle);

			CameraAction.navconfig(one.hardware.Page.Camera.nav_menu[0]);

			HashSet<String> beforeTakeVideoList = common.FileList("/sdcard/video");
			common.cameraKey();
			CameraAction.cameraRecordTime();
			sleep(20000);
			CameraAction.cameraRecordTime();
			common.cameraKey();
			sleep(5000);
			HashSet<String> afterTakeVideoList = common.FileList("/sdcard/Video");
			HashSet<String> resultHashSet = common.result(afterTakeVideoList, beforeTakeVideoList);

			common.findViewById(one.hardware.Page.Camera.camera_setting_shortcut_id);

			if (resultHashSet.size()==1) {
				String videopath = resultHashSet.iterator().next();
				common.infoLog("new file:"+videopath);
				String videoName = new File(videopath).getName();
				VideoNode activeNode = common.VideoInfo(videopath);
				
				if (common.checkVideoInfo(480, activeNode)) {
					common.infoLog("video info check success-"+videopath);
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
					common.infoLog("video info check failed"+videopath);
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
	public void testL72030fpsSuperWide() throws Exception{
		String quality = one.hardware.Page.Camera.video_quality[3];
		String angle =one.hardware.Page.Camera.video_Angle[0];
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			common.initDevice();
			common.startCamera();
			CameraAction.configVideoQuality(quality);
			CameraAction.configVideoAngle(angle);

			CameraAction.navconfig(one.hardware.Page.Camera.nav_menu[0]);

			HashSet<String> beforeTakeVideoList = common.FileList("/sdcard/video");
			common.cameraKey();
			CameraAction.cameraRecordTime();
			sleep(20000);
			CameraAction.cameraRecordTime();
			common.cameraKey();
			sleep(5000);
			HashSet<String> afterTakeVideoList = common.FileList("/sdcard/Video");
			HashSet<String> resultHashSet = common.result(afterTakeVideoList, beforeTakeVideoList);

			common.findViewById(one.hardware.Page.Camera.camera_setting_shortcut_id);

			if (resultHashSet.size()==1) {
				String videopath = resultHashSet.iterator().next();
				common.infoLog("new file:"+videopath);
				String videoName = new File(videopath).getName();
				VideoNode activeNode = common.VideoInfo(videopath);
				
				if (common.checkVideoInfo(480, activeNode)) {
					common.infoLog("video info check success-"+videopath);
					
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
					common.infoLog("video info check failed"+videopath);
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
	public void testL72060fpsSuperWide() throws Exception{
		String quality = one.hardware.Page.Camera.video_quality[4];
		String angle =one.hardware.Page.Camera.video_Angle[0];
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			common.initDevice();
			common.startCamera();
			CameraAction.configVideoQuality(quality);
			CameraAction.configVideoAngle(angle);

			CameraAction.navconfig(one.hardware.Page.Camera.nav_menu[0]);

			HashSet<String> beforeTakeVideoList = common.FileList("/sdcard/video");
			common.cameraKey();
			CameraAction.cameraRecordTime();
			sleep(20000);
			CameraAction.cameraRecordTime();
			common.cameraKey();
			sleep(5000);
			HashSet<String> afterTakeVideoList = common.FileList("/sdcard/Video");
			HashSet<String> resultHashSet = common.result(afterTakeVideoList, beforeTakeVideoList);

			common.findViewById(one.hardware.Page.Camera.camera_setting_shortcut_id);

			if (resultHashSet.size()==1) {
				String videopath = resultHashSet.iterator().next();
				common.infoLog("new file:"+videopath);
				String videoName = new File(videopath).getName();
				VideoNode activeNode = common.VideoInfo(videopath);
				
				if (common.checkVideoInfo(480, activeNode)) {
					common.infoLog("video info check success-"+videopath);
					
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
					common.infoLog("video info check failed"+videopath);
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
	public void testL108030fpsSuperWide() throws Exception{
		String quality = one.hardware.Page.Camera.video_quality[5];
		String angle =one.hardware.Page.Camera.video_Angle[0];
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			common.initDevice();
			common.startCamera();
			CameraAction.configVideoQuality(quality);
			CameraAction.configVideoAngle(angle);

			CameraAction.navconfig(one.hardware.Page.Camera.nav_menu[0]);

			HashSet<String> beforeTakeVideoList = common.FileList("/sdcard/video");
			common.cameraKey();
			CameraAction.cameraRecordTime();
			sleep(20000);
			CameraAction.cameraRecordTime();
			common.cameraKey();
			sleep(5000);
			HashSet<String> afterTakeVideoList = common.FileList("/sdcard/Video");
			HashSet<String> resultHashSet = common.result(afterTakeVideoList, beforeTakeVideoList);

			common.findViewById(one.hardware.Page.Camera.camera_setting_shortcut_id);

			if (resultHashSet.size()==1) {
				String videopath = resultHashSet.iterator().next();
				common.infoLog("new file:"+videopath);
				String videoName = new File(videopath).getName();
				VideoNode activeNode = common.VideoInfo(videopath);
				
				if (common.checkVideoInfo(480, activeNode)) {
					common.infoLog("video info check success-"+videopath);
					
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
					common.infoLog("video info check failed"+videopath);
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
