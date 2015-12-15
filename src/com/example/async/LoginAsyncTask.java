package com.example.async;

import android.os.AsyncTask;

public class LoginAsyncTask extends AsyncTask <String, Void, String>{

	protected void onPreExecute() {
		super.onPreExecute();
	}
	
	protected String doInBackground(String... values) {
		return null;
	}
	
	protected void onPostExecute(String... values) {
		super.execute(values);
	}

}
