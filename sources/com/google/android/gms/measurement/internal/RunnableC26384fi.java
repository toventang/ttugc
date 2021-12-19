package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.C25565r;

/* renamed from: com.google.android.gms.measurement.internal.fi */
final class RunnableC26384fi implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzn f62027a;

    /* renamed from: b */
    private final /* synthetic */ BinderC26382fg f62028b;

    static {
        Covode.recordClassIndex(31806);
    }

    public final void run() {
        this.f62028b.f62022a.mo43484k();
        C26498jo joVar = this.f62028b.f62022a;
        zzn zzn = this.f62027a;
        joVar.mo43015p().mo43002c();
        joVar.mo43481h();
        C25565r.m49316a(zzn.f62590a);
        joVar.mo43474c(zzn);
    }

    RunnableC26384fi(BinderC26382fg fgVar, zzn zzn) {
        this.f62028b = fgVar;
        this.f62027a = zzn;
    }
}
