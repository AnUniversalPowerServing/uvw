package anups.uvw.app;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import anups.uvw.util.NetworkUtility;
public class AndroidWebViewClient extends WebViewClient {
   
	Context context;
	
	public AndroidWebViewClient(Context context){
		this.context=context;
	}

    public boolean shouldOverrideUrlLoading(WebView view, String url) {

    	if (url.startsWith("tel:")) { 
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse(url)); 
            view.getContext().startActivity(intent);
            return true;
         } 
    	
    	else if (url.startsWith("http") || url.startsWith("https")) {
    		NetworkUtility networkUtility = new NetworkUtility(context);
    		if(!networkUtility.checkInternetConnection()) {
    			view.loadUrl("file:///android_asset/www/network_state.html"); 
    		} 
    		return false; 
    	}
    	else  if (url.endsWith(".pdf")) {
    		NetworkUtility networkUtility = new NetworkUtility(context);
    		if(!networkUtility.checkInternetConnection()) {
    			view.loadUrl("file:///android_asset/www/network_state.html"); 
    		}
            return false;
    	} 
    	else if (url.startsWith("file")){
    		NetworkUtility networkUtility = new NetworkUtility(context);
    		if(!networkUtility.checkInternetConnection()) {
    			view.loadUrl("file:///android_asset/www/network_state.html"); 
    		}
    	   return false;
    	}
    	else {
           Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
           view.getContext().startActivity(intent);
           return true;
    	 }
    }

    // Show loader on url load
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
      
    }

    // Called when all page resources loaded
    public void onPageFinished(WebView view, String url) {
    	

    }
}
