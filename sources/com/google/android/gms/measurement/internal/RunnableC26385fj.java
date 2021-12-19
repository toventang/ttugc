package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.measurement.internal.fj */
final /* synthetic */ class RunnableC26385fj implements Runnable {

    /* renamed from: a */
    private final BinderC26382fg f62029a;

    /* renamed from: b */
    private final zzn f62030b;

    /* renamed from: c */
    private final Bundle f62031c;

    static {
        Covode.recordClassIndex(31807);
    }

    RunnableC26385fj(BinderC26382fg fgVar, zzn zzn, Bundle bundle) {
        this.f62029a = fgVar;
        this.f62030b = zzn;
        this.f62031c = bundle;
    }

    public final void run() {
        BinderC26382fg fgVar = this.f62029a;
        zzn zzn = this.f62030b;
        fgVar.f62022a.mo43476d().mo43084a(zzn.f62590a, this.f62031c);
    }
}
