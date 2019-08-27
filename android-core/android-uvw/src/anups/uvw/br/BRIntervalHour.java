package anups.uvw.br;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import anups.uvw.js.AppSessionManagement;
import anups.uvw.notify.ws.WSIntervalHour;
import anups.uvw.notify.ws.util.Notifications;
import anups.uvw.services.BGServiceHour;
import anups.uvw.services.BGServiceMinute;
import anups.uvw.util.AndroidLogger;
import anups.uvw.web.templates.URLGenerator;

public class BRIntervalHour  extends BroadcastReceiver{
 org.apache.log4j.Logger logger = AndroidLogger.getLogger(BRIntervalHour.class);

 
 
 @Override
 public void onReceive(Context context, Intent intent) {
	 logger.info("BRIntervalHour Started...");
    
	  // AlarmOnceTrigger.getInstance(context);
   
   
  
  }
 }
