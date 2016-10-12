package one.hardware.Action;

import one.hardware.Util.Base;

public class FileManagerAction extends Base {

	/**
	 * Click launcher_application_id按钮
	 */
	public static  void playVideoByFileManager(String videoName) throws Exception {
		common.startFileManager();
		common.findViewByText("Internal storage").clickAndWaitForNewWindow();
		common.ScrollViewByText("Video");
		common.clickViewByText("Video");
		
		//common.ScrollViewByText(videoName);
		common.clickViewByText(videoName);
		CameraAction.playVideoBtn().clickAndWaitForNewWindow();
		common.waitTime(3);
		//Can't play this video.
		//android:id/message
		//android:id/button1
	}
}
