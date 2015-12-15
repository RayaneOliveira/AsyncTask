package com.example.async;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        EditText email = (EditText) findViewById(R.id.Email);
        EditText senha = (EditText) findViewById(R.id.Password);
        Button login = (Button) findViewById(R.id.btnLogin);
      
        
        login.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				LoginAsyncTask loginasynctask = new LoginAsyncTask();
				String[] values = new String[];
				
				loginasynctask.execute(values);
				
			}
		});
      
    }

}


