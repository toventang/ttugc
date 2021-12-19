package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.C25565r;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;

/* renamed from: com.google.android.gms.measurement.internal.ju */
public final class C26505ju {

    /* renamed from: a */
    final Context f62390a;

    static {
        Covode.recordClassIndex(31927);
    }

    public C26505ju(Context context) {
        C25565r.m49314a(context);
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        C25565r.m49314a(applicationContext);
        this.f62390a = applicationContext;
    }
}
