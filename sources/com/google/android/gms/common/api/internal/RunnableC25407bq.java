package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.bq */
public final class RunnableC25407bq implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ BinderC25408br f60281a;

    static {
        Covode.recordClassIndex(30806);
    }

    public final void run() {
        this.f60281a.f60285c.mo41629b(new ConnectionResult(4));
    }

    RunnableC25407bq(BinderC25408br brVar) {
        this.f60281a = brVar;
    }
}
