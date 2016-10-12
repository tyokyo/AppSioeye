package one.hardware.Testcase;

import java.util.HashSet;

import one.hardware.Action.CameraAction;
import one.hardware.Util.Base;

public class BurstCase extends Base{
	public void testA() throws Exception{
		String burstcfg = one.hardware.Page.Camera.burst[0];
		String imgesz =one.hardware.Page.Camera.imsge_size[0];
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			common.initDevice();
			common.startCamera();
			common.deletePhoto();
			common.passcase();
			common.startLog( "*****End to run " + runcase + " *****");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			common.handleException(e.getMessage());
		}
	}
	public void testBurst10P4M169() throws Exception{
		String burstcfg = one.hardware.Page.Camera.burst[0];
		String imgesz =one.hardware.Page.Camera.imsge_size[0];
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			common.initDevice();
			common.startCamera();
			common.deletePhoto();

			CameraAction.configImageSize(imgesz);
			CameraAction.configBurst(burstcfg);

			HashSet<String> beforeTakeVideoList = common.FileList("/sdcard/Photo");
			common.cameraKey();
			sleep(10000);
			HashSet<String> afterTakeVideoList = common.FileList("/sdcard/Photo");
			HashSet<String> resultHashSet = common.result(afterTakeVideoList, beforeTakeVideoList);

			common.findViewById(one.hardware.Page.Camera.camera_setting_shortcut_id);
			int piccnt = resultHashSet.size();
			if (piccnt!=10) {
				common.infoLog("expect图片总数：10张-实际图片数量为："+piccnt);
				common.failcase(runcase);
			}else {
				common.infoLog("expect图片总数：10张-Success");
				for (String photopath : resultHashSet) {
					double hw = common.getPicHeightWidth(photopath);
					double exp= 16/9;
					if (hw==exp) {
						common.infoLog(photopath+" -图片比列验证成功");
					}else {
						common.infoLog(photopath+" -图片比列验证失败");
						common.failcase(runcase);
					}
				}
			}
			//common.backToIdl();
			common.passcase();
			common.startLog( "*****End to run " + runcase + " *****");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			common.handleException(e.getMessage());
		}
	}
	public void testBurst20P4M169() throws Exception{
		String burstcfg = one.hardware.Page.Camera.burst[1];
		String imgesz =one.hardware.Page.Camera.imsge_size[0];
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			common.initDevice();
			common.startCamera();
			common.deletePhoto();

			CameraAction.configImageSize(imgesz);
			CameraAction.configBurst(burstcfg);

			HashSet<String> beforeTakeVideoList = common.FileList("/sdcard/Photo");
			common.cameraKey();
			sleep(10000);
			HashSet<String> afterTakeVideoList = common.FileList("/sdcard/Photo");
			HashSet<String> resultHashSet = common.result(afterTakeVideoList, beforeTakeVideoList);

			common.findViewById(one.hardware.Page.Camera.camera_setting_shortcut_id);
			int piccnt = resultHashSet.size();
			if (piccnt!=20) {
				common.infoLog("expect图片总数：20张-实际图片数量为："+piccnt);
				common.failcase(runcase);
			}else {
				common.infoLog("expect图片总数：20张-Success");
				for (String photopath : resultHashSet) {
					double hw = common.getPicHeightWidth(photopath);
					double exp= 16/9;
					if (hw==exp) {
						common.infoLog(photopath+" -图片比列验证成功");
					}else {
						common.infoLog(photopath+" -图片比列验证失败");
						common.failcase(runcase);
					}
				}
			}
			//common.backToIdl();

			common.passcase();
			common.startLog( "*****End to run " + runcase + " *****");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			common.handleException(e.getMessage());
		}
	}
	public void testBurst30P4M169() throws Exception{
		String burstcfg = one.hardware.Page.Camera.burst[2];
		String imgesz =one.hardware.Page.Camera.imsge_size[0];
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			common.initDevice();
			common.startCamera();
			common.deletePhoto();

			CameraAction.configImageSize(imgesz);
			CameraAction.configBurst(burstcfg);

			HashSet<String> beforeTakeVideoList = common.FileList("/sdcard/Photo");
			common.cameraKey();
			sleep(10000);
			HashSet<String> afterTakeVideoList = common.FileList("/sdcard/Photo");
			HashSet<String> resultHashSet = common.result(afterTakeVideoList, beforeTakeVideoList);

			common.findViewById(one.hardware.Page.Camera.camera_setting_shortcut_id);
			int piccnt = resultHashSet.size();
			if (piccnt!=30) {
				common.infoLog("expect图片总数：30张-实际图片数量为："+piccnt);
				common.failcase(runcase);
			}else {
				common.infoLog("expect图片总数：30张-Success");
				for (String photopath : resultHashSet) {
					double hw = common.getPicHeightWidth(photopath);
					double exp= 16/9;
					if (hw==exp) {
						common.infoLog(photopath+" -图片比列验证成功");
					}else {
						common.infoLog(photopath+" -图片比列验证失败");
						common.failcase(runcase);
					}
				}
			}

			//common.backToIdl();

			common.passcase();
			common.startLog( "*****End to run " + runcase + " *****");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			common.handleException(e.getMessage());
		}
	}
	public void testBurst10P3M43() throws Exception{
		String burstcfg = one.hardware.Page.Camera.burst[0];
		String imgesz =one.hardware.Page.Camera.imsge_size[1];
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			common.initDevice();
			common.startCamera();
			common.deletePhoto();

			CameraAction.configImageSize(imgesz);
			CameraAction.configBurst(burstcfg);

			HashSet<String> beforeTakeVideoList = common.FileList("/sdcard/Photo");
			common.cameraKey();
			sleep(10000);
			HashSet<String> afterTakeVideoList = common.FileList("/sdcard/Photo");
			HashSet<String> resultHashSet = common.result(afterTakeVideoList, beforeTakeVideoList);

			common.findViewById(one.hardware.Page.Camera.camera_setting_shortcut_id);
			int piccnt = resultHashSet.size();
			if (piccnt!=10) {
				common.infoLog("expect图片总数：10张-实际图片数量为："+piccnt);
				common.failcase(runcase);
			}else {
				common.infoLog("expect图片总数：10张-Success");
				for (String photopath : resultHashSet) {
					double hw = common.getPicHeightWidth(photopath);
					double exp= 4/3;
					if (hw==exp) {
						common.infoLog(photopath+" -图片比列验证成功");
					}else {
						common.infoLog(photopath+" -图片比列验证失败");
						common.failcase(runcase);
					}
				}
			}

			//common.backToIdl();

			common.passcase();
			common.startLog( "*****End to run " + runcase + " *****");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			common.handleException(e.getMessage());
		}
	}
	public void testBurst20P3M43() throws Exception{
		String burstcfg = one.hardware.Page.Camera.burst[1];
		String imgesz =one.hardware.Page.Camera.imsge_size[1];
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			common.initDevice();
			common.startCamera();
			common.deletePhoto();

			CameraAction.configImageSize(imgesz);
			CameraAction.configBurst(burstcfg);

			HashSet<String> beforeTakeVideoList = common.FileList("/sdcard/Photo");
			common.cameraKey();
			sleep(20000);
			HashSet<String> afterTakeVideoList = common.FileList("/sdcard/Photo");
			HashSet<String> resultHashSet = common.result(afterTakeVideoList, beforeTakeVideoList);

			common.findViewById(one.hardware.Page.Camera.camera_setting_shortcut_id);
			int piccnt = resultHashSet.size();
			if (piccnt!=20) {
				common.infoLog("expect图片总数：20张-实际图片数量为："+piccnt);
				common.failcase(runcase);
			}else {
				common.infoLog("expect图片总数：20张-Success");
				for (String photopath : resultHashSet) {
					double hw = common.getPicHeightWidth(photopath);
					double exp= 4/3;
					if (hw==exp) {
						common.infoLog(photopath+" -图片比列验证成功");
					}else {
						common.infoLog(photopath+" -图片比列验证失败");
						common.failcase(runcase);
					}
				}
			}
			//common.backToIdl();

			common.passcase();
			common.startLog( "*****End to run " + runcase + " *****");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			common.handleException(e.getMessage());
		}
	}
	public void testBurst30P3M43() throws Exception{
		String burstcfg = one.hardware.Page.Camera.burst[2];
		String imgesz =one.hardware.Page.Camera.imsge_size[1];
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			common.initDevice();
			common.startCamera();
			common.deletePhoto();

			CameraAction.configImageSize(imgesz);
			CameraAction.configBurst(burstcfg);

			HashSet<String> beforeTakeVideoList = common.FileList("/sdcard/Photo");
			common.cameraKey();
			sleep(10000);
			HashSet<String> afterTakeVideoList = common.FileList("/sdcard/Photo");
			HashSet<String> resultHashSet = common.result(afterTakeVideoList, beforeTakeVideoList);

			common.findViewById(one.hardware.Page.Camera.camera_setting_shortcut_id);
			int piccnt = resultHashSet.size();
			if (piccnt!=30) {
				common.infoLog("expect图片总数：30张-实际图片数量为："+piccnt);
				common.failcase(runcase);
			}else {
				common.infoLog("expect图片总数：30张-Success");
				for (String photopath : resultHashSet) {
					double hw = common.getPicHeightWidth(photopath);
					double exp= 4/3;
					if (hw==exp) {
						common.infoLog(photopath+" -图片比列验证成功");
					}else {
						common.infoLog(photopath+" -图片比列验证失败");
						common.failcase(runcase);
					}
				}
			}

			//common.backToIdl();

			common.passcase();
			common.startLog( "*****End to run " + runcase + " *****");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			common.handleException(e.getMessage());
		}
	}
	public void testBurst10P2M169() throws Exception{
		String burstcfg = one.hardware.Page.Camera.burst[0];
		String imgesz =one.hardware.Page.Camera.imsge_size[2];
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			common.initDevice();
			common.startCamera();
			common.deletePhoto();

			CameraAction.configImageSize(imgesz);
			CameraAction.configBurst(burstcfg);

			HashSet<String> beforeTakeVideoList = common.FileList("/sdcard/Photo");
			common.cameraKey();
			sleep(10000);
			HashSet<String> afterTakeVideoList = common.FileList("/sdcard/Photo");
			HashSet<String> resultHashSet = common.result(afterTakeVideoList, beforeTakeVideoList);

			common.findViewById(one.hardware.Page.Camera.camera_setting_shortcut_id);
			int piccnt = resultHashSet.size();
			if (piccnt!=10) {
				common.infoLog("expect图片总数：10张-实际图片数量为："+piccnt);
				common.failcase(runcase);
			}else {
				common.infoLog("expect图片总数：10张-Success");
				for (String photopath : resultHashSet) {
					double hw = common.getPicHeightWidth(photopath);
					double exp= 16/9;
					if (hw==exp) {
						common.infoLog(photopath+" -图片比列验证成功");
					}else {
						common.infoLog(photopath+" -图片比列验证失败");
						common.failcase(runcase);
					}
				}
			}

			//common.backToIdl();

			common.passcase();
			common.startLog( "*****End to run " + runcase + " *****");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			common.handleException(e.getMessage());
		}
	}
	public void testBurst20P2M169() throws Exception{
		String burstcfg = one.hardware.Page.Camera.burst[1];
		String imgesz =one.hardware.Page.Camera.imsge_size[2];
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			common.initDevice();
			common.startCamera();
			common.deletePhoto();

			CameraAction.configImageSize(imgesz);
			CameraAction.configBurst(burstcfg);

			HashSet<String> beforeTakeVideoList = common.FileList("/sdcard/Photo");
			common.cameraKey();
			sleep(10000);
			HashSet<String> afterTakeVideoList = common.FileList("/sdcard/Photo");
			HashSet<String> resultHashSet = common.result(afterTakeVideoList, beforeTakeVideoList);

			common.findViewById(one.hardware.Page.Camera.camera_setting_shortcut_id);
			int piccnt = resultHashSet.size();
			if (piccnt!=20) {
				common.infoLog("expect图片总数：20张-实际图片数量为："+piccnt);
				common.failcase(runcase);
			}else {
				common.infoLog("expect图片总数：20张-Success");
				for (String photopath : resultHashSet) {
					double hw = common.getPicHeightWidth(photopath);
					double exp= 16/9;
					if (hw==exp) {
						common.infoLog(photopath+" -图片比列验证成功");
					}else {
						common.infoLog(photopath+" -图片比列验证失败");
						common.failcase(runcase);
					}
				}
			}

			//common.backToIdl();

			common.passcase();
			common.startLog( "*****End to run " + runcase + " *****");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			common.handleException(e.getMessage());
		}
	}
	public void testBurst30P2M169() throws Exception{
		String burstcfg = one.hardware.Page.Camera.burst[2];
		String imgesz =one.hardware.Page.Camera.imsge_size[2];
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			common.initDevice();
			common.startCamera();
			common.deletePhoto();

			CameraAction.configImageSize(imgesz);
			CameraAction.configBurst(burstcfg);

			HashSet<String> beforeTakeVideoList = common.FileList("/sdcard/Photo");
			common.cameraKey();
			sleep(10000);
			HashSet<String> afterTakeVideoList = common.FileList("/sdcard/Photo");
			HashSet<String> resultHashSet = common.result(afterTakeVideoList, beforeTakeVideoList);

			common.findViewById(one.hardware.Page.Camera.camera_setting_shortcut_id);
			int piccnt = resultHashSet.size();
			if (piccnt!=30) {
				common.infoLog("expect图片总数：30张-实际图片数量为："+piccnt);
				common.failcase(runcase);
			}else {
				common.infoLog("expect图片总数：30张-Success");
				for (String photopath : resultHashSet) {
					double hw = common.getPicHeightWidth(photopath);
					double exp= 16/9;
					if (hw==exp) {
						common.infoLog(photopath+" -图片比列验证成功");
					}else {
						common.infoLog(photopath+" -图片比列验证失败");
						common.failcase(runcase);
					}
				}
			}
			common.passcase();
			common.startLog( "*****End to run " + runcase + " *****");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			common.handleException(e.getMessage());
		}
	}
}
