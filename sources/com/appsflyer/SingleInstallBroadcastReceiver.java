package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;

public class SingleInstallBroadcastReceiver extends BroadcastReceiver {
    static {
        Covode.recordClassIndex(2537);
    }

    /* renamed from: com_appsflyer_SingleInstallBroadcastReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra */
    public static String m7040x3fd47291(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            try {
                String com_appsflyer_SingleInstallBroadcastReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = m7040x3fd47291(intent, "referrer");
                if (!(com_appsflyer_SingleInstallBroadcastReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra == null || AppsFlyerLibCore.getSharedPreferences(context).getString("referrer", null) == null)) {
                    AppsFlyerLibCore.getInstance();
                    AppsFlyerLibCore.m6956(context, com_appsflyer_SingleInstallBroadcastReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra);
                    return;
                }
            } catch (Throwable th) {
                AFLogger.afErrorLog("error in BroadcastReceiver ", th);
            }
            String string = AppsFlyerProperties.getInstance().getString("referrer_timestamp");
            long currentTimeMillis = System.currentTimeMillis();
            if (string == null || currentTimeMillis - Long.valueOf(string).longValue() >= InteractFirstFrameTimeOutDurationSetting.DEFAULT) {
                AFLogger.afInfoLog("SingleInstallBroadcastReceiver called");
                AppsFlyerLibCore.getInstance().mo6356(context, intent);
                AppsFlyerProperties.getInstance().set("referrer_timestamp", String.valueOf(System.currentTimeMillis()));
            }
        }
    }
}
