package me.pgb.a2021_03_16a_breceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    private final String TAG = "BROADCAST__";

    @Override
    public void onReceive(Context context, Intent intent) {
        String actionString = intent.getAction();

        String data = intent.getDataString();
        Toast.makeText(context, actionString + " : " + data, Toast.LENGTH_LONG).show();
        Log.i(TAG, "onReceive: " + actionString);
    }
}