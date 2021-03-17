package me.pgb.a2021_03_16a_breceiver;

import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Parcelable;
import android.provider.Telephony;

public class IntentActionHolder {

    public static final String [] MyIntents = {
            Intent.ACTION_BATTERY_LOW,
            Intent.ACTION_BATTERY_OKAY,
            Intent.ACTION_POWER_CONNECTED,
            Intent.ACTION_POWER_DISCONNECTED,
            WifiManager.NETWORK_STATE_CHANGED_ACTION,
            "me.pgb.a2021_03_16a_breceiver.SEND_MESSAGE"
    };

}
