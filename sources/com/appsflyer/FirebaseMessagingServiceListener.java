package com.appsflyer;

import android.content.Context;
import com.appsflyer.internal.C2300af;
import com.appsflyer.internal.C2315c;
import com.bytedance.covode.number.Covode;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;

public class FirebaseMessagingServiceListener extends FirebaseMessagingService {
    static {
        Covode.recordClassIndex(2524);
    }

    /* renamed from: com_appsflyer_FirebaseMessagingServiceListener_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext */
    public static Context m7031xe672607(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        super.onNewToken(str);
        long currentTimeMillis = System.currentTimeMillis();
        if (str != null) {
            AFLogger.afInfoLog("Firebase Refreshed Token = ".concat(String.valueOf(str)));
            C2315c.C2316a.C2317c r0 = C2315c.C2316a.C2317c.m7115(AppsFlyerProperties.getInstance().getString("afUninstallToken"));
            C2315c.C2316a.C2317c cVar = new C2315c.C2316a.C2317c(currentTimeMillis, str);
            if (r0.mo6465(cVar)) {
                C2300af.m7062(m7031xe672607(this), cVar.f7041);
            }
        }
    }
}
