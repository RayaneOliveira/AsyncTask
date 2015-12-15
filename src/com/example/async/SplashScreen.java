package com.example.async;

import android.app.Activity; 
import android.content.Intent; 
import android.os.Bundle; 
import android.os.Handler; 
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;

public class SplashScreen extends Activity { 
	
	private static int SPLASH_TIME_OUT = 4000; 
	
	@Override 
	protected void onCreate(Bundle savedInstanceState) { 
		super.onCreate(savedInstanceState); 
		setContentView(R.layout.activity_splash); 
		 
		ImageView image = (ImageView)findViewById(R.id.imgLogo);
		 
		 AlphaAnimation animation = new AlphaAnimation(0.2f, 1.0f);
		 animation.setDuration(500);
		 animation.setStartOffset(2500);
		 animation.setFillAfter(true);
		 image.startAnimation(animation);
		 
		new Handler().postDelayed(new Runnable() { 
			@Override 
			public void run() {  
				Intent i = new Intent(SplashScreen.this, MainActivity.class); 
				startActivity(i); 
				finish(); 
			} 
		}, SPLASH_TIME_OUT); 
	} 
}




