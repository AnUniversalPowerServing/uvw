package anups.uvw.notify.ws;

import android.content.Context;
import android.os.AsyncTask;
import anups.uvw.notify.ws.response.WSRIntervalDay;
import anups.uvw.notify.ws.util.WSUtility;
import anups.uvw.util.AndroidLogger;

public class WSIntervalDay extends AsyncTask<String, String, String> {
  org.apache.log4j.Logger logger = AndroidLogger.getLogger(WSIntervalDay.class);
  private Context context;
  
  public WSIntervalDay(Context context){ this.context=context; }
 
  @Override
  protected String doInBackground(String... params) {
    WSUtility wsUtility = new WSUtility();
    return wsUtility.HttpURLGETResponse(params[0]);
  }

  @Override  
  protected void onPostExecute(String response) {
	 WSRIntervalDay wsrIntervalDay = new WSRIntervalDay(response);
  }
}
