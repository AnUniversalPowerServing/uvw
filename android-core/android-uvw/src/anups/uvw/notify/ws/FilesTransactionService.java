package anups.uvw.notify.ws;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.DecimalFormat;

import android.content.Context;
import android.os.AsyncTask;
import anups.uvw.app.AndroidWebScreen;
import anups.uvw.constants.BusinessConstants;
import anups.uvw.util.AndroidLogger;
import anups.uvw.util.FilesTransactionUtility;

public class FilesTransactionService extends AsyncTask<String, String, String> {
 org.apache.log4j.Logger logger = AndroidLogger.getLogger(FilesTransactionService.class);
 
 private Context context;
 
 private FilesTransactionUtility filesTransactionUtility;
 
 public FilesTransactionService(Context context, FilesTransactionUtility filesTransactionUtility){ 
	 this.context=context; 
	 this.filesTransactionUtility = filesTransactionUtility;
 }
	
 @Override
 protected String doInBackground(String... params) {
  String downloadFrom = params[0];
  String downloadTo  = params[1];
  String fileName = params[2];
  String transactionMode = params[3]; // SERVER_TO_CLIENT / CLIENT_TO_SERVER
  String transactionFormat = params[4]; // DELETE_BEFORE_UPLOAD / EXISTS_NO_UPLOAD
  String webservice = BusinessConstants.WEBSERVICE_FILEUPLOAD;
  try {
         // String root = Environment.getExternalStorageDirectory().toString();
   if("SERVER_TO_CLIENT".equalsIgnoreCase(transactionMode)){
     filesTransactionUtility.serverToClientTransaction(downloadFrom, downloadTo, fileName, transactionFormat);
   } else if("CLIENT_TO_SERVER".equalsIgnoreCase(transactionMode)){
	   filesTransactionUtility.clientToServer(downloadFrom, fileName, webservice, downloadTo, transactionFormat);
   }
   
   
  }
  catch(Exception e){ logger.error("Exception: "+e.getMessage()); }
  return null;
 }

 /**
  * After completing background task
  * **/
 @Override
 protected void onPostExecute(String result) {
	 logger.info("Downloaded");
 }

}
