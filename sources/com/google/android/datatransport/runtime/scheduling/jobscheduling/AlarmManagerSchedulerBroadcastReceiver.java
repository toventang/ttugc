package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.AbstractC25162k;
import com.google.android.datatransport.runtime.C25168p;
import com.google.android.datatransport.runtime.p1928e.C25154a;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    static {
        Covode.recordClassIndex(30582);
    }

    /* renamed from: a */
    private static Bundle m48359a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = m48359a(intent).getInt("attemptNumber");
        C25168p.m48273a(context);
        AbstractC25162k.AbstractC25163a a = AbstractC25162k.m48261d().mo41125a(queryParameter).mo41124a(C25154a.m48225a(intValue));
        if (queryParameter2 != null) {
            a.mo41126a(Base64.decode(queryParameter2, 0));
        }
        C25168p.m48272a().f59612a.mo41212a(a.mo41127a(), i, RunnableC25217b.f59709a);
    }
}
