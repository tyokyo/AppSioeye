package one.hardware.Testcase;

import java.io.File;
import java.util.HashSet;

import one.hardware.Action.CameraAction;
import one.hardware.Action.FileManagerAction;
import one.hardware.Action.VideoNode;
import one.hardware.Util.Base;

public class SlomoCase extends Base{
	public void testSloMoSuperWide() throws Exception{
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");

			boolean result = true;
			String angle =one.hardware.Page.Camera.video_Angle[0];
			common.initDevice();
			common.startCamera();
			CameraAction.configVideoAngle(angle);
			CameraAction.navconfig(one.hardware.Page.Camera.nav_menu[4]);
			
			HashSet<String> beforeTakeVideoList = common.FileList("/sdcard/video");
			common.cameraKey();
			sleep(10000);
			CameraAction.cameraRecordTime();
			sleep(5000);
			boolean mostatus = true;
			for (int i = 0; i < 20; i++) {
				if (!CameraAction.checkmovalue(4)) {
					mostatus=false;
				}else {
					mostatus=true;
				}
				sleep(2000);
			}
			CameraAction.cameraRecordTime();
			common.cameraKey();
			sleep(3000);

			if (mostatus) {
				HashSet<String> afterTakeVideoList = common.FileList("/sdcard/Video");
				HashSet<String> resultHashSet = common.result(afterTakeVideoList, beforeTakeVideoList);
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
							result= true;
						}
					}else {
						common.infoLog("video info check failed"+videopath);
						result= false;
					}
				}else {
					result= false;
				}
			}else {
				result= false;
			}
			if (result) {
				common.passcase();
			}else {
				common.failcase(runcase);
			}
			common.startLog( "*****End to run " + runcase + " *****");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			common.handleException(e.getMessage());
		}
	}
	public void testSloMoWide() throws Exception{
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");

			boolean result = true;
			String angle =one.hardware.Page.Camera.video_Angle[1];
			common.initDevice();
			common.startCamera();
			CameraAction.configVideoAngle(angle);
			CameraAction.navconfig(one.hardware.Page.Camera.nav_menu[4]);
			
			HashSet<String> beforeTakeVideoList = common.FileList("/sdcard/video");
			common.cameraKey();
			sleep(10000);
			CameraAction.cameraRecordTime();
			sleep(5000);
			boolean mostatus = true;
			for (int i = 0; i < 20; i++) {
				if (!CameraAction.checkmovalue(4)) {
					mostatus=false;
				}else {
					mostatus=true;
				}
				sleep(2000);
			}
			CameraAction.cameraRecordTime();
			common.cameraKey();
			sleep(3000);

			if (mostatus) {
				HashSet<String> afterTakeVideoList = common.FileList("/sdcard/Video");
				HashSet<String> resultHashSet = common.result(afterTakeVideoList, beforeTakeVideoList);
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
							result= true;
						}
					}else {
						common.infoLog("video info check failed"+videopath);
						result= false;
					}
				}else {
					result= false;
				}
			}else {
				result= false;
			}
			if (result) {
				common.passcase();
			}else {
				common.failcase(runcase);
			}
			common.startLog( "*****End to run " + runcase + " *****");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			common.handleException(e.getMessage());
		}
	}
	public void testSloMoMedium() throws Exception{
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");

			boolean result = true;
			String angle =one.hardware.Page.Camera.video_Angle[2];
			common.initDevice();
			common.startCamera();
			CameraAction.configVideoAngle(angle);
			CameraAction.navconfig(one.hardware.Page.Camera.nav_menu[4]);
			
			HashSet<String> beforeTakeVideoList = common.FileList("/sdcard/video");
			common.cameraKey();
			sleep(10000);
			CameraAction.cameraRecordTime();
			sleep(5000);
			boolean mostatus = true;
			for (int i = 0; i < 20; i++) {
				if (!CameraAction.checkmovalue(4)) {
					mostatus=false;
				}else {
					mostatus=true;
				}
				sleep(2000);
			}
			CameraAction.cameraRecordTime();
			common.cameraKey();
			sleep(3000);

			if (mostatus) {
				HashSet<String> afterTakeVideoList = common.FileList("/sdcard/Video");
				HashSet<String> resultHashSet = common.result(afterTakeVideoList, beforeTakeVideoList);
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
							result= true;
						}
					}else {
						common.infoLog("video info check failed"+videopath);
						result= false;
					}
				}else {
					result= false;
				}
			}else {
				result= false;
			}
			if (result) {
				common.passcase();
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
