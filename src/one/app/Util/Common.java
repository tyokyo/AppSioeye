package one.app.Util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import android.util.Log;

import com.android.uiautomator.core.Configurator;
import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class Common {

	public String TAG = "CktTest-";
	public String FindObject = "[Find Object]: ";
	public String FindScrollFindObject = "[Scroll Find Object]: ";
	public String NotFindScrollFindObject = "[Scroll Not Find Object]: ";
	public String NotFindObject = "[Not Find Object]: ";
	public String TestClick = "[Click Step]: ";
	public String TestInfo = "[Test Info]: ";
	public String FailedTestInfo = "[Test Step Failed]: ";
	public String TestResult = "[Test Result]: ";
	public String FailReason = "[Fail Reason]: ";
	public String GetText = "[GetText]: ";
	public String Exception_Crash = "[App Crash]: ";
	public String Exception_ANR = "[App ANR]: ";

	public boolean islong = false;

	public String[] navTableItem = {
			"com.sioeye.sioeyeapp:id/main_activity_table_live",
			"com.sioeye.sioeyeapp:id/main_activity_table_replay",
			"com.sioeye.sioeyeapp:id/main_activity_table_friends",
			"com.sioeye.sioeyeapp:id/main_activity_table_remote" 
	};
	public Random rand = new Random();
	public UiDevice device = null;
	public String runcase;
	public int[] indexBarMiddleCorrdinate = new int[2];
	public int[] lunbotuPositionCorrdinate = new int[2];
	public int[] image = new int[2];
	public int[] selectedVideo = new int[2];
	public int[] redLine = new int[2];
	public int[] searchBtnInHome = new int[2];

	public Common(UiDevice _device, String _runcase) {
		device = _device;
		runcase = _runcase;
	}
	/**
	 * 启动SIOEYE APP
	 */
	public void openActivity() throws Exception {
		// /Test Info
		killActivity();

		int n = 1;
		while (n < 11) {
			Runtime.getRuntime()
			.exec("am start -n com.sioeye.sioeyeapp/com.sioeye.sioeyeapp.ui.SplashActivity");
			waitTime(5);
			String name = device.getCurrentPackageName();
			infoLog("当前package:" + name);
			if (name.equalsIgnoreCase("com.sioeye.sioeyeapp")) {
				infoLog("已经进入App");
				break;
			} else {
				infoLog("启动失败" + n + "次");
			}
			n = n + 1;
		}
		if (n == 11) {
			throw new Exception("启动失败");
		}
		int i = 1;
		while (i < 10) {
			if (findViewByText2("OK").exists()) {
				clickViewByText("OK");
				waitTime(1);
				i++;
				continue;
			}
			waitTime(1);
			i++;
		}
	}
	public void openActivityOnly() {
		try {
			Runtime.getRuntime()
			.exec("am start -n com.sioeye.sioeyeapp/com.sioeye.sioeyeapp.ui.SplashActivity");
			infoLog("打开App");
		} catch (IOException e) {
			infoLog("打开失败");
			e.printStackTrace();
		}
	}
	/**
	 * 清除数据
	 */
	public void clearAppData() {
		try {
			Runtime.getRuntime()
			.exec("pm clear  com.sioeye.sioeyeapp");
			infoLog("pm clear com.sioeye.sioeyeapp - Success");
		} catch (IOException e) {
			infoLog("pm clear com.sioeye.sioeyeapp - Failed");
			e.printStackTrace();
		}
	}
	/**
	 * 安装手机存储内的APP
	 * @param path
	 * path=/sdcard/***.apk
	 */
	public void install(String path) {
		try {
			Runtime.getRuntime()
			.exec("pm install  com.sioeye.sioeyeapp");
			infoLog("pm clear com.sioeye.sioeyeapp - Success");
		} catch (IOException e) {
			infoLog("pm clear com.sioeye.sioeyeapp - Failed");
			e.printStackTrace();
		}
	}

	/**
	 * 清除数据
	 * @param ks
	 * ks = false 删除全部数据
	 * ks = true 卸载应用且保留数据与缓存
	 */
	public void uninstall(boolean ks) {
		try {
			if (ks) {
				Runtime.getRuntime().exec("pm uninstall -k com.sioeye.sioeyeapp");
				infoLog("pm uninstall -k com.sioeye.sioeyeapp");
			}else {
				Runtime.getRuntime().exec("pm uninstall  com.sioeye.sioeyeapp");
			}
		} catch (IOException e) {
			infoLog("pm clear com.sioeye.sioeyeapp - Failed");
			e.printStackTrace();
		}
	}
	/**
	 * 用于强制关闭App
	 * 
	 * @param runcase
	 *            
	 */
	public void killActivity() {
		try {
			Runtime.getRuntime().exec(
					"adb shell am force-stop com.sioeye.sioeyeapp");
			infoLog("强制关闭App");
		} catch (IOException e) {
			infoLog("强制关闭App");
			//infoLog("强制关闭App失败");
		}
	}

	/**
	 * 从底边条点击直播按钮
	 */
	public void navToLive() throws Exception {
		clickViewById(navTableItem[0]);
	}

	/**
	 * 从底边条点击回放按钮
	 */
	public void navToReplay() throws Exception {
		clickViewById(navTableItem[1]);
	}

	/**
	 * 从底边条点击好友按钮
	 */
	public void navToFriends() throws Exception {
		clickViewById(navTableItem[2]);
	}
	/**
	 * 从底边条点击远程按钮
	 */
	public void navToRemote() throws Exception {
		clickViewById(navTableItem[3]);
	}

	/**
	 * 强查找控件通过ID，不存在抛出异常，当前用例失败
	 */
	public UiObject findViewById(String resourceid) throws Exception {
		UiObject object = new UiObject(
				new UiSelector().resourceIdMatches(resourceid));
		if (object.exists()) {
			infoLog(FindObject + resourceid);
			return object;
		} else {
			infoLog(NotFindObject + resourceid);
			throw new Exception(NotFindObject + resourceid);
		}
	}

	/**
	 * 弱查找控件通过ID，不存在返回空，不会抛异常，当前用例正常执行
	 */
	public UiObject findViewById2(String resourceid) {
		UiObject object = new UiObject(
				new UiSelector().resourceIdMatches(resourceid));
		if (object.exists()) {
			infoLog(FindObject + resourceid);
		} else {
			infoLog(NotFindObject + resourceid);
		}
		return object;
	}

	/**
	 * 通过控件ID判断某个控件是否存在
	 */
	public boolean isExist(String resourceid) throws Exception {
		UiObject object = new UiObject(
				new UiSelector().resourceIdMatches(resourceid));
		if (object.exists()) {
			infoLog(FindObject + resourceid);
			return true;
		} else {
			infoLog(NotFindObject + resourceid);
			return false;
		}
	}

	/**
	 * 通过文本判断某个控件是否存在
	 */
	public boolean isExistbyText(String text) throws Exception {
		UiObject object = new UiObject(new UiSelector().textMatches(text));
		if (object.exists()) {
			infoLog(FindObject + text);
			return true;
		} else {
			infoLog(NotFindObject + text);
			return false;
		}
	}

	/**
	 * 通过控件ID返回此控件显示的文本，如果此控件ID不存在，则抛异常,测试失败
	 */
	public String getViewTextById(String resourceid) throws Exception {
		UiObject object = new UiObject(
				new UiSelector().resourceIdMatches(resourceid));
		if (object.exists()) {
			infoLog(FindObject + resourceid);
			return object.getText();
		} else {
			infoLog(NotFindObject + resourceid);
			throw new Exception(NotFindObject + resourceid);
		}
	}
	/**
	 * 强查找控件通过文本，不存在抛出异常，当前用例失败
	 */
	public UiObject findViewByDesc(String text) throws Exception {
		UiObject object = new UiObject(new UiSelector().textContains(text));
		if (object.exists()) {
			infoLog(FindObject + text);
			return object;
		} else {
			infoLog(NotFindObject + text);
			throw new Exception("NotFindObject" + text);
		}
	}
	/**
	 * 弱查找控件通过文本描述，不存在返回空，不会抛异常，当前用例正常执行
	 */
	public UiObject findViewByDesc2(String text) throws Exception {
		UiObject object = new UiObject(new UiSelector().textContains(text));
		return object;
	}
	/**
	 * 强查找控件通过文本，不存在抛出异常，当前用例失败
	 */
	public UiObject findViewByText(String text) throws Exception {
		UiObject object = new UiObject(new UiSelector().textContains(text));
		if (object.exists()) {
			infoLog(FindObject + text);
			return object;
		} else {
			infoLog(NotFindObject + text);
			throw new Exception("NotFindObject" + text);
		}
	}

	/**
	 * 弱查找控件通过文本，不存在返回空，不会抛异常，当前用例正常执行
	 */
	public UiObject findViewByText2(String text) {
		UiObject object = new UiObject(new UiSelector().textMatches(text));
		return object;
	}

	/**
	 * 强查找可翻滚控件，存在返回控件对象，不存在抛异常，当前测试停止
	 */
	public UiScrollable findScrollViewById(String resourceid) throws Exception {
		UiScrollable object = new UiScrollable(
				new UiSelector().resourceIdMatches(resourceid));
		if (object.exists()) {
			infoLog(FindObject + resourceid);
			return object;
		} else {
			infoLog(NotFindObject + resourceid);
			throw new Exception("NotFindObject" + resourceid);
		}
	}
	/**
	 * 强查找可翻滚控件，存在返回控件对象，不存在抛异常，当前测试停止
	 * @throws Exception 
	 */
	public void ScrollViewByText(String text) throws Exception {
		UiScrollable listScrollable = new UiScrollable(new UiSelector().scrollable(true));
		listScrollable.setMaxSearchSwipes(10);
		try {
			listScrollable.scrollTextIntoView(text);
			infoLog( FindScrollFindObject+ text);
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			infoLog( NotFindScrollFindObject+ text);
			throw new Exception("ScrollFindObject" + text);
		}
	}
	/**
	 * 强查找可翻滚控件，存在返回控件对象，不存在抛异常，当前测试停止
	 * @throws Exception 
	 */
	public boolean ScrollViewByTextNotFind(String text) throws Exception {
		boolean isfind = true;
		UiScrollable listScrollable = new UiScrollable(new UiSelector().scrollable(true));
		listScrollable.setMaxSearchSwipes(80);
		isfind = listScrollable.scrollTextIntoView(text);
		if (isfind) {
			infoLog( FindScrollFindObject+ text);
		}else{
			infoLog( NotFindScrollFindObject+ text);
		}
		return isfind;
	}
	/**
	 * 强查找控件通过控件ID,之后点击
	 */
	public void clickViewById(String resourceid) throws Exception {
		UiObject object = findViewById(resourceid);
		object.clickAndWaitForNewWindow();
	}

	/**
	 * 强查找控件通过控件text,之后点击
	 */
	public void clickViewByText(String text) throws Exception {
		UiObject object = findViewByText(text);
		object.clickAndWaitForNewWindow();
	}

	/**
	 * 判断是否出现崩溃或者无响应，主要用于正常流程中，返回idle界面后对异常的判断
	 */
	public void checkCrash() throws Exception {
		UiObject AppCrash = findViewByText2("Unfortunately");
		UiObject ANR = findViewByText2("Sioeye-App isn't responding.");
		if (AppCrash.exists()) {
			infoLog(Exception_Crash + "Unfortunately");
			throw new Exception();
		}
		if (ANR.exists()) {
			infoLog(Exception_ANR + "Sioeye-App isn't responding.");
			throw new Exception();
		}
	}
	/**
	 * 失败测试用例结果呈现
	 */
	public void failcase(String runcase) {
		Log.d(TAG + runcase, TestResult + "The Test Case " + runcase
				+ " Failed");
		System.out.println("[" + TAG + runcase + "] " + TestResult
				+ "The Test Case " + runcase + " Failed");
	}

	/**
	 * 失败测试用例失败原因
	 */
	public void errorLog(String errlog) {
		Log.d(TAG + runcase, FailReason + errlog);
		System.out.println("[" + TAG + runcase + "] " + FailReason + errlog);
	}

	/**
	 * 通过测试用例总结
	 */
	public void passcase() {
		Log.d(TAG + runcase, TestResult + "The Test case " + runcase + " Pass");
		System.out.println("[" + TAG + runcase + "] " + TestResult
				+ "The Test case " + runcase + " Pass");
	}

	/**
	 * 打印log
	 */

	public void infoLog(String logmsg) {
		Log.d(TAG + runcase, logmsg);
		System.out.println("[" + TAG + runcase + "] " + logmsg);
	}

	/**
	 * 开始执行Log
	 */
	public void startLog(String logmsg) {
		Log.d(TAG + runcase, logmsg);
		System.out.println("[" + TAG + runcase + "] " + logmsg);
	}

	/**
	 * 在手机路径/sdcard/CktTest/创建对应用例的文件夹，用于存放失败截图，性能测试的LOG等
	 * 
	 */
	public void createFolder() throws IOException {
		waitTime(1);
		Runtime.getRuntime().exec("mkdir -p /sdcard/CktTest/screen/");
		waitTime(1);
		Runtime.getRuntime().exec("rm -r /sdcard/CktTest/Performance/");
		waitTime(1);
		Runtime.getRuntime().exec("mkdir -p /sdcard/CktTest/Performance/");
	}

	/**
	 * 截取当前失败用例的图，并存放在对应的测试用例文件夹下
	 */
	public void takeScreen(String currentTime) throws IOException {
		device.takeScreenshot(new File("/sdcard/CktTest/" + "screen" + "/"
				+ currentTime + ".png"), 0, 50);
	}

	/**
	 * 抓取并保存bugreport
	 */
	public String takeBugReport(String crashType, String currentTime)
			throws IOException {
		infoLog("开始抓取崩溃日志");
		try {
			// Executes the command.
			String logname = "/sdcard/CktTest/" + "screen" + "/Crash_"
					+ crashType + "_" + currentTime + ".txt";
			File file = new File(logname);
			file.createNewFile();
			FileOutputStream out = new FileOutputStream(file, true);
			Process process = Runtime.getRuntime()
					.exec("/system/bin/bugreport");
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					process.getInputStream()));
			int read;
			char[] buffer = new char[4096];
			while ((read = reader.read(buffer)) > 0) {
				StringBuffer output = new StringBuffer();
				output.append(buffer, 0, read);
				out.write(output.toString().getBytes("utf-8"));
			}
			// Waits for the command to finish.
			process.waitFor();
			reader.close();
			out.close();
			return logname;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

	/**
	 * 判断异常情况，并做相应的处理
	 */
	public String checkFailReason(String currentTime, String eMessage)
			throws Exception {
		String s = null;
		boolean ipcStatus =true;
		//boolean ipcStatus = checkIPCConnect();
		waitTime(5);
		takeScreen(currentTime);
		infoLog("截图存储在 /sdcard/CktTest/screen/" + currentTime + ".png");
		UiObject AppCrash = findViewByText2("无响应");
		UiObject ANR = findViewByText2("很抱歉");
		if (AppCrash.exists()) {
			s = "App Crash happened";
			infoLog("发生App Crash，正在捕获异常");
			takeBugReport("CRASH", currentTime);
		} else if (ANR.exists()) {
			s = "ANR happened";
			infoLog("发生ANR，正在捕获异常");
			takeBugReport("ANR", currentTime);
		} else if (!ipcStatus) {
			infoLog("IPC断开连接");
			s = "IPC断开连接";
		} else {
			infoLog("发生异常，正在捕获异常");
			takeBugReport("Exception", currentTime);
			s = eMessage;
		}
		waitTime(5);
		UiObject AppCrashBtn = findViewByText2("OK");
		for (int i = 0; i < 5; i++) {
			if (AppCrashBtn.exists()) {
				try {
					AppCrashBtn.clickAndWaitForNewWindow();
					waitTime(5);
				} catch (UiObjectNotFoundException e1) {
					e1.printStackTrace();
				}
			}
		}
		return s;
	}

	/**
	 * 获得随机字符
	 */
	public String getRandomString(int length) {
		String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			int number = random.nextInt(62);
			sb.append(str.charAt(number));
		}
		return sb.toString();
	}

	/**
	 * 获得随机字符串
	 */
	public String getRandomDescription(int length) {
		String s = null;
		for (int i = 0; i < length; i++) {
			s = s + getRandomString(10) + " ";
		}
		return s;
	}
	/***
	 * 退出APP
	 */
	public void backToIdl() throws Exception {
		for (int i = 0; i < 5; i++) {
			device.pressBack();
		}
	}
	/***
	 * 返回到指定ID存在的界面
	 */
	public void backToScreen(String resourceid) throws Exception {
		UiObject object = findViewById2(resourceid);
		int step = 0;
		while (step < 10) {
			if (object.exists()) {
				infoLog("找到控件: " + resourceid);
				break;
			} else {
				device.pressBack();
				waitTime(2);
				step = step + 1;
			}
		}
	}

	/**
	 * 等待时间设置
	 * 
	 * @param n
	 *            等待时间，单位为秒
	 */
	public static void waitTime(int n) {
		long time = n * 1000;
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 向下翻页
	 * 
	 * @param scrollTime
	 *            下拉次数
	 */
	public void scrollDown(int scrollTime) throws UiObjectNotFoundException {
		UiScrollable object = null;
		UiScrollable object1 = new UiScrollable(
				new UiSelector().className("android.widget.ListView"));
		UiScrollable object2 = new UiScrollable(
				new UiSelector().className("android.widget.GridView"));
		if (object1.exists()) {
			object = object1;
		}
		if (object2.exists()) {
			object = object2;
		}
		if (object != null) {
			infoLog(TestInfo + "向下翻动" + scrollTime + "页");
			for (int i = 1; i < (scrollTime + 1); i++) {
				object.scrollBackward(20);
				infoLog(TestInfo + "向下翻动第" + i + "页");
			}
		} else {
			infoLog(TestInfo + "列表不存在");
		}

	}

	/**
	 * 上翻
	 * 
	 * @param scrollTime
	 *            上翻次数
	 * @throws UiObjectNotFoundException
	 */
	public void scrollUp(int scrollTime) throws UiObjectNotFoundException {
		UiScrollable object = null;
		UiScrollable object1 = new UiScrollable(
				new UiSelector().className("android.widget.ListView"));
		UiScrollable object2 = new UiScrollable(
				new UiSelector().className("android.widget.GridView"));
		if (object1.exists()) {
			object = object1;
		}
		if (object2.exists()) {
			object = object2;
		}
		if (object != null) {
			infoLog(TestInfo + "向上翻动" + scrollTime + "页");
			for (int i = 1; i < (scrollTime + 1); i++) {
				object.scrollForward(20);
				infoLog(TestInfo + "向上翻动第" + i + "页");
			}
		} else {
			infoLog(TestInfo + "列表不存在");
		}

	}

	/**
	 * 向下翻页直到找到指定控件
	 * 
	 * @param scrollTime
	 *            下翻页次数
	 * @param resourceid
	 *            指定ID
	 */
	public boolean scrollDownToObject(int scrollTime, String resourceid)
			throws Exception {
		UiScrollable object = new UiScrollable(
				new UiSelector().className("android.widget.ListView"));
		boolean findlist = false;
		boolean findObject = false;
		if (object.exists()) {
			findlist = true;
		} else {
			infoLog("列表不存在");
		}
		int n = 0;
		while (findlist && n < scrollTime) {
			if (isExist(resourceid)) {
				infoLog("找到控件 " + resourceid);
				findObject = true;
				break;
			} else {
				infoLog(TestInfo + "没有找到控件，继续向下翻动" + n + "页");
				object.scrollBackward();
				n = n + 1;
			}
		}
		return findObject;
	}

	/**
	 * 向上翻页直到找到指定控件
	 * 
	 * @param scrollTime
	 *            上翻次数
	 * @param resourceid
	 *            指定ID
	 */
	public boolean scrollUpToObject(int scrollTime, String resourceid)
			throws Exception {
		UiScrollable object = new UiScrollable(
				new UiSelector().className("android.widget.ListView"));
		boolean findlist = false;
		boolean findObject = false;
		if (object.exists()) {
			findlist = true;
		} else {
			infoLog("列表不存在");
		}
		int n = 1;
		while (findlist && n < (scrollTime + 1)) {
			UiObject aimBtn = findViewById2(resourceid);
			if (aimBtn.exists()) {
				infoLog("找到控件 " + resourceid);
				findObject = true;
				break;
			} else {
				infoLog(TestInfo + "没有找到控件，继续向下翻动" + n + "页");
				object.scrollForward();
				n = n + 1;
			}
		}
		return findObject;
	}

	/**
	 * 返回操作
	 */
	public void navigateup() throws Exception {
		infoLog(TestInfo + "点击左上角的返回按钮-Navigate up");
		UiObject navObj = findViewByDesc2("Navigate up");
		if (navObj.exists()) {
			infoLog(FindObject + "Navigate up");
			navObj.clickAndWaitForNewWindow();
		}else {
			infoLog(FindObject + "Navigate up By xpath -android.widget.ImageButton[@index='0']");
			new UiObject(new UiSelector().className("android.widget.ImageButton").instance(0)).clickAndWaitForNewWindow();
		}
	}
	/**
	 * 返回桌面
	 */
	public void backToHome() throws Exception {
		infoLog(TestInfo + "正在返回Home主页");
		for (int i = 0; i < 10; i++) {
			device.pressBack();
		}
		waitTime(2);
		UiObject exitbtn = null;
		UiObject exitbtn1 = findViewByText2("确认");
		if (exitbtn1.exists()) {
			exitbtn = exitbtn1;
		}
		if (exitbtn != null) {
			exitbtn.clickAndWaitForNewWindow();
			waitTime(1);
			infoLog(TestInfo + "点击按钮退出");
			for (int i = 0; i < 5; i++) {
				device.pressBack();
			}
			waitTime(2);
			String name = device.getCurrentPackageName();
			infoLog("===当前package:" + name);
			int inIdle = 1;
			while (inIdle < 10) {
				if (name.equalsIgnoreCase("com.sioeye.sioeyeapp")) {
					infoLog("继续返回Home主页");
					device.pressBack();
					inIdle = inIdle + 1;
				} else {
					infoLog("已经到Home主页");
					break;
				}
			}
			if (inIdle == 10) {
				infoLog("执行强制删除");
				killActivity();
			}
		}
	}
	/**
	 * 获取当前时间后，根据checkFailReason处理异常
	 */
	public void handleException(String errorlog) throws Exception {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		Date curDate = new Date(System.currentTimeMillis());
		String str = formatter.format(curDate);
		createFolder();
		String s = checkFailReason(str, errorlog);
		waitTime(2);
		backToHome();
		errorLog(s);
		failcase(runcase);
		startLog("*****End to run " + runcase + " *****");
		UiAutomatorTestCase.fail("Case Failed==> " + s);
	}

	public void takeNormalPic(UiDevice device) throws Exception {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		Date curDate = new Date(System.currentTimeMillis());
		String str = "Normal_" + formatter.format(curDate);
		createFolder();
		takeScreen(str);
		infoLog("截图存储在 /sdcard/CktTest/screen/" + str + ".png");
	}


	/**
	 * 获取屏幕上的某个坐标
	 */
	public int[] getAnyLocation() {
		int h = device.getDisplayHeight();
		int w = device.getDisplayWidth();
		int[] al = { w / 2, h / 3 };
		return al;
	}

	/**
	 * 点击屏幕上的某个点
	 */
	public void clickByLocation() {
		int[] al = getAnyLocation();
		device.click(al[0] / 2, al[1] / 2);
	}
	/**
	 * 配置timeout时间
	 * @param time Integer
	 */
	public void configTimeout(int time){
		Configurator confg = Configurator.getInstance();
		long timeout = confg.getWaitForSelectorTimeout();
		//获取Selector timeout
		confg.setWaitForSelectorTimeout(timeout+time);
	}
}
