package com.coolweather.app.receiver;

import com.coolweather.app.service.AutoUpdateService;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AutoUpdateReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context contxt, Intent intent) {
		Intent i = new Intent(contxt, AutoUpdateService.class);
		contxt.startService(i);
	}

}
