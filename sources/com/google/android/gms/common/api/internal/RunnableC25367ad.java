package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.ad */
public final class RunnableC25367ad implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C25368ae f60174a;

    static {
        Covode.recordClassIndex(30766);
    }

    public final void run() {
        this.f60174a.f60178d.cancelAvailabilityErrorNotifications(this.f60174a.f60177c);
    }

    RunnableC25367ad(C25368ae aeVar) {
        this.f60174a = aeVar;
    }
}
