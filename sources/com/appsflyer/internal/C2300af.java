package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import com.appsflyer.AndroidUtils;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerLibCore;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.FirebaseMessagingServiceListener;
import com.appsflyer.internal.C2315c;
import com.bytedance.covode.number.Covode;

/* renamed from: com.appsflyer.internal.af */
public final class C2300af {
    static {
        Covode.recordClassIndex(2552);
    }

    C2300af() {
    }

    /* renamed from: ǃ */
    public static boolean m7063(Context context) {
        if (AppsFlyerLib.getInstance().isTrackingStopped()) {
            return false;
        }
        try {
            Class.forName("com.google.firebase.messaging.FirebaseMessagingService");
            if (AndroidUtils.m6939(context, new Intent("com.google.firebase.MESSAGING_EVENT", null, context, FirebaseMessagingServiceListener.class))) {
                return true;
            }
            AFLogger.afWarnLog("Cannot verify existence of our InstanceID Listener Service in the manifest. Please refer to documentation.");
            return false;
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            AFLogger.afErrorLog("An error occurred while trying to verify manifest declarations: ", th);
        }
    }

    /* renamed from: ı */
    public static void m7062(Context context, String str) {
        if (str != null) {
            AFLogger.afInfoLog("updateServerUninstallToken called with: ".concat(String.valueOf(str)));
            C2315c.C2316a.C2317c r3 = C2315c.C2316a.C2317c.m7115(AppsFlyerProperties.getInstance().getString("afUninstallToken"));
            SharedPreferences sharedPreferences = AppsFlyerLibCore.getSharedPreferences(context);
            if (!sharedPreferences.getBoolean("sentRegisterRequestToAF", false) || r3.f7041 == null || !r3.f7041.equals(str)) {
                AppsFlyerProperties.getInstance().set("afUninstallToken", str);
                if (AppsFlyerLibCore.m6963(sharedPreferences)) {
                    AppsFlyerLibCore.getInstance().mo6359(context, str);
                }
            }
        }
    }
}
