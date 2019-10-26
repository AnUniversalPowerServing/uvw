package anup.uvw.music;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import anups.uvw.app.R;
import anups.uvw.util.AndroidLogger;

public class BackgroundMusicService extends Service {

	private MediaPlayer player;
	 
	org.apache.log4j.Logger logger = AndroidLogger.getLogger(BackgroundMusicService.class);
	  
	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId){
	  player = MediaPlayer.create(this, R.raw.bg01);
	  player.setLooping(true);
	  player.start();
	  logger.info("player status:"+player);
	  return START_STICKY;
	}
	
	@Override
	public void onDestroy(){
		super.onDestroy();
		player.stop();
	}
}
