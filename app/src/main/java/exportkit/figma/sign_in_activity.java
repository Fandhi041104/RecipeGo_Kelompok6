package com.example.coba2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

public class sign_in_activity extends Activity {
	private View _bg__sign_in;
	private View border;
	private ImageView cap;
	private ImageView capacity;
	private ImageView wifi;
	private ImageView cellularConnection;
	private ImageView battery;
	private ImageView logo;
	private TextView sign_in;
	private TextView _sign_up;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sign_in);

		_bg__sign_in = findViewById(R.id._bg__sign_in);
		border = findViewById(R.id.border);
		cap = findViewById(R.id.cap);
		capacity = findViewById(R.id.capacity);
		wifi = findViewById(R.id.wifi);
		cellularConnection = findViewById(R.id.cellular_connection);
		battery = findViewById(R.id.battery);
		logo = findViewById(R.id.logo);
		View justSignIn = findViewById(R.id.just_sign_in);
		_sign_up = findViewById(R.id._sign_up);
		TextView signInNow = findViewById(R.id.sign_in_now);

		_sign_up.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), sign_up_activity.class);
				startActivity(nextScreen);
			}
		});
	}
}
