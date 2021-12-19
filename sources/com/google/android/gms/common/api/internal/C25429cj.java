package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C25565r;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.cj */
public final class C25429cj {

    /* renamed from: a */
    public final int f60338a;

    /* renamed from: b */
    public final ConnectionResult f60339b;

    static {
        Covode.recordClassIndex(30828);
    }

    C25429cj(ConnectionResult connectionResult, int i) {
        C25565r.m49314a(connectionResult);
        this.f60339b = connectionResult;
        this.f60338a = i;
    }
}
