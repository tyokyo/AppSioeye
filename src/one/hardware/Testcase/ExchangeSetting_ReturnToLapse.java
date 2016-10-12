package one.hardware.Testcase;

/*执行Lapse里面所有的操作*/

import com.android.uiautomator.core.UiDevice;
import com.ckt.demo.UiAutomatorHelper;

import one.hardware.Action.CameraAction;
import one.hardware.Util.Base;
import one.hardware.Testcase.LapseCase;

public class ExchangeSetting_ReturnToLapse extends Base {
	public void  testExchangeSetting_ReturnToLapse() throws Exception  {
		try {
			 initUIAutomator(this.getName());
			 common.startLog("*****Start to run " + runcase + " *****");
			 common.initDevice();         			
			 common.startCamera();				 		 
			 CameraAction.navconfig(one.hardware.Page.Camera.nav_menu[5]);  
			 
			 LapseCase lcLapseCase = new LapseCase();
			 lcLapseCase.testTLap10s108030AllAngle();
			 lcLapseCase.testTLap10s480120AllAngle();
			 lcLapseCase.testTLap10s48060AllAngle();
			 lcLapseCase.testTLap10s72030AllAngle();
			 lcLapseCase.testTLap10s72060AllAngle();

			 lcLapseCase.testTLap5s108030AllAngle();
			 lcLapseCase.testTLap5s480120AllAngle();			
			 lcLapseCase.testTLap5s48060AllAngle();
			 lcLapseCase.testTLap5s72030AllAngle();
			 lcLapseCase.testTLap5s72060AllAngle();
			
 
			 lcLapseCase.testTLap3s108030AllAngle();
			 lcLapseCase.testTLap3s480120AllAngle();			
			 lcLapseCase.testTLap3s48060AllAngle();
			 lcLapseCase.testTLap3s72030AllAngle();
			 lcLapseCase.testTLap3s72060AllAngle();
	
			 lcLapseCase.testTLap2s108030AllAngle();
			 lcLapseCase.testTLap2s480120AllAngle();	
			 lcLapseCase.testTLap2s48060AllAngle();
			 lcLapseCase.testTLap2s72060AllAngle();
			 lcLapseCase.testTLap2s72030AllAngle();
			 
			 
			 
		} catch (Exception e) {
			common.handleException(e.getMessage());
			}
			
			
		
	}
	public static void main(String[] args) {
		new UiAutomatorHelper("AppSioeye", "one.hardware.Testcase.ExchangeSetting_ReturnToLapse", "testExchangeSetting_ReturnToLapse", "7");

	}

}
