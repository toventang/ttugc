package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.C25565r;

/* renamed from: com.google.android.gms.common.api.internal.i */
public class C25457i {

    /* renamed from: a */
    public final Object f60447a;

    static {
        Covode.recordClassIndex(30856);
    }

    public C25457i(Activity activity) {
        C25565r.m49315a(activity, "Activity must not be null");
        this.f60447a = activity;
    }
}
