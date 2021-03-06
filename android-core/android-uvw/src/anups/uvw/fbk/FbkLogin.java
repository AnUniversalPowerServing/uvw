package anups.uvw.fbk;

import android.support.v7.app.ActionBarActivity;
import android.util.Log;

import java.io.File;
import java.io.IOException;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import anups.uvw.app.R;
import anups.uvw.app.R.id;
import anups.uvw.app.R.layout;
import anups.uvw.app.R.menu;
import anups.uvw.constants.BusinessConstants;
import anups.uvw.util.LogcatHelper;

public class FbkLogin extends Activity {
	 
	CallbackManager callbackManager;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fbklogin);
		try {
		callbackManager = CallbackManager.Factory.create();
        LoginButton loginButton = (LoginButton)findViewById(R.id.login_button);
        loginButton.setReadPermissions("email");
        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
               // App code
            }
            @Override
            public void onCancel() {
                // App code
            }
            @Override
            public void onError(FacebookException exception) {
                // App code
            }
        });
        } catch(Exception e){ Toast.makeText(getApplicationContext(), "Exception "+e, Toast.LENGTH_LONG); }
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
	    super.onActivityResult(requestCode, resultCode, data);
	    callbackManager.onActivityResult(requestCode, resultCode, data);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.fbk_login, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
