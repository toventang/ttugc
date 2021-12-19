package com.google.p1970ar.core;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.p1914a.p1916b.p1917a.p1918a.p1919a.AbstractBinderC25059c;
import com.google.p1970ar.core.exceptions.FatalException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.ar.core.c */
final class BinderC27094c extends AbstractBinderC25059c {

    /* renamed from: a */
    final /* synthetic */ AtomicBoolean f64110a;

    /* renamed from: b */
    final /* synthetic */ RunnableC27096e f64111b;

    static {
        Covode.recordClassIndex(32646);
    }

    @Override // com.google.p1914a.p1916b.p1917a.p1918a.p1919a.AbstractC25060d
    /* renamed from: b */
    public final void mo40975b(Bundle bundle) {
    }

    @Override // com.google.p1914a.p1916b.p1917a.p1918a.p1919a.AbstractC25060d
    /* renamed from: a */
    public final void mo40974a(Bundle bundle) {
        if (!this.f64110a.getAndSet(true)) {
            int i = bundle.getInt("error.code", -100);
            int i2 = bundle.getInt("install.status", 0);
            if (i2 == 4) {
                this.f64111b.f64115b.mo45123a(EnumC27087aj.COMPLETED);
            } else if (i != 0) {
                RunnableC27096e eVar = this.f64111b;
                C27088ak.m53851a(eVar.f64114a, eVar.f64115b);
            } else if (bundle.containsKey("resolution.intent")) {
                RunnableC27096e eVar2 = this.f64111b;
                Activity activity = eVar2.f64114a;
                C27086ai aiVar = eVar2.f64115b;
                PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("resolution.intent");
                if (pendingIntent != null) {
                    try {
                        activity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1234, new Intent(activity, activity.getClass()), 0, 0, 0);
                    } catch (IntentSender.SendIntentException e) {
                        aiVar.mo45124a(new FatalException("Installation Intent failed", e));
                    }
                } else {
                    aiVar.mo45124a(new FatalException("Installation intent failed to unparcel."));
                }
            } else if (i2 != 10) {
                switch (i2) {
                    case 1:
                    case 2:
                    case 3:
                        this.f64111b.f64115b.mo45123a(EnumC27087aj.ACCEPTED);
                        return;
                    case 4:
                        this.f64111b.f64115b.mo45123a(EnumC27087aj.COMPLETED);
                        return;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        this.f64111b.f64115b.mo45124a(new FatalException("Unexpected FAILED install status without error."));
                        return;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        this.f64111b.f64115b.mo45123a(EnumC27087aj.CANCELLED);
                        return;
                    default:
                        C27086ai aiVar2 = this.f64111b.f64115b;
                        StringBuilder sb = new StringBuilder(38);
                        sb.append("Unexpected install status: ");
                        sb.append(i2);
                        aiVar2.mo45124a(new FatalException(sb.toString()));
                        return;
                }
            } else {
                this.f64111b.f64115b.mo45124a(new FatalException("Unexpected REQUIRES_UI_INTENT install status without an intent."));
            }
        }
    }

    BinderC27094c(RunnableC27096e eVar, AtomicBoolean atomicBoolean) {
        this.f64111b = eVar;
        this.f64110a = atomicBoolean;
    }
}
