package anups.uvw.util;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.DefaultHttpClient;

import anups.uvw.constants.BusinessConstants;
import anups.uvw.notify.ws.FilesTransactionService;
import anups.uvw.util.utility.*;

public class FilesTransactionUtility {
/* ===========================================
 * CLASS DESCRIPTION :
 * ===========================================
 * This is the class that contains two methods:
 *  1) serverToClientTransaction
 *  2) clientToServerTransaction
 */
  org.apache.log4j.Logger logger = AndroidLogger.getLogger(FilesTransactionService.class);
	 
  private String transactionMode;
  
  private int serverToClientProgressBar;
  
  private int clientToServerProgressBar;
	 
  public int getProgressBar(){
	int progressBar = 0;
	if("SERVER_TO_CLIENT".equalsIgnoreCase(transactionMode)){
		progressBar = this.serverToClientProgressBar;
	} else if("CLIENT_TO_SERVER".equalsIgnoreCase(transactionMode)){
		progressBar = this.clientToServerProgressBar;
	}
	return progressBar;
  }
	 
  
  public void serverToClientTransaction(String downloadFromURL, String downloadToPath, String fileName, String transactionFormat){
	this.transactionMode = "SERVER_TO_CLIENT";
    String toRoot = BusinessConstants.PROJECTSTORAGEFOLDER+File.separator+downloadToPath+fileName;
	String fromRoot = downloadFromURL+fileName;
	boolean existsNoUploadRecognizer = false;
	if("EXISTS_NO_UPLOAD".equalsIgnoreCase(transactionFormat)){
		File file = new File(toRoot);
		if(file.exists()) { existsNoUploadRecognizer = true; }
	} else if("DELETE_BEFORE_UPLOAD".equalsIgnoreCase(transactionFormat)){
		File file = new File(toRoot);
		if(file.exists()) { file.delete(); }
	}
   
    if(!existsNoUploadRecognizer){
    	try {
    		URL url = new URL(fromRoot);
    	    URLConnection urlConn = url.openConnection();

          if (!(urlConn instanceof HttpURLConnection)) { logger.info("Http URL "); }
    			
          HttpURLConnection httpConn = (HttpURLConnection) urlConn;
          httpConn.setAllowUserInteraction(false);
          httpConn.setInstanceFollowRedirects(true);
          httpConn.setRequestMethod("GET");
          httpConn.setDoOutput(true);
          httpConn.connect();
          // getting file length
          float lengthOfFile = httpConn.getContentLength();
          logger.info("fromRoot: "+fromRoot);
          logger.info("toRoot: "+toRoot);
          logger.info("lengthOfFile: "+lengthOfFile);
          
          // input stream to read file - with 8k buffer
          InputStream input = new BufferedInputStream(url.openStream(),8192);
          FileOutputStream output = new FileOutputStream(toRoot, true);
         
          InputStream in = httpConn.getInputStream();
          byte[] buffer = new byte[1024];
          int len1 = 0;
          float progressCount = 0;
          while ((len1 = in.read(buffer)) > 0) {
              output.write(buffer, 0, len1);
              progressCount = progressCount+len1;
              float score = (1-((lengthOfFile-progressCount)/lengthOfFile))*100;
              serverToClientProgressBar = Math.round(score);
          }
          output.close();
          input.close();
    	} catch (MalformedURLException e) { logger.error("Exception: "+e.getMessage());  } 
  	      catch(IOException e) { logger.error("Exception: "+e.getMessage()); }
    }	
  }
  
  public void clientToServer(String downloadFromPath, String fileName, String webservice, String downloadToPath,
		  String transactionFormat) {
	this.transactionMode = "CLIENT_TO_SERVER";
	String fromRoot = downloadFromPath+fileName;
	logger.info("fromRoot: "+fromRoot);
	logger.info("webservice: "+webservice);
    
    try {
    	
    	String lineEnd = "\r\n";
        String twoHyphens = "--";
        String boundary = "*****";
        	
        	URL url = new URL(webservice);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoInput(true);
            conn.setDoOutput(true);
            conn.setUseCaches(false);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Connection", "Keep-Alive");
            conn.setRequestProperty("Content-Type", "multipart/form-data;boundary="+boundary);
            DataOutputStream dos = new DataOutputStream( conn.getOutputStream() );
            dos.writeBytes(twoHyphens + boundary + lineEnd);
            dos.writeBytes("Content-Disposition: form-data; name=\"uploaded_file\";filename=\"" + fileName +"\"" + lineEnd);
            dos.writeBytes(lineEnd);
            FileInputStream fileInputStream  = new FileInputStream (new File(fromRoot));
            int bytesAvailable = fileInputStream.available();
            int maxBufferSize = 1024;
            int bufferSize = Math.min(bytesAvailable, maxBufferSize);
            byte[] buffer = new byte[bufferSize];
            int bytesRead = fileInputStream.read(buffer, 0, bufferSize);
            while (bytesRead > 0){
                dos.write(buffer, 0, bufferSize);
                bytesAvailable = fileInputStream.available();
                bufferSize = Math.min(bytesAvailable, maxBufferSize);
                bytesRead = fileInputStream.read(buffer, 0, bufferSize);
            }
            dos.writeBytes(lineEnd);
            dos.writeBytes(twoHyphens + boundary + twoHyphens + lineEnd);
            fileInputStream.close();
            dos.flush();
            InputStream is = conn.getInputStream();
            int ch;
            StringBuffer b =new StringBuffer();
            while( ( ch = is.read() ) != -1 ){
                b.append( (char)ch );
            }
            String s=b.toString();
            logger.info("Response:"+s);
            dos.close();
    	/*
      URL url = new URL(webservice);
      HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
    	httpConn.setUseCaches(false);
    	httpConn.setDoOutput(true); // indicates POST method
    	httpConn.setDoInput(true);
    	httpConn.setRequestMethod("POST");
    	httpConn.setRequestProperty("Connection", "Keep-Alive");
    	httpConn.setRequestProperty("Content-Type","multipart/form-data; boundary====" + System.currentTimeMillis() + "===");
    	httpConn.setRequestProperty("User-Agent", "Mozilla/5.0");
    	
      String LINE_FEED = "\r\n";
    	
      
      OutputStream outputStream = httpConn.getOutputStream();
      PrintWriter writer = new PrintWriter(new OutputStreamWriter(outputStream, "UTF-8"), true);
    	
      File uploadFile = new File(fromRoot);
      StringBuilder sb = new StringBuilder();
      sb.append("Content-Disposition: form-data; name=\"uploaded_file\";filename=\""+fileName+"\"").append(LINE_FEED);
      sb.append("Content-Type: "+ URLConnection.guessContentTypeFromName(fileName)).append(LINE_FEED);
      sb.append("Content-Transfer-Encoding: binary").append(LINE_FEED);
      sb.append(LINE_FEED);
      
      logger.info("Content: "+sb.toString());
      writer.append(sb.toString());
      writer.flush();

      FileInputStream inputStream = new FileInputStream(uploadFile);
      byte[] buffer = new byte[4096];
      int bytesRead = -1;
      while ((bytesRead = inputStream.read(buffer)) != -1) {
      outputStream.write(buffer, 0, bytesRead);
      }
      outputStream.flush();
      inputStream.close();

      writer.append(LINE_FEED);
      writer.flush();
      
      int status = httpConn.getResponseCode();
      if (status == HttpURLConnection.HTTP_OK) {
      BufferedReader reader = new BufferedReader(new InputStreamReader(httpConn.getInputStream()));
      String line = null;
      while ((line = reader.readLine()) != null) {
       logger.info(line);
      }
      reader.close();
      httpConn.disconnect();
      }
      */
    //	MultipartUtility multipart = new MultipartUtility(webservice, "UTF-8");
       
    //    multipart.addHeaderField("User-Agent", "Mozilla/5.0");
        /*  multipart.addHeaderField("Test-Header", "Header-Value");
         
        multipart.addFormField("description", "Cool Pictures");
        multipart.addFormField("keywords", "Java,upload,Spring");
         */
     //   multipart.addFilePart("uploaded_file", new File(fromRoot));

     //   List<String> response = multipart.finish();
         
     /*   logger.info("SERVER REPLIED:");
        logger.info("----------");
        for (String line : response) {
           logger.info(line);
        }
        logger.info("----------");
    	*/
    } catch (Exception e) { logger.error("Exception e:"+e.getMessage());
	
  }
  }
}
