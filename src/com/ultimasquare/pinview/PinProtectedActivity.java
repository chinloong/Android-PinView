package com.ultimasquare.pinview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PinProtectedActivity extends Activity {

	Button enterPin;
	Context appContext;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		appContext = this;
		
		setContentView(R.layout.activity_pin_protected_activity);
		
		enterPin = (Button) findViewById(R.id.buttonEnterPin);
		
		enterPin.setOnClickListener(new View.OnClickListener() {
		    public void onClick(View v) {
		    
		    	
		    	Intent intent = new Intent(appContext, PinEntryView.class);
		    	startActivity(intent);
		    }
		    
		    }
		);
		
	}
	
	

}
