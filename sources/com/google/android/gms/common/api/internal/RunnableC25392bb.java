package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.C25450f;

/* renamed from: com.google.android.gms.common.api.internal.bb */
final class RunnableC25392bb implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ConnectionResult f60264a;

    /* renamed from: b */
    private final /* synthetic */ C25450f.C25451a f60265b;

    static {
        Covode.recordClassIndex(30791);
    }

    public final void run() {
        this.f60265b.mo41581a(this.f60264a);
    }

    RunnableC25392bb(C25450f.C25451a aVar, ConnectionResult connectionResult) {
        this.f60265b = aVar;
        this.f60264a = connectionResult;
    }
}
