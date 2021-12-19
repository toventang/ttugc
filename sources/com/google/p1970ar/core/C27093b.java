package com.google.p1970ar.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.google.ar.core.b */
public final class C27093b extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C27086ai f64109a;

    static {
        Covode.recordClassIndex(32645);
    }

    C27093b(C27086ai aiVar) {
        this.f64109a = aiVar;
    }

    /* renamed from: a */
    private static Bundle m53862a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        Bundle a = m53862a(intent);
        if ("com.google.android.play.core.install.ACTION_INSTALL_STATUS".equals(action) && a != null && a.containsKey("install.status")) {
            int i = a.getInt("install.status");
            if (i == 1 || i == 2 || i == 3) {
                this.f64109a.mo45123a(EnumC27087aj.ACCEPTED);
            } else if (i == 4) {
                this.f64109a.mo45123a(EnumC27087aj.COMPLETED);
            } else if (i == 6) {
                this.f64109a.mo45123a(EnumC27087aj.CANCELLED);
            }
        }
    }
}
