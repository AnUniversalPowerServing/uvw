package anups.uvw.br;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import anups.uvw.constants.BusinessConstants;
import anups.uvw.js.AppSessionManagement;
import anups.uvw.notify.ws.WSIntervalMinute;
import anups.uvw.util.AndroidLogger;
import anups.uvw.util.GPSTracker;
import anups.uvw.web.templates.URLGenerator;

public class BRIntervalMinute extends BroadcastReceiver {
 org.apache.log4j.Logger logger = AndroidLogger.getLogger(BRIntervalMinute.class);
	
 @Override
 public void onReceive(Context context, Intent intent) {
	 logger.info("Triggered BRIntervalMinute...");
	 
 }

 
}
