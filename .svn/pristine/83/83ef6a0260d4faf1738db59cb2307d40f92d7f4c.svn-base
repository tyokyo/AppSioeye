package one.hardware.Testcase;

import java.io.File;
import java.util.HashSet;

import one.hardware.Action.CameraAction;
import one.hardware.Action.FileManagerAction;
import one.hardware.Action.VideoNode;
import one.hardware.Util.Base;

public class LapseCase extends Base{
	public void testTLap2s48030AllAngle() throws Exception{
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			
			boolean result = true;
			String quality = one.hardware.Page.Camera.video_quality[0];
			int anglesize = one.hardware.Page.Camera.video_Angle.length;
			for (int t = 0; t <anglesize; t++) {
				String angle =one.hardware.Page.Camera.video_Angle[t];
				common.infoLog("start to test angle-"+angle);
				common.initDevice();
				common.startCamera();
				CameraAction.configVideoQuality(quality);
				CameraAction.configVideoAngle(t);
				CameraAction.configTimeLapse(one.hardware.Page.Camera.lapse_time[0]);
				
				HashSet<String> beforeTakeVideoList = common.FileList("/sdcard/video");
				common.cameraKey();
				sleep(10000);
				CameraAction.cameraRecordTime();
				sleep(5000);
				boolean lapstatus = true;
				for (int i = 0; i < 20; i++) {
					if (!CameraAction.checklapsevalue(2)) {
						lapstatus=false;
					}else {
						lapstatus=true;
					}
					sleep(2000);
				}
				CameraAction.cameraRecordTime();
				common.cameraKey();
				sleep(3000);
				
				if (lapstatus) {
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
							break;
						}
					}else {
						result= false;
						break;
					}
				}else {
					result= false;
					break;
				}
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
	public void testTLap2s48060AllAngle() throws Exception{
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			
			boolean result = true;
			String quality = one.hardware.Page.Camera.video_quality[1];
			int anglesize = one.hardware.Page.Camera.video_Angle.length;
			for (int t = 0; t <anglesize; t++) {
				String angle =one.hardware.Page.Camera.video_Angle[t];
				common.infoLog("start to test angle-"+angle);
				common.initDevice();
				common.startCamera();
				CameraAction.configVideoQuality(quality);
				CameraAction.configVideoAngle(angle);
				CameraAction.configTimeLapse(one.hardware.Page.Camera.lapse_time[0]);
				
				HashSet<String> beforeTakeVideoList = common.FileList("/sdcard/video");
				common.cameraKey();
				sleep(10000);
				CameraAction.cameraRecordTime();
				sleep(5000);
				boolean lapstatus = true;
				for (int i = 0; i < 20; i++) {
					if (!CameraAction.checklapsevalue(2)) {
						lapstatus=false;
					}else {
						lapstatus=true;
					}
					sleep(2000);
				}
				CameraAction.cameraRecordTime();
				common.cameraKey();
				sleep(3000);
				
				if (lapstatus) {
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
							break;
						}
					}else {
						result= false;
						break;
					}
				}else {
					result= false;
					break;
				}
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
	public void testTLap2s480120AllAngle() throws Exception{
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			
			boolean result = true;
			String quality = one.hardware.Page.Camera.video_quality[2];
			int anglesize = one.hardware.Page.Camera.video_Angle.length;
			for (int t = 0; t <anglesize; t++) {
				String angle =one.hardware.Page.Camera.video_Angle[t];
				common.infoLog("start to test angle-"+angle);
				common.initDevice();
				common.startCamera();
				CameraAction.configVideoQuality(quality);
				CameraAction.configVideoAngle(angle);
				CameraAction.configTimeLapse(one.hardware.Page.Camera.lapse_time[0]);
				
				HashSet<String> beforeTakeVideoList = common.FileList("/sdcard/video");
				common.cameraKey();
				sleep(10000);
				CameraAction.cameraRecordTime();
				sleep(5000);
				boolean lapstatus = true;
				for (int i = 0; i < 20; i++) {
					if (!CameraAction.checklapsevalue(2)) {
						lapstatus=false;
					}else {
						lapstatus=true;
					}
					sleep(2000);
				}
				CameraAction.cameraRecordTime();
				common.cameraKey();
				sleep(3000);
				
				if (lapstatus) {
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
							break;
						}
					}else {
						result= false;
						break;
					}
				}else {
					result= false;
					break;
				}
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
	public void testTLap2s72030AllAngle() throws Exception{
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			
			boolean result = true;
			String quality = one.hardware.Page.Camera.video_quality[3];
			int anglesize = one.hardware.Page.Camera.video_Angle.length;
			for (int t = 0; t <anglesize; t++) {
				String angle =one.hardware.Page.Camera.video_Angle[t];
				common.infoLog("start to test angle-"+angle);
				common.initDevice();
				common.startCamera();
				CameraAction.configVideoQuality(quality);
				CameraAction.configVideoAngle(angle);
				CameraAction.configTimeLapse(one.hardware.Page.Camera.lapse_time[0]);
				
				HashSet<String> beforeTakeVideoList = common.FileList("/sdcard/video");
				common.cameraKey();
				sleep(10000);
				CameraAction.cameraRecordTime();
				sleep(5000);
				boolean lapstatus = true;
				for (int i = 0; i < 20; i++) {
					if (!CameraAction.checklapsevalue(2)) {
						lapstatus=false;
					}else {
						lapstatus=true;
					}
					sleep(2000);
				}
				CameraAction.cameraRecordTime();
				common.cameraKey();
				sleep(3000);
				
				if (lapstatus) {
					HashSet<String> afterTakeVideoList = common.FileList("/sdcard/Video");
					HashSet<String> resultHashSet = common.result(afterTakeVideoList, beforeTakeVideoList);
					if (resultHashSet.size()==1) {
						String videopath = resultHashSet.iterator().next();
						common.infoLog("new file:"+videopath);
						String videoName = new File(videopath).getName();
						VideoNode activeNode = common.VideoInfo(videopath);
						if (common.checkVideoInfo(720, activeNode)) {
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
							break;
						}
					}else {
						result= false;
						break;
					}
				}else {
					result= false;
					break;
				}
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
	public void testTLap2s72060AllAngle() throws Exception{
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			
			boolean result = true;
			String quality = one.hardware.Page.Camera.video_quality[4];
			int anglesize = one.hardware.Page.Camera.video_Angle.length;
			for (int t = 0; t <anglesize; t++) {
				String angle =one.hardware.Page.Camera.video_Angle[t];
				common.infoLog("start to test angle-"+angle);
				common.initDevice();
				common.startCamera();
				CameraAction.configVideoQuality(quality);
				CameraAction.configVideoAngle(angle);
				CameraAction.configTimeLapse(one.hardware.Page.Camera.lapse_time[0]);
				
				HashSet<String> beforeTakeVideoList = common.FileList("/sdcard/video");
				common.cameraKey();
				sleep(10000);
				CameraAction.cameraRecordTime();
				sleep(5000);
				boolean lapstatus = true;
				for (int i = 0; i < 20; i++) {
					if (!CameraAction.checklapsevalue(2)) {
						lapstatus=false;
					}else {
						lapstatus=true;
					}
					sleep(2000);
				}
				CameraAction.cameraRecordTime();
				common.cameraKey();
				sleep(3000);
				
				if (lapstatus) {
					HashSet<String> afterTakeVideoList = common.FileList("/sdcard/Video");
					HashSet<String> resultHashSet = common.result(afterTakeVideoList, beforeTakeVideoList);
					if (resultHashSet.size()==1) {
						String videopath = resultHashSet.iterator().next();
						common.infoLog("new file:"+videopath);
						String videoName = new File(videopath).getName();
						VideoNode activeNode = common.VideoInfo(videopath);
						if (common.checkVideoInfo(720, activeNode)) {
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
							break;
						}
					}else {
						result= false;
						break;
					}
				}else {
					result= false;
					break;
				}
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
	public void testTLap2s108030AllAngle() throws Exception{
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			
			boolean result = true;
			String quality = one.hardware.Page.Camera.video_quality[5];
			int anglesize = one.hardware.Page.Camera.video_Angle.length;
			for (int t = 0; t <anglesize; t++) {
				String angle =one.hardware.Page.Camera.video_Angle[t];
				common.infoLog("start to test angle-"+angle);
				common.initDevice();
				common.startCamera();
				CameraAction.configVideoQuality(quality);
				CameraAction.configVideoAngle(angle);
				CameraAction.configTimeLapse(one.hardware.Page.Camera.lapse_time[0]);
				
				HashSet<String> beforeTakeVideoList = common.FileList("/sdcard/video");
				common.cameraKey();
				sleep(10000);
				CameraAction.cameraRecordTime();
				sleep(5000);
				boolean lapstatus = true;
				for (int i = 0; i < 20; i++) {
					if (!CameraAction.checklapsevalue(2)) {
						lapstatus=false;
					}else {
						lapstatus=true;
					}
					sleep(2000);
				}
				CameraAction.cameraRecordTime();
				common.cameraKey();
				sleep(3000);
				
				if (lapstatus) {
					HashSet<String> afterTakeVideoList = common.FileList("/sdcard/Video");
					HashSet<String> resultHashSet = common.result(afterTakeVideoList, beforeTakeVideoList);
					if (resultHashSet.size()==1) {
						String videopath = resultHashSet.iterator().next();
						common.infoLog("new file:"+videopath);
						String videoName = new File(videopath).getName();
						VideoNode activeNode = common.VideoInfo(videopath);
						if (common.checkVideoInfo(1080, activeNode)) {
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
							break;
						}
					}else {
						result= false;
						break;
					}
				}else {
					result= false;
					break;
				}
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
	public void testTLap3s48030AllAngle() throws Exception{
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			
			boolean result = true;
			String quality = one.hardware.Page.Camera.video_quality[0];
			int anglesize = one.hardware.Page.Camera.video_Angle.length;
			for (int t = 0; t <anglesize; t++) {
				String angle =one.hardware.Page.Camera.video_Angle[t];
				common.infoLog("start to test angle-"+angle);
				common.initDevice();
				common.startCamera();
				CameraAction.configVideoQuality(quality);
				CameraAction.configVideoAngle(angle);
				CameraAction.configTimeLapse(one.hardware.Page.Camera.lapse_time[1]);
				
				HashSet<String> beforeTakeVideoList = common.FileList("/sdcard/video");
				common.cameraKey();
				sleep(10000);
				CameraAction.cameraRecordTime();
				sleep(5000);
				boolean lapstatus = true;
				for (int i = 0; i < 20; i++) {
					if (!CameraAction.checklapsevalue(3)) {
						lapstatus=false;
					}else {
						lapstatus=true;
					}
					sleep(2000);
				}
				CameraAction.cameraRecordTime();
				common.cameraKey();
				sleep(3000);
				
				if (lapstatus) {
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
							break;
						}
					}else {
						result= false;
						break;
					}
				}else {
					result= false;
					break;
				}
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
	public void testTLap3s48060AllAngle() throws Exception{
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			
			boolean result = true;
			String quality = one.hardware.Page.Camera.video_quality[1];
			int anglesize = one.hardware.Page.Camera.video_Angle.length;
			for (int t = 0; t <anglesize; t++) {
				String angle =one.hardware.Page.Camera.video_Angle[t];
				common.infoLog("start to test angle-"+angle);
				common.initDevice();
				common.startCamera();
				CameraAction.configVideoQuality(quality);
				CameraAction.configVideoAngle(angle);
				CameraAction.configTimeLapse(one.hardware.Page.Camera.lapse_time[1]);
				
				HashSet<String> beforeTakeVideoList = common.FileList("/sdcard/video");
				common.cameraKey();
				sleep(10000);
				CameraAction.cameraRecordTime();
				sleep(5000);
				boolean lapstatus = true;
				for (int i = 0; i < 20; i++) {
					if (!CameraAction.checklapsevalue(3)) {
						lapstatus=false;
					}else {
						lapstatus=true;
					}
					sleep(2000);
				}
				CameraAction.cameraRecordTime();
				common.cameraKey();
				sleep(3000);
				
				if (lapstatus) {
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
							break;
						}
					}else {
						result= false;
						break;
					}
				}else {
					result= false;
					break;
				}
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
	public void testTLap3s480120AllAngle() throws Exception{
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			
			boolean result = true;
			String quality = one.hardware.Page.Camera.video_quality[2];
			int anglesize = one.hardware.Page.Camera.video_Angle.length;
			for (int t = 0; t <anglesize; t++) {
				String angle =one.hardware.Page.Camera.video_Angle[t];
				common.infoLog("start to test angle-"+angle);
				common.initDevice();
				common.startCamera();
				CameraAction.configVideoQuality(quality);
				CameraAction.configVideoAngle(angle);
				CameraAction.configTimeLapse(one.hardware.Page.Camera.lapse_time[1]);
				
				HashSet<String> beforeTakeVideoList = common.FileList("/sdcard/video");
				common.cameraKey();
				sleep(10000);
				CameraAction.cameraRecordTime();
				sleep(5000);
				boolean lapstatus = true;
				for (int i = 0; i < 20; i++) {
					if (!CameraAction.checklapsevalue(3)) {
						lapstatus=false;
					}else {
						lapstatus=true;
					}
					sleep(2000);
				}
				CameraAction.cameraRecordTime();
				common.cameraKey();
				sleep(3000);
				
				if (lapstatus) {
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
							break;
						}
					}else {
						result= false;
						break;
					}
				}else {
					result= false;
					break;
				}
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
	public void testTLap3s72030AllAngle() throws Exception{
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			
			boolean result = true;
			String quality = one.hardware.Page.Camera.video_quality[3];
			int anglesize = one.hardware.Page.Camera.video_Angle.length;
			for (int t = 0; t <anglesize; t++) {
				String angle =one.hardware.Page.Camera.video_Angle[t];
				common.infoLog("start to test angle-"+angle);
				common.initDevice();
				common.startCamera();
				CameraAction.configVideoQuality(quality);
				CameraAction.configVideoAngle(angle);
				CameraAction.configTimeLapse(one.hardware.Page.Camera.lapse_time[1]);
				
				HashSet<String> beforeTakeVideoList = common.FileList("/sdcard/video");
				common.cameraKey();
				sleep(10000);
				CameraAction.cameraRecordTime();
				sleep(5000);
				boolean lapstatus = true;
				for (int i = 0; i < 20; i++) {
					if (!CameraAction.checklapsevalue(3)) {
						lapstatus=false;
					}else {
						lapstatus=true;
					}
					sleep(2000);
				}
				CameraAction.cameraRecordTime();
				common.cameraKey();
				sleep(3000);
				
				if (lapstatus) {
					HashSet<String> afterTakeVideoList = common.FileList("/sdcard/Video");
					HashSet<String> resultHashSet = common.result(afterTakeVideoList, beforeTakeVideoList);
					if (resultHashSet.size()==1) {
						String videopath = resultHashSet.iterator().next();
						common.infoLog("new file:"+videopath);
						String videoName = new File(videopath).getName();
						VideoNode activeNode = common.VideoInfo(videopath);
						if (common.checkVideoInfo(720, activeNode)) {
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
							break;
						}
					}else {
						result= false;
						break;
					}
				}else {
					result= false;
					break;
				}
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
	public void testTLap3s72060AllAngle() throws Exception{
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			
			boolean result = true;
			String quality = one.hardware.Page.Camera.video_quality[4];
			int anglesize = one.hardware.Page.Camera.video_Angle.length;
			for (int t = 0; t <anglesize; t++) {
				String angle =one.hardware.Page.Camera.video_Angle[t];
				common.infoLog("start to test angle-"+angle);
				common.initDevice();
				common.startCamera();
				CameraAction.configVideoQuality(quality);
				CameraAction.configVideoAngle(angle);
				CameraAction.configTimeLapse(one.hardware.Page.Camera.lapse_time[1]);
				
				HashSet<String> beforeTakeVideoList = common.FileList("/sdcard/video");
				common.cameraKey();
				sleep(10000);
				CameraAction.cameraRecordTime();
				sleep(5000);
				boolean lapstatus = true;
				for (int i = 0; i < 20; i++) {
					if (!CameraAction.checklapsevalue(3)) {
						lapstatus=false;
					}else {
						lapstatus=true;
					}
					sleep(2000);
				}
				CameraAction.cameraRecordTime();
				common.cameraKey();
				sleep(3000);
				
				if (lapstatus) {
					HashSet<String> afterTakeVideoList = common.FileList("/sdcard/Video");
					HashSet<String> resultHashSet = common.result(afterTakeVideoList, beforeTakeVideoList);
					if (resultHashSet.size()==1) {
						String videopath = resultHashSet.iterator().next();
						common.infoLog("new file:"+videopath);
						String videoName = new File(videopath).getName();
						VideoNode activeNode = common.VideoInfo(videopath);
						if (common.checkVideoInfo(720, activeNode)) {
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
							break;
						}
					}else {
						result= false;
						break;
					}
				}else {
					result= false;
					break;
				}
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
	public void testTLap3s108030AllAngle() throws Exception{
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			
			boolean result = true;
			String quality = one.hardware.Page.Camera.video_quality[5];
			int anglesize = one.hardware.Page.Camera.video_Angle.length;
			for (int t = 0; t <anglesize; t++) {
				String angle =one.hardware.Page.Camera.video_Angle[t];
				common.infoLog("start to test angle-"+angle);
				common.initDevice();
				common.startCamera();
				CameraAction.configVideoQuality(quality);
				CameraAction.configVideoAngle(angle);
				CameraAction.configTimeLapse(one.hardware.Page.Camera.lapse_time[1]);
				
				HashSet<String> beforeTakeVideoList = common.FileList("/sdcard/video");
				common.cameraKey();
				sleep(10000);
				CameraAction.cameraRecordTime();
				sleep(5000);
				boolean lapstatus = true;
				for (int i = 0; i < 20; i++) {
					if (!CameraAction.checklapsevalue(3)) {
						lapstatus=false;
					}else {
						lapstatus=true;
					}
					sleep(2000);
				}
				CameraAction.cameraRecordTime();
				common.cameraKey();
				sleep(3000);
				
				if (lapstatus) {
					HashSet<String> afterTakeVideoList = common.FileList("/sdcard/Video");
					HashSet<String> resultHashSet = common.result(afterTakeVideoList, beforeTakeVideoList);
					if (resultHashSet.size()==1) {
						String videopath = resultHashSet.iterator().next();
						common.infoLog("new file:"+videopath);
						String videoName = new File(videopath).getName();
						VideoNode activeNode = common.VideoInfo(videopath);
						if (common.checkVideoInfo(1080, activeNode)) {
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
							break;
						}
					}else {
						result= false;
						break;
					}
				}else {
					result= false;
					break;
				}
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
	public void testTLap5s48030AllAngle() throws Exception{
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			
			boolean result = true;
			String quality = one.hardware.Page.Camera.video_quality[0];
			int anglesize = one.hardware.Page.Camera.video_Angle.length;
			for (int t = 0; t <anglesize; t++) {
				String angle =one.hardware.Page.Camera.video_Angle[t];
				common.infoLog("start to test angle-"+angle);
				common.initDevice();
				common.startCamera();
				CameraAction.configVideoQuality(quality);
				CameraAction.configVideoAngle(angle);
				CameraAction.configTimeLapse(one.hardware.Page.Camera.lapse_time[2]);
				
				HashSet<String> beforeTakeVideoList = common.FileList("/sdcard/video");
				common.cameraKey();
				sleep(10000);
				CameraAction.cameraRecordTime();
				sleep(5000);
				boolean lapstatus = true;
				for (int i = 0; i < 20; i++) {
					if (!CameraAction.checklapsevalue(5)) {
						lapstatus=false;
					}else {
						lapstatus=true;
					}
					sleep(2000);
				}
				CameraAction.cameraRecordTime();
				common.cameraKey();
				sleep(3000);
				
				if (lapstatus) {
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
							break;
						}
					}else {
						result= false;
						break;
					}
				}else {
					result= false;
					break;
				}
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
	public void testTLap5s48060AllAngle() throws Exception{
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			
			boolean result = true;
			String quality = one.hardware.Page.Camera.video_quality[1];
			int anglesize = one.hardware.Page.Camera.video_Angle.length;
			for (int t = 0; t <anglesize; t++) {
				String angle =one.hardware.Page.Camera.video_Angle[t];
				common.infoLog("start to test angle-"+angle);
				common.initDevice();
				common.startCamera();
				CameraAction.configVideoQuality(quality);
				CameraAction.configVideoAngle(angle);
				CameraAction.configTimeLapse(one.hardware.Page.Camera.lapse_time[2]);
				
				HashSet<String> beforeTakeVideoList = common.FileList("/sdcard/video");
				common.cameraKey();
				sleep(10000);
				CameraAction.cameraRecordTime();
				sleep(5000);
				boolean lapstatus = true;
				for (int i = 0; i < 20; i++) {
					if (!CameraAction.checklapsevalue(5)) {
						lapstatus=false;
					}else {
						lapstatus=true;
					}
					sleep(2000);
				}
				CameraAction.cameraRecordTime();
				common.cameraKey();
				sleep(3000);
				
				if (lapstatus) {
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
							break;
						}
					}else {
						result= false;
						break;
					}
				}else {
					result= false;
					break;
				}
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
	public void testTLap5s480120AllAngle() throws Exception{
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			
			boolean result = true;
			String quality = one.hardware.Page.Camera.video_quality[2];
			int anglesize = one.hardware.Page.Camera.video_Angle.length;
			for (int t = 0; t <anglesize; t++) {
				String angle =one.hardware.Page.Camera.video_Angle[t];
				common.infoLog("start to test angle-"+angle);
				common.initDevice();
				common.startCamera();
				CameraAction.configVideoQuality(quality);
				CameraAction.configVideoAngle(angle);
				CameraAction.configTimeLapse(one.hardware.Page.Camera.lapse_time[2]);
				
				HashSet<String> beforeTakeVideoList = common.FileList("/sdcard/video");
				common.cameraKey();
				sleep(10000);
				CameraAction.cameraRecordTime();
				sleep(5000);
				boolean lapstatus = true;
				for (int i = 0; i < 20; i++) {
					if (!CameraAction.checklapsevalue(5)) {
						lapstatus=false;
					}else {
						lapstatus=true;
					}
					sleep(2000);
				}
				CameraAction.cameraRecordTime();
				common.cameraKey();
				sleep(3000);
				
				if (lapstatus) {
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
							break;
						}
					}else {
						result= false;
						break;
					}
				}else {
					result= false;
					break;
				}
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
	public void testTLap5s72030AllAngle() throws Exception{
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			
			boolean result = true;
			String quality = one.hardware.Page.Camera.video_quality[3];
			int anglesize = one.hardware.Page.Camera.video_Angle.length;
			for (int t = 0; t <anglesize; t++) {
				String angle =one.hardware.Page.Camera.video_Angle[t];
				common.infoLog("start to test angle-"+angle);
				common.initDevice();
				common.startCamera();
				CameraAction.configVideoQuality(quality);
				CameraAction.configVideoAngle(angle);
				CameraAction.configTimeLapse(one.hardware.Page.Camera.lapse_time[2]);
				
				HashSet<String> beforeTakeVideoList = common.FileList("/sdcard/video");
				common.cameraKey();
				sleep(10000);
				CameraAction.cameraRecordTime();
				sleep(5000);
				boolean lapstatus = true;
				for (int i = 0; i < 20; i++) {
					if (!CameraAction.checklapsevalue(5)) {
						lapstatus=false;
					}else {
						lapstatus=true;
					}
					sleep(2000);
				}
				CameraAction.cameraRecordTime();
				common.cameraKey();
				sleep(3000);
				
				if (lapstatus) {
					HashSet<String> afterTakeVideoList = common.FileList("/sdcard/Video");
					HashSet<String> resultHashSet = common.result(afterTakeVideoList, beforeTakeVideoList);
					if (resultHashSet.size()==1) {
						String videopath = resultHashSet.iterator().next();
						common.infoLog("new file:"+videopath);
						String videoName = new File(videopath).getName();
						VideoNode activeNode = common.VideoInfo(videopath);
						if (common.checkVideoInfo(720, activeNode)) {
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
							break;
						}
					}else {
						result= false;
						break;
					}
				}else {
					result= false;
					break;
				}
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
	public void testTLap5s72060AllAngle() throws Exception{
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			
			boolean result = true;
			String quality = one.hardware.Page.Camera.video_quality[4];
			int anglesize = one.hardware.Page.Camera.video_Angle.length;
			for (int t = 0; t <anglesize; t++) {
				String angle =one.hardware.Page.Camera.video_Angle[t];
				common.infoLog("start to test angle-"+angle);
				common.initDevice();
				common.startCamera();
				CameraAction.configVideoQuality(quality);
				CameraAction.configVideoAngle(angle);
				CameraAction.configTimeLapse(one.hardware.Page.Camera.lapse_time[2]);
				
				HashSet<String> beforeTakeVideoList = common.FileList("/sdcard/video");
				common.cameraKey();
				sleep(10000);
				CameraAction.cameraRecordTime();
				sleep(5000);
				boolean lapstatus = true;
				for (int i = 0; i < 20; i++) {
					if (!CameraAction.checklapsevalue(5)) {
						lapstatus=false;
					}else {
						lapstatus=true;
					}
					sleep(2000);
				}
				CameraAction.cameraRecordTime();
				common.cameraKey();
				sleep(3000);
				
				if (lapstatus) {
					HashSet<String> afterTakeVideoList = common.FileList("/sdcard/Video");
					HashSet<String> resultHashSet = common.result(afterTakeVideoList, beforeTakeVideoList);
					if (resultHashSet.size()==1) {
						String videopath = resultHashSet.iterator().next();
						common.infoLog("new file:"+videopath);
						String videoName = new File(videopath).getName();
						VideoNode activeNode = common.VideoInfo(videopath);
						if (common.checkVideoInfo(720, activeNode)) {
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
							break;
						}
					}else {
						result= false;
						break;
					}
				}else {
					result= false;
					break;
				}
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
	public void testTLap5s108030AllAngle() throws Exception{
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			
			boolean result = true;
			String quality = one.hardware.Page.Camera.video_quality[5];
			int anglesize = one.hardware.Page.Camera.video_Angle.length;
			for (int t = 0; t <anglesize; t++) {
				String angle =one.hardware.Page.Camera.video_Angle[t];
				common.infoLog("start to test angle-"+angle);
				common.initDevice();
				common.startCamera();
				CameraAction.configVideoQuality(quality);
				CameraAction.configVideoAngle(angle);
				CameraAction.configTimeLapse(one.hardware.Page.Camera.lapse_time[2]);
				
				HashSet<String> beforeTakeVideoList = common.FileList("/sdcard/video");
				common.cameraKey();
				sleep(10000);
				CameraAction.cameraRecordTime();
				sleep(5000);
				boolean lapstatus = true;
				for (int i = 0; i < 20; i++) {
					if (!CameraAction.checklapsevalue(5)) {
						lapstatus=false;
					}else {
						lapstatus=true;
					}
					sleep(2000);
				}
				CameraAction.cameraRecordTime();
				common.cameraKey();
				sleep(3000);
				
				if (lapstatus) {
					HashSet<String> afterTakeVideoList = common.FileList("/sdcard/Video");
					HashSet<String> resultHashSet = common.result(afterTakeVideoList, beforeTakeVideoList);
					if (resultHashSet.size()==1) {
						String videopath = resultHashSet.iterator().next();
						common.infoLog("new file:"+videopath);
						String videoName = new File(videopath).getName();
						VideoNode activeNode = common.VideoInfo(videopath);
						if (common.checkVideoInfo(1080, activeNode)) {
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
							break;
						}
					}else {
						result= false;
						break;
					}
				}else {
					result= false;
					break;
				}
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
	public void testTLap10s48030AllAngle() throws Exception{
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			
			boolean result = true;
			String quality = one.hardware.Page.Camera.video_quality[0];
			int anglesize = one.hardware.Page.Camera.video_Angle.length;
			for (int t = 0; t <anglesize; t++) {
				String angle =one.hardware.Page.Camera.video_Angle[t];
				common.infoLog("start to test angle-"+angle);
				common.initDevice();
				common.startCamera();
				CameraAction.configVideoQuality(quality);
				CameraAction.configVideoAngle(angle);
				CameraAction.configTimeLapse(one.hardware.Page.Camera.lapse_time[3]);
				
				HashSet<String> beforeTakeVideoList = common.FileList("/sdcard/video");
				common.cameraKey();
				sleep(10000);
				CameraAction.cameraRecordTime();
				sleep(11000);
				boolean lapstatus = true;
				for (int i = 0; i < 20; i++) {
					if (!CameraAction.checklapsevalue(10)) {
						lapstatus=false;
					}else {
						lapstatus=true;
					}
					sleep(2000);
				}
				CameraAction.cameraRecordTime();
				common.cameraKey();
				sleep(3000);
				
				if (lapstatus) {
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
							break;
						}
					}else {
						result= false;
						break;
					}
				}else {
					result= false;
					break;
				}
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
	public void testTLap10s48060AllAngle() throws Exception{
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			
			boolean result = true;
			String quality = one.hardware.Page.Camera.video_quality[1];
			int anglesize = one.hardware.Page.Camera.video_Angle.length;
			for (int t = 0; t <anglesize; t++) {
				String angle =one.hardware.Page.Camera.video_Angle[t];
				common.infoLog("start to test angle-"+angle);
				common.initDevice();
				common.startCamera();
				CameraAction.configVideoQuality(quality);
				CameraAction.configVideoAngle(angle);
				CameraAction.configTimeLapse(one.hardware.Page.Camera.lapse_time[3]);
				
				HashSet<String> beforeTakeVideoList = common.FileList("/sdcard/video");
				common.cameraKey();
				sleep(10000);
				CameraAction.cameraRecordTime();
				sleep(11000);
				boolean lapstatus = true;
				for (int i = 0; i < 20; i++) {
					if (!CameraAction.checklapsevalue(10)) {
						lapstatus=false;
					}else {
						lapstatus=true;
					}
					sleep(2000);
				}
				CameraAction.cameraRecordTime();
				common.cameraKey();
				sleep(3000);
				
				if (lapstatus) {
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
							break;
						}
					}else {
						result= false;
						break;
					}
				}else {
					result= false;
					break;
				}
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
	public void testTLap10s480120AllAngle() throws Exception{
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			
			boolean result = true;
			String quality = one.hardware.Page.Camera.video_quality[2];
			int anglesize = one.hardware.Page.Camera.video_Angle.length;
			for (int t = 0; t <anglesize; t++) {
				String angle =one.hardware.Page.Camera.video_Angle[t];
				common.infoLog("start to test angle-"+angle);
				common.initDevice();
				common.startCamera();
				CameraAction.configVideoQuality(quality);
				CameraAction.configVideoAngle(angle);
				CameraAction.configTimeLapse(one.hardware.Page.Camera.lapse_time[3]);
				
				HashSet<String> beforeTakeVideoList = common.FileList("/sdcard/video");
				common.cameraKey();
				sleep(10000);
				CameraAction.cameraRecordTime();
				sleep(11000);
				boolean lapstatus = true;
				for (int i = 0; i < 20; i++) {
					if (!CameraAction.checklapsevalue(10)) {
						lapstatus=false;
					}else {
						lapstatus=true;
					}
					sleep(2000);
				}
				CameraAction.cameraRecordTime();
				common.cameraKey();
				sleep(3000);
				
				if (lapstatus) {
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
							break;
						}
					}else {
						result= false;
						break;
					}
				}else {
					result= false;
					break;
				}
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
	public void testTLap10s72030AllAngle() throws Exception{
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			
			boolean result = true;
			String quality = one.hardware.Page.Camera.video_quality[3];
			int anglesize = one.hardware.Page.Camera.video_Angle.length;
			for (int t = 0; t <anglesize; t++) {
				String angle =one.hardware.Page.Camera.video_Angle[t];
				common.infoLog("start to test angle-"+angle);
				common.initDevice();
				common.startCamera();
				CameraAction.configVideoQuality(quality);
				CameraAction.configVideoAngle(angle);
				CameraAction.configTimeLapse(one.hardware.Page.Camera.lapse_time[3]);
				
				HashSet<String> beforeTakeVideoList = common.FileList("/sdcard/video");
				common.cameraKey();
				sleep(10000);
				CameraAction.cameraRecordTime();
				sleep(11000);
				boolean lapstatus = true;
				for (int i = 0; i < 20; i++) {
					if (!CameraAction.checklapsevalue(10)) {
						lapstatus=false;
					}else {
						lapstatus=true;
					}
					sleep(2000);
				}
				CameraAction.cameraRecordTime();
				common.cameraKey();
				sleep(3000);
				
				if (lapstatus) {
					HashSet<String> afterTakeVideoList = common.FileList("/sdcard/Video");
					HashSet<String> resultHashSet = common.result(afterTakeVideoList, beforeTakeVideoList);
					if (resultHashSet.size()==1) {
						String videopath = resultHashSet.iterator().next();
						common.infoLog("new file:"+videopath);
						String videoName = new File(videopath).getName();
						VideoNode activeNode = common.VideoInfo(videopath);
						if (common.checkVideoInfo(720, activeNode)) {
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
							break;
						}
					}else {
						result= false;
						break;
					}
				}else {
					result= false;
					break;
				}
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
	public void testTLap10s72060AllAngle() throws Exception{
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			
			boolean result = true;
			String quality = one.hardware.Page.Camera.video_quality[4];
			int anglesize = one.hardware.Page.Camera.video_Angle.length;
			for (int t = 0; t <anglesize; t++) {
				String angle =one.hardware.Page.Camera.video_Angle[t];
				common.infoLog("start to test angle-"+angle);
				common.initDevice();
				common.startCamera();
				CameraAction.configVideoQuality(quality);
				CameraAction.configVideoAngle(angle);
				CameraAction.configTimeLapse(one.hardware.Page.Camera.lapse_time[3]);
				
				HashSet<String> beforeTakeVideoList = common.FileList("/sdcard/video");
				common.cameraKey();
				sleep(10000);
				CameraAction.cameraRecordTime();
				sleep(11000);
				boolean lapstatus = true;
				for (int i = 0; i < 20; i++) {
					if (!CameraAction.checklapsevalue(10)) {
						lapstatus=false;
					}else {
						lapstatus=true;
					}
					sleep(2000);
				}
				CameraAction.cameraRecordTime();
				common.cameraKey();
				sleep(3000);
				
				if (lapstatus) {
					HashSet<String> afterTakeVideoList = common.FileList("/sdcard/Video");
					HashSet<String> resultHashSet = common.result(afterTakeVideoList, beforeTakeVideoList);
					if (resultHashSet.size()==1) {
						String videopath = resultHashSet.iterator().next();
						common.infoLog("new file:"+videopath);
						String videoName = new File(videopath).getName();
						VideoNode activeNode = common.VideoInfo(videopath);
						if (common.checkVideoInfo(720, activeNode)) {
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
							break;
						}
					}else {
						result= false;
						break;
					}
				}else {
					result= false;
					break;
				}
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
	public void testTLap10s108030AllAngle() throws Exception{
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			
			boolean result = true;
			String quality = one.hardware.Page.Camera.video_quality[5];
			int anglesize = one.hardware.Page.Camera.video_Angle.length;
			for (int t = 0; t <anglesize; t++) {
				String angle =one.hardware.Page.Camera.video_Angle[t];
				common.infoLog("start to test angle-"+angle);
				common.initDevice();
				common.startCamera();
				CameraAction.configVideoQuality(quality);
				CameraAction.configVideoAngle(angle);
				CameraAction.configTimeLapse(one.hardware.Page.Camera.lapse_time[3]);
				
				HashSet<String> beforeTakeVideoList = common.FileList("/sdcard/video");
				common.cameraKey();
				sleep(10000);
				CameraAction.cameraRecordTime();
				sleep(11000);
				boolean lapstatus = true;
				for (int i = 0; i < 20; i++) {
					if (!CameraAction.checklapsevalue(10)) {
						lapstatus=false;
					}else {
						lapstatus=true;
					}
					sleep(2000);
				}
				CameraAction.cameraRecordTime();
				common.cameraKey();
				sleep(3000);
				
				if (lapstatus) {
					HashSet<String> afterTakeVideoList = common.FileList("/sdcard/Video");
					HashSet<String> resultHashSet = common.result(afterTakeVideoList, beforeTakeVideoList);
					if (resultHashSet.size()==1) {
						String videopath = resultHashSet.iterator().next();
						common.infoLog("new file:"+videopath);
						String videoName = new File(videopath).getName();
						VideoNode activeNode = common.VideoInfo(videopath);
						if (common.checkVideoInfo(1080, activeNode)) {
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
							break;
						}
					}else {
						result= false;
						break;
					}
				}else {
					result= false;
					break;
				}
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
