package me.pgb.a2021_03_16a_breceiver;

import android.content.Intent;
import android.os.Parcelable;
import android.provider.Telephony;

public class IntentActionHolder {

    public static final String [] MyIntents = {
            Intent.ACTION_BATTERY_LOW,
            Intent.ACTION_ANSWER,
            Intent.ACTION_DIAL,
            Intent.ACTION_BOOT_COMPLETED,
            Intent.ACTION_POWER_CONNECTED,
            Intent.ACTION_SHUTDOWN,
            Intent.ACTION_CAMERA_BUTTON,
            Intent.ACTION_BATTERY_OKAY,
            Telephony.Sms.Intents.SMS_DELIVER_ACTION
    };

}
