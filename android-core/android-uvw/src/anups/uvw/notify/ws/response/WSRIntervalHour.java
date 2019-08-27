package anups.uvw.notify.ws.response;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import android.content.Context;
import anups.uvw.constants.BusinessConstants;
import anups.uvw.js.AppManagement;
import anups.uvw.js.AppSessionManagement;
import anups.uvw.notify.ws.util.Notifications;
import anups.uvw.util.AndroidLogger;
import anups.uvw.util.PushNotification;

public class WSRIntervalHour {
/*
 Response: 
 { "playStoreAppVersion" :"<playStoreAppVersion>" }
 */
 org.apache.log4j.Logger logger = AndroidLogger.getLogger(WSRIntervalHour.class);
 private Context context;
 private String response;
	
 public WSRIntervalHour(Context context,String response){
  this.context=context;
  this.response=response;
 }
 
 public void funcTrigger_playStoreAppVersion(){
  JSONParser jsonParser = new JSONParser();
  try {
    JSONObject jsonObject = (JSONObject)jsonParser.parse(response.toString());
    String playStoreAppVersion=(String) jsonObject.get("playStoreAppVersion");
    String status=new AppManagement(context).checkPlayStoreUpdate(playStoreAppVersion);
    if(status.equalsIgnoreCase("APP_TO_UPDATE")){  
    	new Notifications(context).notify_show_versionStatus();
    }
  } 
  catch(Exception e){ logger.error("Exception funcTrigger_playStoreAppVersion: "+e.getMessage()); }
 }
 
}


